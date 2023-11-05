package Abstract;

//Abstract methods means methods with empty body
//We can keep a nomal methods in a abstract class too
//Can't create objects for a Abstract class

abstract public class Class1 {

    abstract void run();

    void method1() {
        System.out.println("Calling for Class1");
    }
}