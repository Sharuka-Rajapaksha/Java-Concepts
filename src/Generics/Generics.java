package Generics;

class A<T> {
    void print(T x) {

        T y = (T) x;
        System.out.println(y);
    }

}
/*
 * 
 * public class Generics {
 * 
 * public static void main(String[] args) {
 * 
 * A<Integer> obj1 = new A();
 * obj1.print(2);
 * 
 * A<String> obj2 = new A();
 * obj2.print("String in Generics");
 * 
 * A<Double> obj3 = new A();
 * obj3.print(343.454);
 * 
 * }
 * 
 * }
 * 
 */