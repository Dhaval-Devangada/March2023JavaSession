package AccessModifiers1;

/**
 * Refer "Access Modifiers" from "Screenshot" and compare
 */

/**
 * Refer this to check the access of modifiers within the same class   - Same class
 */
public class Car {
    //Having for variable
    public String name;
    protected int price;
    private int mileg;
  //  default String color; //There is no access modifiers like "default",default is designed for method inside the interface, so
    //default access modifier means > no access modifier. like below
    String color;
    //We have created variables with all the java access modifiers

    public static void main(String[] args) {
        Car car = new Car();
        /**
         * 1.Same class
         *
         * default - YES
         * private - Yes
         * protected - Yes
         * public - Yes
         *
         * Within the class we can access all types of access modifiers
         */
        car.name="Dhaval";
        car.price=2000;
        car.mileg=45;
        car.color="black";

    }
}
