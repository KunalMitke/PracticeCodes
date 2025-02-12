import java.util.*;

public class Sta
{
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(5);
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(7);
        st.push(8);
        st.push(45);
        st.push(10);

       System.out.println( st.capacity());
      // System.out.println(st.pop());
        System.out.println(st);
        System.out.println("enter the number for addition");
        Scanner sc = new Scanner(System.in );

      int num = sc.nextInt();

      for (int i = 0; i<st.size()-1;i++)
      {
        for(int p = 1;p<st.size();p++){
           // if(st[i]+st[p]==num){}


    }
    
}
    }
}