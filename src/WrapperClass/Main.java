package WrapperClass;

public class Main {

    public static void main(String[] args) {

        String x = "Java";
        Integer y = 20;
        Double z = 3.3;
        Boolean b = true;

        Integer a = null;

        // By using wrraper class can convert primitive data type for wrapping object
        // known as
        // boxing and wrapping
        int c = 78;
        Integer lk = Integer.valueOf(c); // boxing, wrapping
        System.out.println(" ***** Various Wrapping objects *****\n");
        System.out.println("1. Value of Integer wrapping object is: " + lk);
        // Integer aa = c (This is a wrapping object)
        Integer aa = c; // auto boxing, auto wrapping
        System.out.println("2. Value of Integer auto wrapping object is: " + lk);

        Integer d = 3; // This is a object in a wrapper class
        int e = d.intValue(); // Unboxing, unwrapping
        System.out.println("3. Value of Integer unwrapping object is:" + e);

        int f = d; // auto unboxing, auto unwrapping
        System.out.println("4. Value of Integer auto unwrapping object is: " + f);

        System.out.println("\n ***** End of Integer Wrapping class *****\n");

        double g = 1.2;
        Double h = Double.valueOf(g);
        System.out.println("1. Value of Wrapping object is: " + g);

        Double i = g;
        System.out.println("2. Value of Double auto boxing is: " + i);

        Double j = 4.3;
        double k = j.doubleValue();
        System.out.println("3. Value of Double unwrapping is:" + k);

        double l = j;
        System.out.println("4. Value of Double auto unwrapping is: " + l + "\n");

    }

}
