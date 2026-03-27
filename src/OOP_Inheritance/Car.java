package OOP_Inheritance;

/*
Program no - 1
Java_20_OOP_Inheritance_Parent_ChildClass_MethodOverriding_RefTypeCheck_Top_Down_Casting
Refer CAR,BMW and TESTCAR programs Parallely
*/


/**
 * In selenium and in framework everything is about parent and child concept
 * Will see what are the various options availabe in inheritance
 *
 * parent can have n number of child classes, there is no limitiation for that.
 * Can we have multiple parents? - No we can not have it.
 * Child class can have only and only 1 parent class
 * Why it is not allowed? What kind of problem it is?
 * It is a dimond problem. Please refer diagram
 * Dimond Problem: A class is trying to be child of multiple parent classes.
 * In the form of classes, a child can not have multiple parent class but it is allowed in the form of interface.
 * BMW is a car then is a car. It can not be truck or bycycle.
 * BMW can take/inherit all the properties of CAR
 * And BMW can have it's own individual properties as well.
 * BMW can take/inherit all the properties of VEHICAL (grandparent) as well
 * So whaterver the VEHICAL properties are there can be given to CAR and CAR class properties can be given to BMW also.
 * The Grandparents properties and parent properties, we don't need to create those properties inside the child(BMW) class. We directly inherit those properties
 * If we are creating it those properties then what is use of the properties which we have created in the parent and grandparent class.
 * VEHICAL class can have one more parent AUTOMOBILE
 * AUTOMOBILE class can have one more parent MECHANICLE
 * MECHANICLE class can have one more parent AERODYNAMICS
 * AERODYNAMICS class can have one more parent PHYSICS
 * PHYSICS class can have one more parent SCIENCE
 *
 * So VEHICAL is taking some properties from AUTOMOBILE
 * AUTOMOBILE is taking some properties from MECHANICLE
 * MECHANICLE is taking some properties from AERODYNAMICS
 * AERODYNAMICS is taking some properties from PHYSICS
 * PHYSICS is taking some properties from SCIENCE
 *
 * Let's say one property is there in the SCIENCE class and we can use it in my BMW class.
 * We can use the property of AERODYNAMICS class in th BMW class. Because they all are the same family.
 * So this is called MULTI-LEVEL inheritance.
 * MULTI-LEVEL means multiple levels are there in the family.
 * Child(BMW) class can take any property from any upper level without any problem.
 * BMW can take properties from CAR class
 * BMW can take properties from VEHICAL class
 * BMW can take properties from AERODYNAMICS class.
 * BMW can take properties from SCIENCE class.
 *
 *
 * Dimond problem is known as MULTIPLE inheritance.
 * MULTIPLE inheritance is not allowed in the form of classes
 * MULTIPLE inheritance is allowed in the form of interfaces
 *
 * AUDI can not take anything from BMW. It means siblings can not talk to each-other or can not take any properties from each-other
 */

public class Car extends Vehicle{
    // final:
    // 1. constant values
    // 2. to prevent the method overridding
    // 3. to prevent inheritance

    //non-static methods
    public void start() {
        System.out.println("Car -- start");
    }

    public void stop() {
        System.out.println("Car -- stop");
    }

    public void refuel() {
        System.out.println("Car -- refuel");
    }
//Below method are  the part of this video "Java_21_RunTimePolymorphism_FinalClass_Methods_MethodOverriddingRules_OOP_Abstraction_InterfaceConcept.mp4"

    //Can this class override the vehicle class "speedometer()" - YES
    public void speedometer(){
        System.out.println("Car -- Advance speedometer");
    }

    /**
     * Method hiding concept
     */
    //Can we overload the static method? - YES - We have done it using MAIN() method example.
    //Can we override the static method in the child class? or can we override the static method or not?
    //To check that we have created "static billing" method in child(BMW) class
  // If we write the below same method with same signature in child(BMW) class then it will not give error
  //But when we write the "@Overridden" annotation above the method at that time it will give the error.
  //To check please uncomment the "@overridden" annotation which is accosiated with "billing()" in the "BMW" class. It will give an error.
    //So static method can not be overridden
    //Reason is : Polymorphism is associated with object and static is a part of metaspace/CMA and can never be the part of object.So we can not override static method.
    // So this "billing()" is separate billing() of CAR and if we have the "static billing()" in BMW(child) then it is separate "static billing()" of BMW
    //but now we have same "static billing()" in both(CAR and BMW) - both are STATIC and both have same name "Billing()". We have parent and child class relationship as well.
    //So parent and child class + both have static method with same name. so this concept is known as method hiding.
    //method hiding - When you try to have same parent class static method in child class
    // Here we are not hiding anything but though java guys have given name "method hiding"
    // "data hiding" is associated with "encapsulation" where we are having "private instance" variable and public methods
    // "method hiding" is associated with "When you try to have same parent class static method in child class"
    //static method can not be overridden
    // can not be overridden but can be inherited
    public static void billing() {
        System.out.println("car - billing");
    }

    /**
     * Inheritance of static method
     *
     * Below method is to check that, static method can be inherited by child class or not? - YES static can be inherited by JAVA
     * How to check?
     * Don't create "audioSystem" in child(BMW) class and then try to access the "audioSystem()" via BMW ->BMW.audioSystem()
     * If Java can access it that means we can inherit the static methods
     */
    public static void audioSystem(){
        System.out.println("CAR - audio System - Static methods can be inherited by child class");
    }

    /**
     * Below concept is to check that private methods can be overridden or not? - No we can not override private method
     * How to check that private methods are not overridden?
     * - Create the "privateMethodTesting()" in child class (BMW)
     * - Give "@Override" annotation above the "privateMethodTesting()" and check that error is appearing or not?
     * - If error is appearing then it's a proof that 'private method can not be overridden'
     *
     * If we have "private privateMethodTesting()" in both(parent and child class) then it doesn't mean that its is "method hiding" as well
     * If we have "private privateMethodTesting()" in both(parent and child class) that means both have its own individual private method
     *
     */
    private void privateMethodTesting(){
        System.out.println("CAR---testing");
    }

    /**
     * We can call above internal private method in below public method and then we can call below public method in runner class - Encapsulation
     */
    public void privateMethodTestingAccessViaPublic() {
        privateMethodTesting();
    }

    /**
     * If the method is declared with "final" keyword then it can not be overridden
     * To check the error
     * We have created the "final power()" in child(BMW) class. Uncomment it and check the error message
     * So how to prevent method overriding - declare the method with "final" keyword
     *
     *
     * real time example - Display logo method on website/application
     * If we declare the "displayLogo" method as "public" then any child class can change the logo which is not ideal because throughout the application logo will remain the same
      */
    // can not be overridden
    public final void power() {
        System.out.println("car -- power");
    }

    /**
     * Below method is created to check that "final" can be inherited or not?
     * Means - final method can not be overridden, but it can be inherited
     */
    public final void reverseSystem() {
        System.out.println("car -- reverseSystem");
    }

    /**
     * Created below method to check that "final and static" method can be overridden and inherited or not?
     * method is final - so we can not override it in child class
     * method is static - so we can not override it in child class because it will not go into the object. It is a part of meta space/CMA
     * final,static and private - both are preventing method overriding
     *
     */
    public final static void ABS() {
        System.out.println("car -- ABS");
    }

    /**
     * Can we create the method with "private and static" - yes
     * Can we create same "private and static" in BMW(child class) - YES
     * We can create,but then it will be a method hiding - because this is STATIC method. It does not matter that method is private or not.
     * practically we never use this but just for concept understanding
     */
    private static void parkingSystem(){
        System.out.println("CAR- private and static-parkingSystem");
    }
    public void accessPrivateStaticParkingSystemMethodViaPublic(){
        parkingSystem();
    }
}

/**
 * Do we really need to create main method in the CAR or BMW class?
 * Think about it practically ,
 * Tomorrow if we are designing car system , then we are not going to create CAR class MAIN method separately and BMW class MAIN method separately.
 * We will have separate runner class where we will have the main method or caller method
 * And then we can create the object over there
 */