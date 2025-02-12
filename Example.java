import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
       // map.put("abhi",2);
        map.put(34,"sarry");
        map.put(15,"saurya");
        map.put(55,"mkdir");
        map.put(45,"ROHITMAN");
        System.out.println(map);
        //System.out.printl(map.wait());
        // map.get(120);s
        System.out.println(map.isEmpty());
        System.out.println( map.get(45));

        System.out.println(map.containsValue("saurya"));
        System.out.println(map.containsKey(133));
        map.putIfAbsent(103, "Gaurav"); 
        map.remove(55);   
        System.out.println(map);
        

         for(Map.Entry m:map.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
        
        // for (String i:map.values())
        // {
        //     System.out.println(map.get(i));
         
        // }
        // fruitMap.put("Apple", 10);
        // fruitMap.put("Banana", 20);
        // fruitMap.put("Orange", 15);

        // System.out.println("Quantity of Apples: " + fruitMap.get("Apple")); 
        // if (fruitMap.containsKey("Banana")) {
        //     System.out.println("Bananas are available.");
        // }

        // fruitMap.remove("Orange");

        // for (String fruit : fruitMap.keySet()) {
        //     System.out.println(fruit + " => " + fruitMap.get(fruit));
        // }
    }

}