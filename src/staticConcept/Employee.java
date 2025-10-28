package staticConcept;

//Java_16_StaticVariables_Methods_PermGenration_MetaspaceMemory
//Program - 1

public class Employee {
    // class static vars: static keyword: // These are called static variables which are having static keyword

    String name;// instance/global/class var // This is non-static because we have not written static keyword  //Java will create copy of ony this(non-static variable) and will be stored in object and object will be stored in heap
    static int age;// static var //This static variable will not be given to Object
    // So where the "age" will go in the memory and how many copies of the age will be created?
    // Only 1 copy will be created of the "age" static variables
    // static variables will not be stored inside the heap or inside the stack.
    // There is a seprate memory location which is known as  CMA - Common memory allocation  or Permnent Generation  or Metaspace
    // If we have 10 objects then 10 copies of the instance variables will created for all 10 objects but only 1 copy of the static variable will be created
    // So instance variables are taking more space

    //We can apply static on method as well. Methods can be static in nature as well
    //Static methods will be stored in CMA as well

    /**
     * Non-static method
     */
    public void getEmail() {
        System.out.println("get email method");
    }

    /**
     * static method
     * Below examples shows that static methods can be overloaded as well
     */
    public static void sendEmail() {
        System.out.println("send email method");
    }

    public static void sendEmail(int a) {
        System.out.println("send email method"+ a);
    }

    public static void sendEmail(int a, int b) {
        System.out.println("send email method"+ a+b);
    }




    public static void main(String[] args) {

        //To access non-static variables we need to create the object
        Employee e = new Employee();
        //how to access non-static vars: using Object ref name
        e.name = "Tom";

        //how to access static vars: We don't need to create object to access static variables
        //1. using the Class name
        Employee.age = 20;
        // Employee.name  // Here we are trying to access instance variable using class name which will give an error

        //2. can access directly also:
        //age = 30; // This is possible
        //name="naveen" // this is not possible. "name" is an instance variable."name" is inside the object. We can not access the "name" without the reference name

        //3. can access using object ref name??
        //e.age = 40; //This is possible but it will give you warning that static variable should be accessed in a static way
        //Never use a static variable with static reference name - its not ideal approach - Because they are not part of object
        //Right way is always using the class name
        //"age" is inside the metaspace and not part of the object but it is the part of the same class and  we are accesing it via "e" (object reference) and type of "e" is Employee so java is not restricting us to access static vars via object reference
        // But to access static vars(age) via object reference(e) which is in stack memory - Java has to perform extra operation/traversing to reach from STACK to CMA/META SPACE. That's why it is giving us warning


        System.out.println(Employee.age);
        System.out.println(e.name); // "name" is non-static value so we need to use object reference name to print the value
   //     System.out.println(name); // This not possible because object is non-static value

        //how to access non static method: using object ref name
        e.getEmail();

        //how to access static methods:
        //1. using the class name:
        Employee.sendEmail();
     // Employee.getEmail(); // This not possible because getEmail is a non-static method. It is a part of our object

        //2. directly calling:
        sendEmail();
     // getEmail(); // This not possible because getEmail is a non-static method. It is a part of our object

        //3. can access using obj ref name??
        e.sendEmail(); //Possible but will get a waring because it is a bad practice

    }
}

/**
 * In Object,Object will never hold any static value
 * static is nothing related to your object
 *
 * Why are we using static variable?  or is it just random?
 * In which case we should go with static and in which case we should go with non-static
 * What is the advantage of creating static variable
 * What if we create all the variables with static - If all the variables are static then do we need to create any object - No we don't need to create any object, Means JAVA is not fully object oriented
 * But it is not a good practice to store all the vars/methods in CMA
 * To understand above points refer program no 2
 */