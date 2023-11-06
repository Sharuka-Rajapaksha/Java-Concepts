package ErrorHandling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x, y, z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        x = sc.nextInt();

        System.out.println("Enter the second number: ");
        y = sc.nextInt();

        z = x + y;
        int a = x - y;
        int b = x * y;
        int c = x / y;

        System.out.println("1. Total is: " + z);
        System.out.println("2. Sub: " + a);
        System.out.println("3. Multiple: " + b);
        System.out.println("4. Division: " + c);

    }
}
