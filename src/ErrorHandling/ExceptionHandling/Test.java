package ErrorHandling.ExceptionHandling;

import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the irst number: ");
            int a = sc.nextInt();

            System.out.println("\nEnter the second number: ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("\nThe result is: " + c);
            System.out.println("\nProgram Successfully executed!");
        }

        /*
         * catch (Exception e) {
         * System.out.println(e);
         * System.out.println("Check Error and try again!");
         * }
         */

        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }

        catch (InputMismatchException e) {
            System.out.println("Must enter Integer value");
        }

        catch (Exception e) {

        }

        // Finally block run anyway with OR without exceptions
        finally {
            System.out.println("\nEnd of the Program!\n");
        }

    }

}
