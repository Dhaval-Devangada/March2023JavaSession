package AccessModifiers1;

/**
 * Refer "Access Modifiers" from "Screenshot" and compare
 */

/**
 * Refer this to check the access of modifiers of
 * Same package non-subclass
 * It means in the same package - create the non-subclass and then try to access from the non-subclass object
 *
 */
public class Cycle {
    public static void main(String[] args) {
        //Here we are not creating the object of "cycle" class - because cycle is not associated with the CAR

        Car car = new Car();

        //So now with car which methods we can access
        //We can access all the property except PRIVATE properties

        car.name="Dhaval";
        car.price=2000;
        // b.mileg=45; // This is private property so we can not access it
        car.color="black";
    }
}
