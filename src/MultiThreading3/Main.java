package MultiThreading3;

import java.util.Scanner;


class Display {

    //Synchronized Method
    //synchronized void print() {

        public void print(){
        Thread t = Thread.currentThread();
        //Thread t3 = Thread.currentThread();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = sc.nextInt();

        if(x <= 5 ){
                synchronized(this){ //Synchronize only a part
                    for (int i = 0; i < 5; i++)
                {
                    System.out.println(t.getName());
                        try{
                            Thread.sleep(1000);
                        } 
                        catch (Exception e){

                        }
                }
                }
        }
        else{
            System.out.println("Warning: Input is Greater than 5!");
        }
    }
}

class T extends Thread {

    //Objects
    //Display Tc;
    Display Tc = new Display();

    //Constructor
    T(Display c) {
        this.Tc = c;
    }

    public void run() {
        Tc.print();
    }

}

public class Main {

    public static void main(String[] args) {

       Display obj = new Display();
       T t1 = new T(obj);
       T t2 = new T(obj);

        t1.start();
        t2.start();

        System.out.println("1. Current Thread name is: " + Thread.currentThread().getName());
        System.out.println("2. Current Thread Id is: " + Thread.currentThread().getId());
        System.out.println("3. Current Thread state is: " + Thread.currentThread().getState());
        System.out.println("4. Current Thread group is:" + Thread.currentThread().getThreadGroup());
       
    }
}
