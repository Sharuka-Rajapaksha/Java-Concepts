package MultiThreading2;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome");
            // Create a delay for the code
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");

            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }

        b.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }

    }
}
