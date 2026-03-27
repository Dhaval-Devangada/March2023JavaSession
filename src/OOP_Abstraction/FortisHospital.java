package OOP_Abstraction;


/**
 * Assume that you are the owner of the hospital
 * And I want to open this hospital in the different countries
 * FortisHospital is a class and It is child of interfaces(what type of interfaces-Medicle interfaces)
 * What do you mean by interface? - Try to understand business requirement
 * FortisHospital says that I really want to open hospital in USA,UK,INDIA and BRAZIL
 * BUT US Medical department says that we have certain rules and regulation(For patient,hospital,medicine...) that your hospital should implement/follow then only you can open a branch in the USA
 * BUT UK Medical department says that we have certain rules and regulation(For patient,hospital,medicine...) that your hospital should implement/follow  then only you can open a branch in the UK
 * BUT INDIA Medical department says that we have certain rules and regulation(For patient,hospital,medicine...) that your hospital should implement/follow  then only you can open a branch in the INDIA
 * BUT BRAZIL Medical department says that we have certain rules and regulation(For patient,hospital,medicine...) that your hospital should implement/follow  then only you can open a branch in the BRAZIL
 *
 * Now, its FortisHospital's responsability to implement all the methods of the interfaces
 * Remember that interface never hold any business logic
 * Interface can not define the business logic
 * Interface defines that what kind of business/logic you should have
 * Its your responsability to provide business logic
 * Interfaces just define the rules/regulation/method inside it and those methods should be implement by FortisHospital
 * So FortisHospital will override all the method of US,UK,INDIA,BRAZIL interfaces and logic of those methods will be implemented there
 * So who has to provide business logic now? class / interface? - class
 * We can not mix two interfaces - because rules are different for different countries
 * If tomorrow there are 200 countries then we need to create 200 interfaces
 * Name of the hospital will be the same
 * FortisHospital is always be the child of these multiple interfaces
 * FortisHospital can have it's own individual methods? - YES (We also provide some extra feature - like emergency service)
 * Now, After one year US medical says we have added two more rules. So now what is the responsability of FortisHospital? - FortisHospital needs to implement that new rules. Same goes for UK,US,INDIA
 * Whenever a class is child of interface which keyword we need to use - implements
 */

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical  {

    //FortisHospital is a child of "USMedical" so we have to use "implements" keyword
    //if we don't write any code here then we will get an error.(Comment all the code which is inside the body to see the error)
    //Why ? Think about it practically
    // FortisHospital says that we will implement you(USMedical) but if we don't write any business logic in "FortisHospital" that means we are not implementing anything from USMedical
    // USMedical does not have any business logic - It's an organization who run the US hospital services
    // Practically patient will always go to FortisHospital/Hospital and don't go to Medical organization
    // so patient will always go to FortisHospital and here  FortisHospital should implement the business logic or hospital has to implement that feature
    // And if we don't write anything here that means patient won't get any services.
    // To use the services which are declared in the "USMedical", We need to override those methods/give business logic to those methods
    // so if any class is "implements USMedical" then that class should have business logic otherwise we will get an error
    //

    //All the below methods are overridden methods because we are overriding from the parent interface
    //We can override from the parent class(inheritance) and from the parent interface as well
    //US Methods
    @Override
    public void physioServices() {
        System.out.println("FH -- physioServices");
        //Now how many physioServices,machines that is all up to you - Because you are responsible for writing the logic
    }

    @Override
    public void cardioServices() {
        System.out.println("FH -- cardioServices");
    }

    @Override
    public void ENTServices() {
        System.out.println("FH -- ENTServices");
    }




    //We have implemented the methods of "USMedical" in the "FortisHospital" class and Now at the same time if we go "UKMedical" and of we connect the all three then "Diamond pattern will get created". Please refer diagram(1)
    //Diamond pattern - One child having two parents with the interfaces and below is the representation
    // public class FortisHospital implements USMedical,UKMedical

    //We are implementing UKMedical as well so we need to override all the methods from UKMedical as well
    //UK Methods
    @Override
    public void neuroServices() {
        System.out.println("FH -- neuroServices");
    }

    @Override
    public void orthoServices() {

    }


    //IndianMedical Methods
    @Override
    public void oncologyServices() {
        System.out.println("FH -- oncologyServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("FH -- dentalServices");
    }

    @Override
    public void gynoServices() {
        System.out.println("FH -- gynoServices");
    }

    //Now connect all the dots - USMedical,UKMedical,IndianMedical with the "FortisHospital" - it will look like diamond - It will look like "child" with multiple parents(Refer diagram-2)
    //We can say that we have solved the Diamond problem or we have solved the multiple inheritance problem with the interface because we are not getting any issues in the code and we are able to override from the multiple parent interfaces.This allowed with the only interfaces and not allowed with the classes.


    //Can we create the individual methods of the "FortisHospital"
    //"FortisHospital" - Individual methods / non-overriden methods
    public void medicalTraining(){
        System.out.println("FH -- medicalTraining");
    }

    public void medicalInsurance(){
        System.out.println("FH -- medicalInsurance");
    }


    //Another possibility - What if there is a method which is common in all the interfaces
    //because in all the country(UK,US and in India) can have the same service like (All the countries have "emergency services")
    //So in three diff interfaces we have the same method "emergencyServices()". So what do you think that how many times "FortisHospital" class needs to implement "emergency services"? 1 time or 3 times?
    //If we override same method 3 times then it will be a duplicate and duplicate methods are not allowed
    //If all the interfaces are having a common method then in that case child class should override only and only once

    //Common method
    @Override
    public void emergencyServices() {
        System.out.println("FH -- emergencyServices");
        //if country name is india then call 108
        //if country name is US then call 911
    }

    //So if we notice US,UK and India are having "interface" keyword and all those methods having abstract methods. So what is the use-case of this.Because here we are not giving the business logic.
// This is the flexibility given by JAVA that you can define
//what if tomorrow one more "hospital" is coming to US/UK/India ot there are 100 of hospital coming to US. So don't you think that we have common rule for all/any hospital coming to US? - YES
//And all those hospitals has to implement methods declared in "USMedical" organization
//If e.g APOLLO hospital do not want to go to India and UK then, APOLLO hospital will implement methods of USMedical interface only. Then it can have it's own individual methods as well (Refer Diagram 3)

//If there is USER/Caller class(Where our main method is)/Patient
//So as a patient how many choices I have(I can go to "FortisHospital/Max Hospital/Apollo Hospital")
//If the User/Patient is from UK then whatever hospital is available in UK, patient can go to that hospital and that HOSPITAL has all the overridden method from UKMedical interface /medical organization
//If the User/Patient is from US then whatever hospital is available in US, patient can go to that hospital and that HOSPITAL has all the overridden method from USMedical interface /medical organization
//If the User/Patient is from India then whatever hospital is available in India, patient can go to that hospital and that HOSPITAL has all the overridden method from IndianMedical interface /medical organization
// Patient will not go to interface. Patient will always go to the CLASS

    /*
    Java_22_Interface_JDK1.8Changes_Abstraction_Variables_BuilderPattern_ConstructorChaining
    */

    //Method with parameter in the interface
    @Override
    public void test(int a) {

    }

    //Method with diff return type
    @Override
    public String get(int a) {
       return null;
    }

    //overloaded method
    @Override
    public String get(int a, int b) {
        return null;
    }

    //parent interface method implementation
    //FortisHospital must implement the inherited abstract method(covidVaccination) From WHO interface
    //Comment out below method to check the error
    //Real time usecase - USER/Patient goes to WHO or goes to Hospital?
    //WHO is an organization - They are not supplying/giving vaccination or doctor is not sitting there. Doctor is sitting inside the hospital. So it's hospital's responsibility to implement that method. So that is why implementation should be done in FortisHospital.
    @Override
    public void covidVaccination() {
        System.out.println("FH -- covidVaccination");
    }

    /**
     * Can we achieve diamond between interfaces?-YES(Refer diagram-7)
     * USMedical is following WHO and UN as well.So USMedical extending WHO and UN
     * Single interface can extends/can be the child of multiple interfaces as well
     */
    //parent interface method implementation
    //FortisHospital must implement the inherited abstract method(medicalNews) From UN interface
    //Comment out below method to check the error
    @Override
    public void medicalNews() {
        System.out.println("FH -- medicalNews");
    }

    /**
     * Can we create the parent of "FortisHospital" - yes (Refer diagram - 8 )
     * So FortisHospital has a multiple parent as an interfaces + FortisHospital has a class as a parent as well
     * So as of now "FortisHospital" has 4 parents (3 interfaces [USMedical,UKMedical,IndianMedical]) +(1 class[Medical])
     * How to read this line(FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical)
     * "FortisHospital" is extending "Medical" class and implementing 3 interfaces [USMedical,UKMedical,IndianMedical]
     *
     * We can not write "implements" first then "extends" like below. It will give an error
     * FortisHospital implements USMedical,UKMedical,IndianMedical extends Medical
     *
     * child class can have only and only one parent CLASS but can have multiple interfaces as a parent (Refer diagram -9)
     * We can have 200 interfaces but can not have more than 1 class as a parent
     */

    /**
     * Can we create one more class(there is no relationship between "FortisHospital" and new class which we are creating) which is a child of interface? (Refer diagram -10)
     * Can interface(UN) be a child of class(Automation)?(it means interface is a child of a class)
     * For that we are creating class "Automation.java" and we are creating interface "UN.java"
     * Can "Automation" class be the parent of UN interface?
     * To check that go to "UN" interface and try "implementing" - Automation
     *
     * Interface can not implement anything - Below will give syntax error
     * public interface UN implements Automation{
     *     public void medicalNews(); //UN will spread the medical news worldwide
     * }
     *
     * Interface can not extend anything - Below will give syntax error
     * public interface UN extends Automation{
     *       public void medicalNews(); //UN will spread the medical news worldwide
     *}
     *
     * Interface can only and only have parent interface not the parent class(Refer diagram -10)
     *
     */

    public static void USMedPharmacy(){
        System.out.println("FortisHospital -- Med Pharmacy");
    }

    /**
     * Can we override 2nd method(Method with default keyword)? / Can we override the default method of the interface in the child class?
     * default is special keyword designed for interface so if we try to write it in the class it will give an error.
     * Uncomment below method and check
     */

   /* default void billing(){
        System.out.println("default Keyword - US -- billing interface with body");
    }*/

    /**
     * While we write default keyword at that time it's giving error
     * Let's try with "public" keyword
     * So now what kind of method it is? individual or overridden?
     * Let's try by writing "@Override" anonation above the method - if it does not give any error then it's "overridden" otherwise it's "individual"
     * @Override not giving any error hence method is "overridden"
     * So YES we can override the "default" method
     * But what is the use of this - people were claiming that interface cannot take any decision
     * And we really want to give copy of "default" method to number of objects also(Static method with body in interface is common for all)
     * but what if we really want to design something and really want to give flexibility to our child classes of interface that now you can
     * override the interface's method means you can change the (business logic) of the interface's method.
     * so because of that reason JAVA has given defalut method
     */
    @Override
    public void billing(){
        System.out.println("FH-medical billing");
    }

}


/**
 * Great question! This relates to the **“Diamond Problem”** in object-oriented programming, especially in languages like **Java**.
 *
 * ### What is the diamond problem?
 *
 * Imagine this inheritance structure:
 *
 * ```
 *     A
 *    / \
 *   B   C
 *    \ /
 *     D
 * ```
 *
 * * Class **B** and **C** both extend **A**.
 * * Class **D** extends both **B** and **C**.
 *
 * Now suppose class **A** has a method `show()`, and both **B** and **C** override it.
 * When **D** calls `show()`, **which version should it use — B’s or C’s?**
 *
 * This creates **ambiguity**, and that’s why Java **does not allow multiple inheritance between classes**.
 *
 * ---
 *
 * ### Why Java disallows it for classes
 *
 * 1. **Method ambiguity** – JVM wouldn’t know which parent method to call.
 * 2. **State duplication** – If both parents have fields from `A`, `D` could inherit two copies.
 * 3. **Complexity** – Makes code harder to understand and maintain.
 *
 * ---
 *
 * ### But Java allows diamond via interfaces — why?
 *
 * Java **does allow** this structure with **interfaces**, because:
 *
 * * Interfaces don’t have instance state.
 * * If two interfaces define the same default method, the implementing class **must override it**, removing ambiguity.
 *
 * Example:
 *
 * ```java
 * interface A {
 *     default void show() {
 *         System.out.println("A");
 *     }
 * }
 *
 * interface B extends A {}
 * interface C extends A {}
 *
 * class D implements B, C {
 *     @Override
 *     public void show() {
 *         System.out.println("D");
 *     }
 * }
 * ```
 *
 * Here, Java forces `D` to resolve the conflict.
 *
 * ---
 *
 * ### Summary
 *
 * | Feature              | Classes       | Interfaces           |
 * | -------------------- | ------------- | -------------------- |
 * | Multiple inheritance | ❌ Not allowed | ✅ Allowed            |
 * | Diamond problem risk | High          | Controlled           |
 * | Ambiguity resolution | Not possible  | Enforced by compiler |
 *
 * ---
 *
 * If you’d like, I can explain how languages like **C++** handle the diamond problem too — they allow it but with special rules.
 */



