
class sample
{
 int roll;
 String name;
 float fee;

 sample (int roll,String name,float fee)
 {
    this.roll = roll;
    this.name = name;
    this.fee  = fee;

 }
 void display()
    {System.out.println(roll+" "+name+" "+fee);}  
}

 public class Main
 {
 public static void main (String args[])
 {
    sample s1 = new sample (12,"abs",230); 
    s1.display();
 }
}