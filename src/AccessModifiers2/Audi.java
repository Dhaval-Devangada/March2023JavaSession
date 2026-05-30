package AccessModifiers2; //different package


import AccessModifiers1.Car;

/**
 * Refer this to check the access of modifiers of
 * Different package subclass
 * It means in the different package - create the subclass of the CAR class and then try to access from the subclass object
 *
 */
public class Audi extends Car {

    public static void main(String[] args) {
        Audi audi = new Audi();

        //So now with audi which methods we can access
        //We can access PROTECTED and PUBLIC properties
        //We can not access DEFAULT and PRIVATE

        audi.name="Dhaval";
        audi.price=2000;
        // audi.mileg=45; // This is private property so we can not access it
        //audi.color="black"; //This is default property so we can not access it
    }

}
