

public class element {
    public static void main(String[] args) {
        int[] arr = {12, 34, 47, 56, 34, 90, 9, 47, 12};  
        //int []a= removeDuplicates(arr);
         int index=0;
           // for (int p = 0; p <arr.length; p++) {
                
           // }
        
        for (int i= 0; i < arr.length; i++) {
            for(int j = i+1;j<arr.length;j++)

            
            if (arr[i] == arr[j] ) 
            {  
                 System.out.println("The duplicate element is: " + arr[j]);
                 System.out.println( );
                 int n = arr.length;
                 int[] temp = new int[n];
                 for (int t = 0; t< n; t++) {
                    boolean isDuplicate = false;
        
                    // Check if element is already present
                    for (int h = 0; h< index; h++) {
                        if (arr[i] == temp[h]) {
                            isDuplicate = true;
                            break;

                        }
                        }
                     if (!isDuplicate) {
                temp[index++] = arr[t];
            }
        // } int[] uniqueArray = new int[index];
        // for (int p = 0; p < index; p++) {
        //     uniqueArray[p] = temp[p];
        
        //       return;

        //   }

                /* for (int p = 0; p < j; p++) {
                    a[0] = arr[0];
                    System.out.println("The  element p: " + a[p] );
                 for (int p = 0; p < arr.length; p++) {
                    a[p] = arr[j];
                    System.out.println("The  element is: " + a[p] );*/

                     
                 }
              /*   for (int p = 0; p < 3; p++)
                { 
                    if(a[p] == arr[j])
                    {
                        System.out.print("The  element of a: " + a[p] );
                    }
*/
                    

                } 
    }
}
           
}                

                /*int[] arrr = {20,30,21,13};
                for (int n= 0; n < arr.length; n++) {
                    if 
                    System.out.println("the array elements are" + " " + arrr[n]);

                } */
            

                    
        