import java.util.Vector;

public class vector 
   {public static void main(String[] args) {
    
   
      Vector <Integer> v = new Vector<>();
      v.add(344);
      v.add(55);
      v.add(3);
      v.add(4);
      v.add(30);
     System.out.println(v);
     System.out.println(v.size());
     System.out.println(v.isEmpty());
     v.set(3,444);
     System.out.println(v);
     System.out.println(v.capacity());


   }
   }