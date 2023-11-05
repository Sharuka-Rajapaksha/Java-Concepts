package thisKeyword;

public class student {

    String name;
    int age;

    // THis is a constructor - No return type in Constructor and the name of the
    // constructor is same as Class name
    // If we are not using "this" keyword then we have to use the other variable name
    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        student obj = new student("Sunny", 25);
        System.out.println("Name of the Coder is: " + obj.name);
        System.out.println(obj.name + " is " + obj.age + " years old");
    }
}
