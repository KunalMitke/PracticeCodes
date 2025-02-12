

public class duplicate {
    
    public static void main(String[] args) {
        int[] arr = {12, 34, 47, 56, 34, 90, 9, 47, 12};  
     //   int[] ar = {10,20};
       // for (int k = 0;k<2;k++)
        //{
          //  System.out.println("The element is: " + arr[k] );

        //}

        //int[] newarr= arr[0] ;
        //int temp = arr[0]; 
        
              for (int i= 0; i < arr.length; i++) {
                for(int j = i+1;j<arr.length;j++)

            
             if (arr[i] == arr[j] ) 
            {  
                System.out.println("The duplicate element is: " + arr[j] );
               // arr[i] = remove(arr,i);
             /* */  int[] ar = {10,20};
             for (int k = 0;k<2;k++)
        {
            System.out.println("The element is: " + arr[k] );

        }

                 
                 //temp++;  
                                                         
            }
           
           // System.out.println("The ARRAY element are : " + arr[i]); 

        }
        
    }
} 

