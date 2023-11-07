package ObjectClass;

class student extends Object {

    String name = "Sunny";
    int age = 25;

    void run() {

    }

    void eat() {

    }

}

public class Main extends student {

    public static void main(String[] args) {

        Main obj = new Main();
        student s = new student();

        // These are used for multi threading
        Object o1 = new Object();
        Object o2 = o1;
        System.out.println(o1.equals(o2) + "\n");

        System.out.println(o1.hashCode() + "\n" + o2.hashCode() + "\n");

        System.out.println(o1.toString() + " \n" + o1 + "\n");
        // Object value is same to "toString" method

        // Exhibit the class that specific object is related to
        System.out.println(o1.getClass() + "\n" + s.getClass());

    }
}
