package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nWelcome to the Java LinkedList\n");
        
        //This is a Generic type class AND Using Integer wrapper class
        LinkedList<Integer> arr = new LinkedList(List.of(1,2,3,4,5,6,12));
        
      //  arr.add(12);

        //This is for just set the values for the Linked List BUT when creating the OBJECT for the LinkedList it already assign to the values to the array as of above
        arr.set(0, 1);
        arr.set(1, 2);
        arr.set(2, 3);
        arr.set(3, 4);
        arr.set(4, 5);

        System.out.println("1. Array for the LinkedList: " + arr );
        
        System.out.println("\n2. Is the number 12 is in the Array? (True/ False)" + arr.contains(12));

        //Get the value for the relevant index
        System.out.println("\n3. Value of the index 2 is: " + arr.get(2));

        //Get the index from the given value
        System.out.println("\n4. Index of the value 12 is: " + arr.indexOf(12));

       System.out.println("\n5. Multiply the all the values in the Array by 10");
        arr.forEach(n->System.out.println(n*10));

        System.out.println("\n6. Did several mathematics equations for the Array: ");
        
        arr.forEach(n -> {
        
        System.out.println(n); 
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}

        System.out.println(n*100);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){        
        }
    
    });

        System.out.println("End of the LinkedList");
    }
       
}
