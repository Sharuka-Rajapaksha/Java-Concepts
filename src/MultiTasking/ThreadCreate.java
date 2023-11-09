package MultiTasking;

/*
 * //Creating Thread class A
class A extends Thread {
    public void run() { // The methhods inside the Thread class shouuld be changed as "run"
        System.out.println("This is class A");
    }
}
 */

//Creating Thread class A
class A implements Runnable {
    public void run() { // The methhods inside the Thread class shouuld be changed as "run"
        System.out.println("This is class A");
    }
}

public class ThreadCreate {
    public static void main(String[] args) {

        A obj = new A();
        // obj.start(); //Create a object for a thread class and only usable with Thread
        // class

        Thread o = new Thread(obj);
        o.start();

        System.out.println("Multi Threading Part 1 is Completed");
    }

}
