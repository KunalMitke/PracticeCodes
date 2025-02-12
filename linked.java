import java.util.LinkedHashMap;
import java.util.Map;

public class linked
{
 public static void main(String[] args) {
    LinkedHashMap <Integer ,String > hm = new LinkedHashMap<>();
    hm.put(1, "shuttu");
    hm.put(2, "num num");
    hm.put(3, "tuttuu");
    hm.put(4, "bukkubukku");
    for(Map.Entry<Integer , String>entry : hm.entrySet()){
        
    
        System.out.println(entry.getKey()+ " " +entry.getValue());

    }
 }    
}
