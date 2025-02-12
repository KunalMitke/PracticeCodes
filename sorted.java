import java.util.*;

public class sorted {
    public static void main(String[] args) {
        
    
    SortedMap<Integer ,String> sm = new TreeMap<Integer,String>(); 
        sm.put(10 , "ABC");
        sm.put(11 , "DEF");
        sm.put(12 , "GHI");
        sm.put(13 , "JKL");
        System.out.println("The Sorted Map is :"+sm);
        Iterator <Integer> it = sm.keySet().iterator();       //keyset is a method  
        while(it.hasNext())  
        { 
        int key=(int)it.next();  
        System.out.println("Roll no.: "+key+"     name: "+sm.get(key));  
        }  
        sm.headMap(10);
        System.out.println("The Map is :"+sm.get(12));

    
}
}