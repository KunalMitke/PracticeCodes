public class maximum {
    public static void main(String[] args) {
        int[] arr = {12, 56, 34, 90, 9, 47};  
        
        int maxElement = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {  
                maxElement = arr[i];   
            }
        }
        
        System.out.println("The largest element is: " + maxElement);
    }
} 
