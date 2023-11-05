package Interface;

//Abstract Class - Can have one or more methods inside a Abstract Class
//Abstract Method - No any content in the method body OR Can have nomal methods inside a abstract method.
//Can't create objects inside the Abstract Class

//Interface Method - No any content inside the methods
//Can't create objects inside the Interface class

public interface Student {

    void eat();

    void drink();

    void run();

    /*
     * Check this method it gives errors because Abstract class scenario
     * void run2(){}
     */

    // inside of an Interface class don't need to use "Final" for variables because
    // ot already create as a Final
    int numb = 10;
    String name = "hello";

}
