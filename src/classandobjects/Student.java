package classandobjects;

public class Student {
    //Every student will have some property
    //class vars/templates vars
    //String name = "tom" // This is not right practice because every student will have same name and which is TOM
    // Let the object decide what will be the name of the student

    String name;
    int marks;
    char grade;

    public static void main(String[] args) {

        //Objects with the references properly
        Student s1 = new Student();
        s1.name="Ravi";
        s1.marks=90;
        s1.grade='A';

        Student s2 = new Student();
        s2.name="Mitaj";
        s2.marks=95;
        s2.grade='A';

        Student s3 = new Student();
        s3.name="Vinayak";
        s3.marks=60;
        s3.grade='C';

        //Three objects will be created inside the memory
        System.out.println(s1.name + " " + s1.marks + " " + s1.grade); // To print respective value -->object name + respective property name
        System.out.println(s2.name + " " + s2.marks + " " + s2.grade);
        System.out.println(s3.name + " " + s3.marks + " " + s3.grade);

        //can we print the reference name directly?
        System.out.println(s1); //it will print address of that particular reference/object
        //So don't print the reference name directly
        // All the objects are different physical entity
        //How exactly objects are getting stored inside the memory? in which memory ? and how exactly memory plays a role here?
        // Java memory are devided in to two parts -> 1. HEAP 2. STACK
        //Objects will be created inside the heap memory and the references will be created inside the stack memory


        //no ref object: /Zero reference object
        new Student();  // New bon baby is there but baby does not have name and it will occupy some space inside the heap memory and photo copies of class variables will be given(This is the rule )
        //what is the problem with above approach?
        // How we will define the values?
        // We can define the values like below but unnecessary object will be created and you can not define all the property at same time. You can define only one of the property and you can initilize it and the moment you try to define second property than new object will get created
        //So if the student have 10 properties than you 10 times object will be created and that is horriable approach
        new Student().name = "Aman"; // New object got created
        new Student().marks = 80; // Another object got created
        System.out.println("-----------------------");
        System.out.println(new Student().name = "Aman"); //Just to check that what it will print
        System.out.println("-----------------------");


        //just the ref name: then assigning with object (This ia another way of crating the object will use this approach in POM)
        Student s4; // "s4" will be created inside the stack memory and not pointing to any object into the heap
        s4 = new Student(); // another object will be created and it will be pointed/attached by s4
        s4.name = "Naveen"; // now define s4.name , so basically we are using the object which we have created


        //Null Reference Object
        Student s5 = new Student(); // Object will be created and photo copy will be given any referred by s5
        s5 = null; // s5 is pointing to NULL

        //After below line name will be printed or not?
        s5.name = "Peter";//NPE - NUll Pointer exception/ JVM reads rthis lines as => NULL.name
        //with NULL you can not access any object properties
        //Null pointer exception means => Your reference is pointing to NULL
        //Scope of the objects are always inside the heap
        System.out.println(s5.name);



        //There are/could be multiple objects inside the heap and all the objects have photo copies
        //Few objects have references name
        // few objects not have references name
        // few objects have  null references
        //So now heap size is getting increased, don't have much space left inside the
        //Every programing language  will occupie the space on the RAM, Arounf Few(E.G. => 1 GB) GB's of RAM will be there for JAVA MEMORY MANAGEMENT
        // Out of those few GB's few MB's RAM will be given to HEAP
        //So when HEAP memory is occupied , when there are multiple objects got created inside the HEAP then , less memory will there inside the heap
        //To destroy unnecessary(no reference and null reference) object we have "GARBAGE COLLECTOR"
        //JVM will keep monotring/checking the HEAP size and as and when require it will ask/instruct GC to go and to destory unnecessary (no reference and null reference)objects from HEAP
        //GC will destory only those objects which does not have any reference and the objects which are having null reference
        //Scope of GC is only and only to the HEAP and for STACK we have different destoring mechanism

       // System.gc(); // How to call GC using code/program
        //GC - de-allocation /Destroy the objects

        //What if there are so may objects and all the objects are properly referenced/created and heap size is getting increased? - So now the problem is our infrastructure/system

    }
}
