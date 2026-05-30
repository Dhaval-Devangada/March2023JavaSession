package AccessModifiers2;//Different package

import AccessModifiers1.Car;

/**
 * Refer this to check the access of modifiers of
 * Different package non-subclass
 * It means in the different package - create the non-subclass and then try to access from the parent class object
 *
 */
public class Bike {
    public static void main(String[] args) {
        //Here we are not creating the object of "bike" class - because bike is not associated with the CAR

        Car car = new Car();

        //So now with car which methods we can access
        //We can access only PUBLIC property and all other [default,private,protected] properties are restricted
        //Because you are in the different package and you are in the sub-class also

        car.name="Dhaval"; //This is public property so this is allowed
        //car.price=2000;
        // b.mileg=45; // This is private property so we can not access it
        //car.color="black";

    }
}
/**
 * So how to remember access of the access modifiers
 *
 * Remember two things
 * Same package
 * Different package
 *
 * Same class - everything is allows - so don't need to remember
 * public - allowed everywhere - so don't need to remember
 * private - everywhere/everything is restricted - except the same class
 * protected - allowed everywhere excepted when you go out of the package and non-sub class. This is exactly like public but the moment you go out of the package and non-sub class then not allowed
 * default - Only and only work/allowed within the same package [doesn't matter sub or non-subclass]
 *
 * So technically we just need to remember default
 *
 * Same rules applies for the methods as well
 */