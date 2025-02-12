
import java.util.Arrays;

public class copy{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 5, 6};

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] temp = new int[n]; // Temporary array to store unique elements
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if element is already present
            for (int j = 0; j < index; j++) {
                if (array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, store it
            if (!isDuplicate) {
                temp[index++] = array[i];
            }
        }

        // Copy only unique elements into a new array
        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }
}