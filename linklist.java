import java.util.LinkedList;

public class linklist{
    public static void main(String[] args) {
        LinkedList <Integer> lk = new LinkedList<>();
        lk.add(3);
        lk.add(2);
        lk.add(34);
        lk.add(10);
        lk.add(9);
        lk.addLast(90);
        lk.getFirst();
        lk.addLast(29);
        lk.getLast();
        lk.pop();

        System.out.println(lk);
        System.out.println( lk.pop() );
        System.out.println( lk.getFirst() );
        System.out.println(  lk.getLast() );
        System.out.println(lk.peek());
    }
}