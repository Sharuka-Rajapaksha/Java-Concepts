package SuperKeyword;

class A {
    int x = 10;
}

class B extends A {
    int x = 15;

    public void print() {
        System.out.println("This is method Print in the Class B: " + super.x); // Now the X is call the value from
                                                                               // Parent class because of Super Keyword
        // Super keyword is use for call to the variables created in Parent class from
        // the sub class
    }
}

public class Main {

    public static void main(String[] args) {

        B obj = new B();
        // System.out.println("Value of the Integer X in class A is:" + obj.x);
        obj.print();
    }
}
