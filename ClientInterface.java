import java.util.*;

interface Client {
    void input();
    void output();
}

public class ClientInterface implements Client {
    private String name;
    private int age;

    public void input() {
        System.out.println("Enter the age:");
        System.out.println("Enter the name:");
        Scanner sc = new Scanner(System.in);

       // System.out.println("Enter the age:");
        age = sc.nextInt();
       // sc.nextLine(); 
        
        //System.out.println("Enter the name:");
        name = sc.nextLine();
    }

   
    public void output() {
        System.out.println("The Age is : "   + age);
        System.out.println("The Name is : "   + name);

    }

    public static void main(String[] args) {
        Client c1 = new ClientInterface();
        c1.input();
        c1.output();
    }
}
