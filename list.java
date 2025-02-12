 import java.util.ArrayList;


 public class list {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         
         list.add(10);
         list.add(22);
         list.add(33);
         list.add(22);
         list.add(49);
         list.add(51);
         list.add(51);
         list.add(60);
 
         System.out.println("Original List: " + list);
 
         ArrayList<Integer> uniqueList = new ArrayList<>();
         for (int num : list) {
             if (!uniqueList.contains(num)) {
                 uniqueList.add(num);
             }
         }
 
         System.out.println("List after removing duplicatesand store in another list: " + uniqueList);
     }
 }
 