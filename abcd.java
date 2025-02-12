import java.util.*;
public class abcd {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in );
      System.out.print("Enter the number of elements: ");
     int n = sc.nextInt();

  // Step 2: Declare an array of size n
    int[] arr = new int[n];

  // Step 3: Take input and store in array
     System.out.println("Enter " + n + " numbers:");
     for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
}

// Step 4: Display the stored numbers
System.out.println("You entered:");
for (int num : arr) {
    System.out.print(num + " ");
}

    
}
}