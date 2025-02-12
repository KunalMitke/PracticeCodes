import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    //a.addFirst(9);
    a.set(2,8); 
    a.remove(0);
    System.out.println(a);
    System.out.println(a.contains(3));
    System.out.println(a.size());

}
}