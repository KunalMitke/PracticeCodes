
 class shapes1 {


void  shape(){
    System.out.println("it is a parents shape");
}
}
  class circle extends shapes1{
    
     @Override
    void shape(){
        System.out.println("it is a childs shape circle");//methos overriding
    }
  }
  
  public class shapes {
    public static void main(String[] args) {
      circle c = new circle();
      c.shape();
    }
  
    
  }