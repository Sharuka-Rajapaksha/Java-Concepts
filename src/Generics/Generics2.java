package Generics;

public class Generics2<T> {

    // Normal array
    // String[] a = new String[3];

    // Creating a Generic type array for Data type T
    // Create an array fron Generics - When create array with Generics need to
    // create it to store objects
    // And need to type cast as a T array

    T[] arr = (T[]) new Object[3];

    public static void main(String[] args) {
        /*
         * Object arr[] = new Object[3];
         * 
         * arr[0] = 23;
         * arr[1] = 12;
         * arr[2] = "Hello";
         * 
         * for (int i = 0; i < 3; i++) {
         * int number = (Integer) arr[i];
         * System.out.println(number);
         * }
         */

        // You're allowed to pass data to an array, you only can pass the data according
        // to the variable.
        // Here we don't need tp dp type casting because from the above it automatically
        // do the type casting

        try {
            Generics2<Integer> obj = new Generics2();

            obj.arr[0] = 23;
            obj.arr[1] = 45;
            obj.arr[2] = 34;

            int a = obj.arr[0];
            System.out.println(a);

            for (int i = 0; i < 4; i++) {
                int number = obj.arr[i];
                System.out.println(number);
            }
        } catch (ClassCastException e) {
            System.out.println(e);
        }

    }

}
