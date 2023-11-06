package SuperKeyword.Constructors;

import Encapsulation.student;

class Student {
    int age;
    String school;
    String email;

    // Constructor class
    Student(int age, String school, String email) {
        this.age = age;
        this.school = school;
        this.email = email;
    }
}

class Student1 extends Student {

    int marks;

    // Constructor class
    Student1(int age, String school, String email, int marks) {
        super(age, school, email); // Same scenario as Student constructor this.age = age;
        this.marks = marks; // Need to call this second beccause first Sub class call the Parent Class's
                            // constructor. If put Sub class unique variables earlier then it occurs for an
                            // error.
    }
}

public class SuperCons {
    public static void main(String[] args) {

        Student1 obj = new Student1(25, "AAA", "asas@gmail.com", 98);
        System.out.println(" Age of first student is: " + obj.age + "\n School name: " + obj.school
                + "\n Email of the first student is: " + obj.email + "\n Marks:" + obj.marks);
    }
}
