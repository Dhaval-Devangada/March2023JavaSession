package MethodCallingConcept;

// Java_17_MethodCalling_StackMemory_StackOverflowError
// program - 1

public class Employee {
    //1 copy of below function will be given to/stored inside the object( when we create it) and object is inside the heap
    //Below methods are non-static
    /**
     * How to access non-static methods within the class and outside of the class?
     * Started
     */
    public void m1() {
        System.out.println("m1 method");
        m2();
        //If i want to call m2() inside the m1(), do we need to create the object?
        //Here both m1() and m2() are non-static
        //Whenever you have to call non-static methods within the class then no need to create an object./ For another class we need to create object
        //visualize memory diagram
        //Real time example - Can I touch one hand with another hand? - YES
        //I can touch any of the property of my object - I can touch my hair,eyes,legs - we don't need to create one more/extra object for that
        //I don't need to create another objects/create another 5 more "Dhaval" to call all the diff parts of the Dhaval
        //Once the object is created and they all are part of the same body here then m1() is calling m2() then we don't need to create another object
        //They all are available inside the same object. You can call them internally without creating object
    }

    public void m2() {
        System.out.println("m2 method");
        m3();
    }

    public void m3() {
        System.out.println("m3 method");
    }

    /**
     * How to access non-static methods within the class and outside of the class?
     * Ended
     */


    /**
     * How to access static methods within the class and outside of the class?
     * started
     */
    //static methods
    //Visulize diagram
    // Below static methods are inside the Metaspace - So they are part of same space/room/memory
    //So they can call each other directly
    public static void t1() {
        System.out.println("t1 method");
        t2();
    }

    public static void t2() {
        System.out.println("t2 method");
        t3();
    }

    /*
    How to access non-static from static method.
     */
    public static void t3() {
        System.out.println("t3 method");
       // what if static wants to call non-static?
       //Need to create object
        Employee emp = new Employee(); //Within the method we have written the code to create the object
        //How many times above object will get created? - Whenever user call above method
        emp.m1();
    }
    //What is problem with above method?
    //Every time new object will be created when the above method is called.So heap size will get increased.
    //So what should we do to overcome this problem?
    //we can create global object - There is not concept of global object - if we write "new Employee()" inside the method then whenever we call t3() then object will get created
    // To resolve this we have - call by reference
    //So before moving to the concept, we have to understand the problem statement first. What is a need of that?
    //Here the problem is we are creating new object whenever we call t3()
    // so think like what is the necessary/most important thing to call m1()?
    //someone is calling t3() then t3() has to call m1()
    //What we need,, to call m1()(which is in object) from t3() (Which is in meta space) => The reference
    //So why don't we communicate with "object reference" and use the "object reference" to call the methods of the object
    //so that is why concept known as "call the method by reference"



    public static void main(String[] args) {
//Main method is available inside the CMA/Meta Space
//So now from static method we want to call another non-static method. so we have to create object of this class

        Employee e1 = new Employee();
        e1.m1();
        System.out.println("-----");

        //I want to call b2() of browser class which another class
        //b2(); this will give error.
        //So to call b2() we need to create object
        //So how exactly "Employee" class will get to know about "Browser" class? - With the help of Object
        Browser browser = new Browser();
        browser.b2();

        //For static we don't need to create object
        System.out.println("-----");
        Employee.t1(); //t1() could be in another class as well so we need to use Class name to access static methods

        System.out.println("----");
        //I want to call p1() static method which inside the another class
        //p1(); //this will give an error. Because we don't have any static p1() in employee class
        Browser.p1();

    }
}

/**
 * static method is calling another static method then no need to create the object
 * non-static method is calling another non-static method then no need to create the object
 * But
 * what if static wants to call non-static?
 * for non-static always create the object
 * for static no need to create the object
 */