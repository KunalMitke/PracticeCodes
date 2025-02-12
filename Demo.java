import java.util.Scanner;

public class Demo 
{
 
    public static void main(String[] args) {
         String name ;
         String rev = "";
         Scanner sc = new Scanner(System.in );
         System.out.println("enter the name");
         
         name = sc.next();
       //  if ( name.length()%2==0) || name.length() % 2 != 0
         

          for(int i = name.length()-1; i>=0; i--)
         {System.out.println(rev);
             rev =rev+name.charAt(i) ;
            }
            System.out.println(rev);
             if(rev.equals(name) )
             {
               if( name.length() % 2 != 0)
               {
                 System.out.println("the String is not a palindrome");
               }else
                System.out.println("the String is palindrome");
               }
             }
            //   else
            //   {
            //     System.out.println("the String is not a palindrome");
            //   }
            }
              
            
         
         
         // else
         // {
         //    System.out.println("not a palindrome");
         // }
         

      
            

 

