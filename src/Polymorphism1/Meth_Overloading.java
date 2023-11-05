package Polymorphism1;

//In the method overloading we can create couple of methods with same name and call all these same named methods with one object.
public class Meth_Overloading {

    public void meth() {
        System.out.println("Method 1");
    }

    public void meth(int x) {
        System.out.println("Method 2");
    }

    public void meth(double x) {
        System.out.println("Method 3");
    }

    public static void main(String[] args) {

        Meth_Overloading obj = new Meth_Overloading();
        // obj.meth();
        // obj.meth(12);
        obj.meth(10);
    }

}
