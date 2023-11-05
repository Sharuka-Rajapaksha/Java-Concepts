package Polymorphism2;

public class child extends Parent {

    // This is method overriding

    public void phone() {
        System.out.println("Child phone is nokia");
    }

    public static void main(String[] args) {
        child obj = new child();
        obj.phone();
    }
}
