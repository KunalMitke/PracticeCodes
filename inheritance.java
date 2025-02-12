    class grandp {

    int a = 36;
}
class parent extends grandp {

    int b =30;
    void show(){
    System.out.println("value is " +b);
    System.out.println (super.a);

    }
}
class inheritance {
    public static void main(String[] args) {
        parent p = new parent();
        p.show();
        
    }
}