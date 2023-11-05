package Abstract;

public class Class2 extends Class1 {

    void method2() {
        System.out.println("Calling for Class2");
    }

    void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        Class2 obj = new Class2();
        obj.method2();
        obj.run();
    }
}
