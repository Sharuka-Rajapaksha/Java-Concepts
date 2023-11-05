package Interface;

import Encapsulation.student;

public class Parent implements Student {

    public void eat() {
        System.out.println("Eating");
    }

    public void drink() {
        System.out.println("Drinking");
    }

    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {

        System.out.println("Calling for the methods in the Parent class");
        Parent obj = new Parent();
        obj.eat();
        obj.drink();
        obj.eat();

        System.out.println("\n");

        System.out.println("Calling the methods in the Interface Class");
        Student obj2 = new Parent();
        obj.eat();
        System.out.println(obj2.numb);
        System.out.println(Student.numb);

    }
}
