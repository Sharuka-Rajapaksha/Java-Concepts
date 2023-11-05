package Encapsulation;

//Encapsulation means hide the functions of a classes fromm other classes. 
//Then other classes can't access to these functions

public class Main {

    public static void main(String[] args) {

        student obj = new student();
        obj.setName("Kamal");
        System.out.println(obj.getname());

        student obj2 = new student();
        obj2.setAge(25);
        System.out.println(obj2.getAge());
    }

}
