package FinalKeyword;

final class parent {
    final public void say() {
        System.out.println("This is Final class parent");
    }
}

/*
 * METHODS: public void say(){}
 * 
 * CLASS: class Test{}
 */

public class Test {

    public static void main(String[] args) {

        // Use "Final" key wrod for the variables, then other can't change the value of
        // that variable
        // Final varibales can't override
        // Final classes can't override too!
        final double g = 9.8;
        System.out.println(g);

        parent obj = new parent();
        obj.say();
    }
}
