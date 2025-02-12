
import java.util.*;

public class Thirdlarge {
    
    public static void main(String args[])
    {   int arr [] = {1,2,4,9,12};
    int max = 0;

     for (int i = 1; i < arr.length; i++){  
         max = max = Math.max(max, arr[i]); 


}         System.out.println("Maximum number in array: " + max);

           Arrays.sort(arr);

           System.out.println("the third large element in array is :" + arr[arr.length-3]);


}
}