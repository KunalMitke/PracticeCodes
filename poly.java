   class parent  {
    void draw()
    {
        System.out.println("it is father");

    }

}
class child extends parent  {

    void draw()
    {
        System.out.println("it is a child");

    }
}

class poly 
{
    public static void main(String[] args) {
        parent f1 = new child();
        f1.draw();
        }
}
