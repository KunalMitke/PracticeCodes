import java.util.Scanner;

public class Array2 
{
 
    public static void main(String args[])
{   int a [] = {1,2,4,9};
    try (Scanner sc = new Scanner(System.in )) {
        System.out.println("enter the number for addition");
          int num = sc.nextInt();

          for (int i = 0; i<a.length-1;i++)
          {
            for(int p = 1;p<a.length;p++){
                if(a[i]+a[p]==num)

{
        System.out.println(a[i]+" " +" "+ a[p] );

            // System.out.println(get(a[i])" "a[p]);
}
            }
          
          }
    }
   }}




