  import java.util.Scanner;

public class odd {
    public static boolean isPalindromeEvenIndex(String str) {
        StringBuilder evenIndexChars = new StringBuilder();
        
        for (int i = 0; i < str.length(); i += 2) {
            evenIndexChars.append(str.charAt(i));
        }
        
        String original = evenIndexChars.toString();
        String reversed = evenIndexChars.reverse().toString();
        
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        String testStr = "abccba";
        
        if (isPalindromeEvenIndex(testStr)) {
            System.out.println("Characters at even indices form a palindrome.");
        } else {
            System.out.println("Characters at even indices do not form a palindrome.");
        }
    }
}
 
    

