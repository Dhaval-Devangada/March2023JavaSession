package OOP_Inheritance;

/*
Program no - 2
Java_20_OOP_Inheritance_Parent_ChildClass_MethodOverriding_RefTypeCheck_Top_Down_Casting
*/
public class BMW extends Car{ // To create parent and child relationship we need to use "extends" keyword. So BMW is extending CAR. So BMW is child of CAR class and CAR class is parent.
    // method overriding: Polymorphism (RunTime/dynamic)
    // when we have a method in parent class and the same method in child class
    // with:
    // the same name
    // the same number of parameters
    // the same sequence/order of the parameters
    // the same return type

    //How to prove that given method is overriden?
    //There is a special annotation - Override
    //It is not mendetory to write, but it's a good practice to differentiate between normal method and overriden method

    @Override
    public void start() {
        System.out.println("BMW -- start");
    }

  /*  @Override
    public void engine() {
        System.out.println("BMW -- turbo engine");
    }
*/
    // individual method
    public void autoParking() {
        System.out.println("BMW -- auto parking");
    }

    public void gear(){
        System.out.println("BMW -- automatic gear");
    }

    //Below method are  the part of video "Java_21_RunTimePolymorphism_FinalClass_Methods_MethodOverriddingRules_OOP_Abstraction_InterfaceConcept.mp4"

    public void speedometer(){
        System.out.println("BMW -- Advance speedometer with digital dispaly");
    }

    // method hiding -- when you try to have the same parent class static method in
    // the child class
   // @Override
    public static void billing() {
        System.out.println("BMW - billing");
    }

    // individual private method
    // this is not method hiding
    // @Override
    private void privateMethodTesting() {
        System.out.println("BMW -- testing");
    }

    //below "power()" is already declared in "CAR" class with "final" keyword so we can not override it in child(BMW) class
    //When you uncomment below method then it will give you error
 /*   public final void power() {
        System.out.println("car -- power");
    }*/


    //reverseSystem() is there in CAR as declared as final
 /*   public final void reverseSystem() {
        System.out.println("car -- reverseSystem");
    }*/

    //ABS() is declared as final and static in CAR(Parent) class
 /*   @Override
    public final static void ABS() {
        System.out.println("BMW -- ABS");
    }*/

    /**
     * private and static - method hiding
     */
    private static void parkingSystem(){
        System.out.println("BMW- private and static-parkingSystem");
    }
    public void accessPrivateStaticParkingSystemMethodViaPublic(){
        parkingSystem();
    }

}
