
import java .util.*;
public class addition {
   
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter a long number: ");
            long num = sc.nextInt();
            long sum = 0;
            while (num != 0) {
                sum += num % 10; 
                num /= 10; 
            }
    
            System.out.println("Sum of digits: " + sum);
        }
    }
    