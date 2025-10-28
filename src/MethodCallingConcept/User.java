package MethodCallingConcept;

// Java_17_MethodCalling_StackMemory_StackOverflowError
// program - 3

/**
 * To understand the call by reference
 * To understand how we can avoid the creation of object(To access non-static members) every time we call the static method
 *
 *  what if static wants to call non-static?
 *  Need to create object
 *  So every time we call static method a new object will be created which will increase the heapSize
 *  There are two approach to access the non-static method from static
 *  1. create new object of non-static method in the static method and use the object ref to access non-static members-so in this case object will be created every time we call the static method. - Not a good approach
 *  2. If you have the reference available then you simply use it
 *
 */

public class User {
    public void sendEmail() {
        System.out.println("sending email");
    }

    //Just to understand how many ways we can try to access the non-static methods
    public static void getEmail() {
        System.out.println("getting email");
        //sendEmail(); We can not call directly because it's part of the object

        //1st approach  - Every time we can "getName()" a new object will be created which is not good from memory point of view
//        User u1 = new User();
//        u1.sendEmail();

    }

    //We can call this method and can supply the user reference
    public static void getEmail(User u) {//u=u1   //1 object can have multiple reference that we have seen classes and object
        System.out.println("getting email");
        u.sendEmail();//NS

        //Can we call the static method (readEmail()) here? how?
        //This method and "readEmail()" both are static. So we can call it easily
        //Just to avoid confusion we can use className.MethodName like below
        User.readEmail(u);

        //Can we call non-static method inside the static method? how?
        //Yes we can call - We have the reference(u) which is pointing to object where we have the copy of "test()"
        u.test(20);

        //test(30); //This is not possible. We can not directly can non-static method inside the static method
    }
    //So now if we call above static method 100 times through only 1 object got created. Because we are not creating object inside static method
    //We are calling the static method by passing the reference. This concept known as call by reference.
    //So now there is no memory related issue

    // getEmail(User u) // so here do we need to pass class name or we can pass anything?
    // so here our requirement is I really want to call "sendEmail()"
    // but sendEmail() is what? - non-static
    // if we don't pass "User u". how will i call "non-static" guy "sendEmail()"
    // "sendEmail" is an method of the "User" class. So we need the reference of the that class.


    //Suppose for below method our requirement is to call m3() method which in "Employee" class. So we need to pass reference of that class
    // below getName() is not responsible for creating the object otherwise every method need to create the object
    // In below case main need to create the objet
    public static void getName(Employee e) {
        e.m3();
    }


    public static void readEmail(User u){ //In this method we can supply the reference as well
        System.out.println("reading email");
        u.sendEmail(); //now we can call the non-static method by using the reference and don't need to create object inside this method
    }

    public void test(int i) {
        System.out.println(i);
    }



    public static void main(String[] args) {

        User u1 = new User();
        User.getEmail(u1); //call by ref  //Here we are giving/passing "u1" to "getEmail()"
        u1.test(10);//value -- call by value //Here we are passing the value - Specific value we are passing


        //If we are  not creating the object anywhere in this class/ in the main method
        //what if we just write the below? will it give null pointer exception
//      User u1; // We can do this if comment out above created object
//		User u1 = null; // we need to initilize this "u1" reference because we need to pass it to another method
//		User.getEmail(u1); // so now this "u1" is pointing to null so when "getEmail()" call it will get the null as an argument so we will get "nullPointerException"

    }
}

/**
 * What is the difference between call by reference and call by value?
 * What is the need of call by reference/value?
 * - First try to understand  problem statement and then solve the problem,Do not directly jump into the defenation
 *
 *
 * User object
 * Suppose I am using on Amazon application for 5 hours then I need to maintain the session for 5 hours so that we need to create the object.
 * But mu order placement will be completed within the 5 minutes so memory will be released after the 5 minutes from the stack/so after 5 minutes my stack will be over
 * so practically we need more space inside the heap.
 *
 * Stack is always activated when we are running something if nothing is happening than stack is always 0
 * GC will not touch/go inside the STACK and CMA
 */