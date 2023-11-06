package SuperKeyword.Methods;

//Using Super keyword in Methods
class A {
    void show() {
        System.out.println("Calling from Show method from Parent Class A");
    }
}

/*
 * Override - Creating same variable in two different classes OR create same
 * method in two different classes
 * While overriding the system read the second varibale or method - TO avoid
 * that can use Super keyword
 */

class B extends A {
    void show() {
        super.show();
        System.out.println("Calling from Show method in Sub class");
    }

}

public class SuperMethods {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();

    }
}
