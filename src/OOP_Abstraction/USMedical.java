package OOP_Abstraction;

public interface USMedical extends WHO,UN {  // This is interface and not a class

    /**
     * We can not have the business logic inside the interface
     * To know uncomment below, and you will see an error
     *
     * The movement we try to design the method body {} then we will get an error.
     */
    /*public void physioServices(){
    }*/

    //This method has no body
    //This is only method declaration/method proto type
    //The method which does not have any method body/logic are known as "abstract methods"
    //abstract method static not allowed.
    public void physioServices();

    // Generally in interface methods are already abstract in nature. So you don't need to explicitly tell that methods are abstract in nature
    //Above method is by default abstract in nature. So we don't need to write "abstract" keyword.But if you want to write "abstract" then you can write it like below
    /*
    public abstract void physioServices();
    */

    public void cardioServices();

    public void ENTServices();

    public void emergencyServices();


    /**
     *
     * Java_22_Interface_JDK1.8Changes_Abstraction_Variables_BuilderPattern_ConstructorChaining
     *
     */

    //Can we create the method with parameter in the interface? - YES
    public void test (int a);

    //Can we create the method with diff return type? - Yes
    public String get(int a);

    //Can abstract method be overloaded? - Yes - Here we have two diff method for overloading - So it has to be implemented two times.
    public String get(int a,int b);

    //it's not like that all the abstract methods has  "void" or "0 parameter".
    //We can not write the business logic but we can define the signature

    //Can we create the variable inside the interface?
    int min_fee=10;
    //interface variable static and final by default and if we want to write it we can write it as well
    static final int max_fee=50;

    //Can we create static abstract method? - No
    //Why?
    //If we create the static method - then we need to override and static method cannot be overridden.
    //Abstract methods can not be static but variables are by default static.


    /**
     * Can create parent and child relationship between interface to interface?
     * Which keyword we should use when we have parent and child relationship between interface to interface? extend or implements? - extends
     * implement means - child class has to implement something -implement means implement business logic
     * Who will implement the methods declared in parent interface? - It's grand child's responsibility
     */
    //Can we override WHO method inside the USMedical? - Yes
    //But it does not make any sense because at last it will be implemented in the child class(FortisHospital)
    //But the concept is correct - that below covidVaccination is overridden from WHO(Parent interface) and will be implemented by childClass(FortisHospital)
    @Override  //@override is not giving any error here hence we can say that this method is overridden and below method will again be implemented by "FortisHospital" with proper business logic
    public void covidVaccination();

    //From JDK 1.8 onwards - There are two important things got added in the interface

    /**
     * 1. Can we have static method with method body(Business logic) in interface
     */
    //   - Method body is allowed in interface but with the STATIC only
    //   - Below  method(USMedPharmacy) is not abstract method. because ABSTRACT method means without body. Abstract method can not have body.
    //   - Before  1.8 people used to say that interface can not take any decision at all and everytime class has to implement that.
    //   - What if interface also has to implement some business logic which is very specific to interface only
    //   - USMedical says we really want to implement something then in that case JAVA gives STATIC method
    public static void USMedPharmacy(){
        System.out.println("US -- Med Pharmacy");
    }
    /**
     * Can we override above method in the "FortisHospital"?
     * - NO static method can not be overridden but we can have the same method name in the child class(FortisHospital) and that concept is known as Method Hiding.
     */
    /**
     * How to call above method? which is static in nature?
     * Should be called by interface name.
     * Go and check in the "TestHospital" class.
     * Can we call above method using parent interface?- Check with USMedical (parent) interface in TestHospital class
     * Can we call above method using child class?-Check with FortisHospital(Child) class in TestHospital class
     */

    /**
     * We can overload the above static method as well
     */

    public static void USMedPharmacy(int a ){
        System.out.println("US -- Med Pharmacy-overloaded method");
    }

    /**
     * 2. We Can have default method(Non-static) with method body (Practically we don't use this kind of method)
     *We can use one keyword (default). If we want to create method with the method body in interface then we can always use default keyword
     */

    default void billing(){
        System.out.println("default Keyword - US -- billing interface with body");
    }

    /**
     * So what is the difference between 1st method(static method with body) and 2nd method(default) with keyword
     * 1st method(static method with body) we are calling using "interface" name
     * How to call 2nd method?
     * Can we inherit 2nd method? - 2nd method is non-static so will be given to "FortisHospital" as an inherited method
     * Go and check in "TestHospital"
     * Can we override 2nd method? / Can we override the default method of the interface in the child class?
     * Go to "FortisHospital" and check
     *
     */

    /**
     * We can overload the above "default" method as well
     */
    default void billing(int a ){
        System.out.println("default Keyword - US -- billing interface with body-overloaded default method");
    }

    /**
     * Now when we see entire interface what do we observe?(Forget the "Static method with body" and "default method with body")
     * Means observe the methods which has no body and has just only declaration- We can say we have achieved 100% abstraction - Because when we see methods without body - We can say that we have no idea that how those methods have been implemented
     * Because interface can not implement anything
     * So generally we say that interfaces are 100% abstraction up to JDK 1.7
     */

    /**
     * After jdk 1.8 we have two methods with body in interface(1. method with static and body 2. method with default keyword and body)
     * Means we have achieved partial abstraction in the interface after jdk 1.8
     * Partial abstraction can also be achieved with Abstract classes as well
     */

    /**
     * But normally java developer uses the interface with 100% abstraction. Because we don't want to implement anything in our interface
     * If we want to create/implement very high level common method then we can go with (1. method with static and body 2. method with default keyword and body)
     * So when we design the things, most of the time we go with the 100% abstraction in the interfaces
     */

}

//If you see this interface, we don't see anything in the method body means we don't see the implementation here
//We just see the method name but we don't see that how exactly physioServices implemented / cardioServices implemented / ENTServices implemented/ emergencyServices implemented
//Means there is no business logic so what kind of feature it is? - This is called abstraction - Means hiding the implementation - We have no idea that how exactly it got implemented
//Encapsulation means we are hiding the data
//Abstraction means we are hiding the implementation - because there is no implementation in the interface (e.g - USMedical interface)
//There is a concept of functional interfaces as well.
//Functional interfaces(interface having only and only 1 abstract method) used with lambda and streams
//Why variable static in interface - because want to access it without creating object - We can't create the object of INTERFACE so we need to keep variable STATIC in INTERFACE. So that we can call the variable via classname or interface name
//Why variable is final in interface - purpose of interface is to provide rules and regulations - so variables are also predefined - no one can change it - (They really want to create gloable rules) - so if we want to provide universal truth/property then we can create variable in interface which is final and static in nature.
//In normal class we can not have "abstract method(a method without body)". It will give an error.