public class max {

    public static void main (String args[]){

    

    int [] arr = new int[5];

     arr [0] = 10;
     arr [1] = 30;
     arr [2] = 60;
     arr [3] = 70;
     arr [4] = 90;

    int res = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>res) {
            res=arr[i];
        }
    }
    System.out.println(res);
    
  }
}
