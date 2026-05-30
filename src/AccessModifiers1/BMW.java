package AccessModifiers1; //same package

/**
 * Refer this to check the access of modifiers of
 * Same package subclass
 * It means in the same package - create the subclass of the CAR class and then try to access from the subclass object
 *
 */
public class BMW extends Car{ // BMW is a child of Car class // subclass
    public static void main(String[] args) {
        BMW b = new BMW();
        //So now with b which methods we can access
        //We can access all the property except PRIVATE properties

        b.name="Dhaval";
        b.price=2000;
       // b.mileg=45; // This is private property so we can not access it
        b.color="black";

    }
}
