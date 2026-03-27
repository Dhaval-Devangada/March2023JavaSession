package OOP_AbstractClass;

/**
 * Abstract class is also giving us abstract features but in the form of classes and not in the form of interfaces
 * Assume that we are going to design webpage application so we are creating "Page" class
 */
//This class has to be "abstract" in nature so write "abstract" before the class. Because this is not normal class
public abstract class Page {

    int loadingTime = 10; //This variable behaves like normal class variable (This is not static not final in nature)

    /**
     * I can not create the object of abstract class
     * Whenever we are using "abstract method" inside the abstract class then we need to use "abstract" keyword word.
     * We explicitly need to mention that this is an abstract method
     * In interface it's not mandetory to write "abstract" during method declaration. If you write it then it's okay and if you don't write it then also it's okay
     * Because interface methods are by default "abstract" in nature always
     */

   // public void title(); // This will give error because we have not used "abstract" keyword through method is abstract

    //Below is a correct way to write "abstract method" in "abstract class"
    public abstract void title();
    public abstract void url();

    //In "abstract class" we can create some non-abstract methods as well
    public void defaultPageTimeOut(){
        System.out.println("page -- time out = 20 secs ");
    }
    public static void displayFooters(){ // To prevent the overriding - we can make it STATIC / We can make it FINAL- We don't want this method to be overridden
        System.out.println("page -- displayFooters ");
    }

    //every page should display the logo
    //"Login page" can override and can change the logo which is not convenient because logo should be same for whole application
    public final void displayLogo(){
        System.out.println("page -- logo ");
    }


    //Can we create the child of "abstract class page" class? - YES
    //Can we override non-abstract methods? - Yes - If we don't like the parent class method then we can override it in child class and change the behaviour
    //Can we prevent the overriding? YES - footer and logo stays same throughout the application so we don't want to change it - To do it - Make the "displayFooters" method static/final
    //We made footer - STATIC - To prevent overriding and "Logo" final prevent overriding
   //Can  "LoginPage" have its individual methods - YES
    //Test the application by creating main method - refer -  AmazonTest
    //Can we do top-casting with abstract classes-YES - Child class object can be referred by Parent abstract class reference variable
   //Can we do down-casting with abstract classes - NO(Because we can't create object of abstract class) - Parent class object referred by child class reference variable
    //Is it mendetory to have "abstract methods" inside "abstract class" - NO (try commenting abstract methods) - we won't get any error.
    // If we don't have any "abstract methods" inside the "abstract class" that means 0% abstraction (abstract class with 0%(0) abstract methods) - (try commenting abstract methods)- we won't get any error.
    // If we only have "abstract methods" inside the "abstract class" that means 100% abstraction(abstract class with 100%(100/all) abstract methods) -(try commenting non-abstract methods) - we won't get any error.
    //partial abstraction - 0 - 100% abstraction - we can acheive that
    //no abstract methods -- 0% abstraction
    //all abstract methods -- 100% abstraction
    //partial abstraction -- 0 to 40%/50%/100% abstraction
    //So in interface if we forget features of JDK 1.8 then interfaces is all about 100% abstraction but in "abstract" class we can achieve partial(30%/40%...100%) abstraction


    //we can not create the object of "abstract class" but Can we create the constructor of the abstract class?
    //constructor will be called when we try to create the object
    // YESSSSSSSSSS we can create the constructor of "abstract class" - lol :)

    //concept of constructor remain same
    public Page(){
        System.out.println("Page -- default constructor");
    }
    //But the question is when exactly the constructor will be called -
    // Generally what we have seen is that constructor will be called when we try to create the object of the class
    //But here we can not create the object of "page abstract class" so constructor will never be called
    //So what should we do in that case
    //Page class constructor will be called when try to create the object of it's child class
    //What is the child class here - LoginPage
    //So when we try to create the object of child class then it will call the "parent abstract class" constructor as well
    //when we create the object the, constructor should be called - but what if i have not created the constructor - then java will create hidden constructor which will be default constructor

    /**
     * So when we create the object of child class in main method then Java will check that do we have explicit constructor, if not
     *      - then java will go and check that, do we have explicit constructor in abstract class, if YES
     *      - then it will execute it.
     */

    /**
     * So question when we have explicit constructor created in both the classes(Child class + parent abstract class)
     * then which constructor will be executed?
     * only parent class const?
     * only child class const?
     * if both then first parent class const then child class const?
     * if both first child class const then parent class const?
     *
     * ans: in terms of constructor first preference will be given to parent class constructor then child class const.
     *
     * Execution Flow:
     * When we create the object of child class in main method then java will go and check in child class(LoginPage)
     * that do you have your own explicit const - if YES - then java will stop and won't execute it
     * and will check that - Do you have any parent class - If YES then
     * Then Java will go to parent class to check that - Do you have any explicit const - if YES
     * Then execute the Parent class constructor first then execute child class const
     *
     * in very rare case we use this concept but remember that JAVA follows this sequence
     * But in case of method - only child class method will be executed (overridding)
     * And in case of constructor both constructor will be called (first parent then child)
     */

    /**
     * Scenario + Execution Flow:
     * We have overloaded the constructor in the child class by creating the parameterize constructor
     * We have called/created the object of parameterize constructor in main method.
     * Now which constructor will be called first and which will the last? and which const will be ignored?
     * Parent class default constructor will be called first then child class parameterize constructor will be called
     * Child class default constructor (which does not have any parameter) won't be called
     * Overloaded parameterized constructor will not disturb the sequence
     */

    /**
     * Scenario + Execution Flow:
     * We have overloaded the constructor in the child class by creating the parameterize constructor
     * We have also overloaded the constructor in the parent class by creating the parameterize constructor
     * Now which constructor will be called first and which will the last? and which const will be ignored?
     * Parent class default constructor will be called first the child class parameterize constructor will be called
     */

    public Page(int i){
        System.out.println("Page page -- parameterize const");
    }

    /**
     * Conclusion: In all the cases parent class default constructor will be called first
     */

    /**
     * So how can we call the PAGE class parameterize const? or when it will be called ?
     * We can call it from "default const" by using the concept of constructor chaining
     * below is the code  - Try replacing with above code
     *
     * public Page(int i){
     *         this(5)
     *         System.out.println("Page page -- parameterize const");
     *     }
     *  JAVA will go to child class
     *  If const is there STOP
     *  Will check, does class have parent class - YES
     *  Go to parent class
     *  Check for default const - execute it
     *  Default const has "parameterize const" - execute it
     *  Then come to child class
     *  execute child class const
     *
     */

    /**
     * Scenario:
     * Try commenting "Default" constructor in Parent class
     * Keep the child class const as it is
     * Java will give error in child class const
     * "implicit super const Page() is undefined. Must explicitly invoke another constructor" - Means I don't see any default constructor
     *
     * JAVA will go upto Parent class to check for the explicitly created default const. - If not found then will give an error
     * JAVA won't create explicit const by itself
     * We need to create explicit cons. if we are using const concept.
     *
     * Generally we don't use this level of complexity in the framework
     */

    /**
     * What if we remove/comment both the constructor from the PARENT class
     * Keeping the child class constructors as it is
     * Java will not give any error
     * When we create the object in main method
     * Java will go to child class
     * Look for the const - If Found - STOP
     * If child class has parent class - Go to Parent class
     * Look for default const - No found
     * Go to child class - execute child class const
     * In this case child class (Login Page) will behave like normal class because we don't have any const in parent class
     * So respective const will be called
     *
     * Problem will start coming the moment we have any/default/parameterize const in the parent class
     * If we don't want to create any const then don't create but if we want to create then we need to create explicit default const
     * Unnecessary complex but this is how it is designed by JAVA
     */

    /**
     * Can we do above/exactly things in interfaces - NO(because we can't create CONST. in interfaces) - this is the Major diff
     * Interfaces we always use - When we want to achieve 100% abstraction
     * 100% abstraction means - Interface
     * Partial abstraction means - Abstract classes
     */

    /**
     * Now we will see actual diff between interface and abstraction and when to use what.
     * We will create WebDriver Architecture - Not actual webDriver Archi. We will create Dummy interface and classes
     * So that we can conclude that, WebDriver should be an interface or WebDriver should be an abstract class?
     *
     * Refer: WebDriver_Arch
     */

    //default method is not allowed in the "Abstract Page" class. Default method is only and only for interfaces
//    default void billing(){
//
//    }

}
