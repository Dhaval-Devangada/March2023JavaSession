package classandobjects;

import java.util.ArrayList;

public class Employee {
    //class -->Category(Specific category), Blueprint (For all the objects),Templates (Create a template for all the objects)
    //We all are the objects and coming from HUMAN category
    //All the animal are coming from ANIMAL category
    //All the laptops are coming from laptop category(each objects have diff property like here diff size and diff colours)
    // map of building (Class) and actual units we are building are objects
    // From the blueprint we are going to create n number of objects

    //So what is object,
    //Object: physical entity created from class(Category)
    //Every object is having its own properties
    //Human - height , weight , build ,address
    //Objects is the main guy who is actually having the data and classes is just for template

    //class variables /global variables
    //Don't initilize your class variables
    String name; //Every employee will have its own name
    int age; //Every employee will have its own age
    double salary; //Every employee will have its own salary
    String city;//Every employee will have its own city
    char g ;

    //We have created above variables under the class and not under the main method so those are called class variable


    public static void main(String[] args) {

        int i = 10; // local variable because it is created inside the main method or method
        int j;

        //create the object of the class: using new keyword
        Employee obj = new Employee();  // We need to write brackets other it will get error, We will see the importance of () in constructor.
        // new Employee() is not a method
        // Employee - class name
        // obj = object reference name(Object is always RHS)
        //new - is keyword to create the object
        //new Employee() => object
        //Object might have name or can not have name as well
        //Dhaval is a object name and My(Dhaval's) body is the object

        //What happens when you create the object?
        // The moment we create the object a photo copy of the class variables/templates variables will br given to object


        //Every object will have their respective copy

        obj.name = "Tom";
        obj.age = 20;
        obj.salary = 12.33;
        obj.city = "LA";

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.salary);
        System.out.println(obj.city);

        //where exactly object is created?
        //How exactly it is happning?
        //What is the purpose of giving the values and everything?

        //From the same blueprint we can create n number of objects
        Employee obj1 = new Employee(); // we can not have the duplicate object name

        //we have not assigned values for the properties of obj1 so default values will be printed
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.salary);
        System.out.println("test" + obj1.city);
        System.out.println("char=>" + obj1.g);

        // we can create n number of objects , there is no limit for that
        // To all the objects, class variables/global variables copies will be given to each and every objects

        ArrayList<String> ar = new ArrayList<String>(20);//vc=20,pc=3

        ar.add("test");
        ar.add("testing");
        ar.add("testautomaton");

        ar.trimToSize(); //vc = pc = 3

        for(String e : ar) {
            if(e.equals("testing")) {
                ar.set(1, "cypress");
            }
        }

        ar.removeAll(ar);
        System.out.println(ar);

        ArrayList<String> lang = new ArrayList<String>();
        lang.add("JAVA");
        lang.add("Py");

        ar.addAll(lang);
        System.out.println(ar);
    }
}
