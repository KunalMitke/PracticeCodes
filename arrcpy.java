public class arrcpy {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 2, 4, 5, 5, 6};
    
            System.out.println("Original Array:");
            printArray(array);
    
            int[] updatedArray = removeDuplicates(array);
            
            System.out.println("Updated Array after removing duplicates:");
            printArray(updatedArray);
        }
    
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    
        public static int[] removeDuplicates(int[] array) {
            int n = array.length;
            int[] temp = new int[n]; 
            int index = 0;
    
            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
    
                
                for (int j = 0; j < index; j++) {
                    if (array[i] == temp[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
    
               
                if (!isDuplicate) {
                    temp[index++] = array[i];
                }
            }
    
            int[] result = new int[index];
            for (int i = 0; i < index; i++) {
                result[i] = temp[i];
            }
            return result;
        }
    }
    