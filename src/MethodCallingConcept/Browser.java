package MethodCallingConcept;


// Java_17_MethodCalling_StackMemory_StackOverflowError
// program - 2
//Here we don't have any main method. so we won't be able to execute it

public class Browser {
    public void b1() {
        System.out.println("b1 method");
        b2();

    }

    public void b2() {

        System.out.println("b2 method");

        //We want to call m1() which is another class.
        //so can we call it directly?
        // There is no relationship between "browser" and "employee" class

        //m1(); trying to call m1 without creation object. It will give an error
        //Both are available in the same package so import is not required as well
        //So how to call m1() form the employee class?
        //So think about memory diagram
        //If somehow we get the object reference of Employee class then we can call m1(). this is also know as call by Reference
        //If we create the object of "Employee" class then we can call m1(), because in that object all the methods will be there. So then with the help of reference we can call m1()
        //So if we want to create non-static method of other class then we need to create the object
        //And that object will have all the copies of class vars and method so that now we can use it in our current class

        //We can create the object in another method as well.
        //It is not like that , we should create object in main method only
        Employee e2 = new Employee();
        e2.m1();
    }


    public static void p1() {
        System.out.println("p1 method");
    }
}
