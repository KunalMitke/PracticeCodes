
  public class even {
    public static boolean Palindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    public static void main(String[] args) {
        String s = "abacba";
        
        if (Palindrome(s)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}


    
// public static boolean isPalindrome(String str) {
//   int left = 0;
//   int right = str.length() - 1;

//   while (left < right) {
//       if (str.charAt(left) != str.charAt(right)) {
//           return false; 
//       }
//       left++;
//       right--;
//   }
//   return true; 
// }

// public static void main(String[] args) {
//   String testStr = "abccba";
  
//   if (isPalindrome(testStr)) {
//       System.out.println(testStr + " is a palindrome.");
//   } else {
//       System.out.println(testStr + " is not a palindrome.");
//   }
// }
