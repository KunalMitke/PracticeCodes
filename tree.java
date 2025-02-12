import java.util.*;
public class tree {  
    public static void main(String[] args) {  
        TreeMap<Integer, String> studentMap = new TreeMap<>();  
    
        studentMap.put(1003, "Michal ");  
        studentMap.put(1001, "John Sh");  
        studentMap.put(1002, "kk ");  
        studentMap.replace(1003,"avinash");
        System.out.println("Student Records:");  
        System.out.println(studentMap.get(1002));
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {  
            System.out.println("ID:) " + entry.getKey() + ", Name: " + entry.getValue());  System.gc();
           }  
    }  
}  