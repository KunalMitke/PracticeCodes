import java.util.*;
import java.io.*;

public class palindrom {
    public static void main(String[] args) {
         String name ;
         String rev = "";
         Scanner sc = new Scanner(System.in );
         System.out.println("enter the name");
         
         name = sc.next();

          for(int i = name.length()-1; i>=0; i--)
         {System.out.println(rev);
             rev =rev+name.charAt(i) ;
            }
            System.out.println(rev);
             if(rev.equals(name))
             {
                System.out.println("the String is palindrom");
             }
             else
             {
                System.out.println("the String is not a palindrom");
             }
         }

    }


