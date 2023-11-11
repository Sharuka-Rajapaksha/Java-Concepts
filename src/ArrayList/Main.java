package ArrayList;

import java.util.ArrayList;
//import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList (10);
       
        arr.add(12);
        arr.add(30);
        System.out.println(arr+"\n");

        arr.add(0, 99);
        arr.add(3,45);
        System.out.println(arr+"\n");

        //Change the index 3 value from 45 to 56
        arr.set(3,56);
        System.out.println(arr + "\n");

        //Check if the give number is in the array or not
        System.out.println(arr.contains(30));
        System.out.println(arr.contains(34) + "\n");

        arr.set(2, 56);
        //Get the valaue for the given index
        System.out.println(arr.get(2));

        System.out.println("\nIndex of value 56 is: " + arr.indexOf(56));

        System.out.println("\nSize of the array is: " + arr.size() + "\n");

        System.out.println("1. First way to get Values of the Array in order: ");
        //Access to the all the elements in the array one by one        
        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }
         

        System.out.println("\n2. Second way to get Values of the Array in order: ");
        for(Integer x: arr){        //Values of the array named arr equal to the x one by one
            System.out.println(x);
        }

        System.out.println("\n3. Third way to get the Values of the Array in order: ");
        arr.forEach(y -> System.out.println(y));

    }
}
