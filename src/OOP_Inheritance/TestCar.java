package OOP_Inheritance;


/*
Program no - 3
Java_20_OOP_Inheritance_Parent_ChildClass_MethodOverriding_RefTypeCheck_Top_Down_Casting
*/

//Here we will understand the concept of "reference type check"
public class TestCar {

    public static void main(String[] args) {
        // Can we create object of BMW?-yes
        // Object will be created inside the heap and properties of BMW will be there
        // So what about parent properties?They will be given or not? - yes
        // Which methods java can access using child class reference variable and BMW type?

        BMW b = new BMW(); //Child class object is referred by child class reference variable
        //So now in BMW(child)class we do not have stop() and in CAR(Parent) class we have stop()
        //So can i access my parent class properties with child class object?
        //stop() is coming from the CAR class
        b.stop(); // inherited method
        //refuel() we don't have it in the BMW class, but we have it in the CAR class
        b.refuel(); // inherited method
        //start()- is there in both the classes CAR(parent) class and (BMW) class as well.
        //So now which method will be called, preference will be given to BMW's "start()" or CAR's class "start()" or both the methods will be called or It will give you some error?
        // JAVA first will go in the BMW class and check that do you have "start()" - YES, but JAVA will also check that you are also extending the CAR class and CAR class also has START()
        //So what decision will java take? JAVA will go with BMW's start() or CAR's class "start()"?
        //It will execute the "BMW" class "start()" method - Because there is a concept in JAVA - Method overriding
        //First what is a need of having "start()" in both the classes(BMW and CAR)
        //BMW says we are a very premium brand in the market and also we are extending a CAR
        //So BMW says that the "start()" in the "CAR" class is very old school method and we don't like this method. Because you have to enter the key and start the ignition and all.
        //But we(BMW) wants to provide auto start feature
        //BMW says that we don't like CAR class's start method so we want to give/use our own "start()"
        //This concept is called method overriding

        //What is method overriding?
        //Method overriding comes into the picture when we have parent class and child class.
        //Method overloading happnes within the same class so we don't need parent and child class over there
        //Try to understand business use case here - Why we need overriding and why we are doing it?
        //JAVA is flexible - It says that you can inherit anything from the parent class but what if I don't like the specific method of the parent class then we are not going to use your method. We will create our own method. We will do override that method which we don't like
        //So child class overriden method will have the different business logic but signature will remain the same as parent class
        //We have same signature in parent and child class so to identify that we have same method in multiple classes we use "overridden" in child class

        //Whenever we have the parent class and child class and we have exactly the same method in both the classes, And when we call the method from runner class then preference will always be given to child class.
        //Java says that you have already overridden that method then why don't you use your own method. We will not give you the access to the parent class method(CAR class method) with help of child class(BMW) reference variable

        //But how exactly and what exactly condition of object, in object what will happen
        //BMW b = new BMW(); Because of this , one object will be created
        //Type of the object is BMW
        //And which class object we have created - BMW object
        //What properties that object will hold - BMW's class properties, CAR's class properties

        //Why we are not extending TESTCAR with BMW or CAR?
        //What is the relationship between TESTCAR and BMW and CAR?
        //Can I say TESTCAR is a child of BMW or TESTCAR is a child of CAR class?
        //There is no relationship between TESTCAR and CAR  or TESTCAR and BMW
        //We should never do unnecessary inheritance
        //BMW is a kind of CAR
        //AUDI is a kind of CAR
        //TESTCAR is not a CAR, It just a caller method for me
        b.start(); //overridden method
        b.autoParking();//individual method of child class(BMW)

        System.out.println("---------End of topic 1---------");

        //----------------------------
        //Can we create the object of parent class here? - YES
        //Which methods java can access using parent class reference variable and CAR type?
        Car c = new Car(); //parent class object is referred by parent class reference variable

        //So now with the help of "c"? what all methods we can access?
        //"c" is a reference of parent class object and parent can not take anything from child
        //so "c.start();" will execute parent class "start()" and same is applicable for "c.stop()" and "c.refuel"
        c.start();
        c.stop();

        //Now we want to access "autoparking()" which is of BMW class and it's an individual method because CAR class does not have "autoparking()"
        //Parent (CAR) can not override anything from their child(BMW) / parent can not take anything from child
        //We have autoparking() which is of BMW class. BMW has specially created that method for BMW company.
        //Now if BMW's(Child class) autoparking() is overriden by Parent(CAR) class that means, BMW's special method is accessible by CAR, and CAR  method is a parent of other child classes(BMW,AUDI). So indirectly all those classes will be able to access "autoparking()". Which is not good in real world.
        //c.autoparking(); //This will give an error, because "autoparking()" is of child(BMW) class and we are trying to access it using parent(CAR) class reference variable

        System.out.println("---------End of topic 2---------");

       //Here we will understand concept of "reference type check"

        //Can we create the object of BMW without any reference?
        //new BMW();
        //Assume that there is one BMW car on the road
        //And we are giving the name with the CAR (CAR c1)
        //Child class object can be referred by parent class reference variable. This is possible in java.If child class does not have the reference then parent class can also give the reference
        //This concept is known as top casting/upcasting in JAVA
        // So how to read below line? Child class object can be referred by parent class reference variable
        // or we can say, every BMW is a CAR also. Ultimately every BMW is a CAR or There is BMW which is actually a CAR
        //CAR c = new CAR() // There is a car which is actually a CAR
        //BMW b = new BMW() // There is a BMW which is actually a BMW

        //So now what properties will be there in below object. The object is of BMW
        // BMW's properties(All the methods of BMW) means overridden methods + individual method of BMW
        // BMW is extending the CAR so will have all the method of CAR class as well but except overridden method(Means It will not take CAR class start method, because we already have start() in the BMW class). But it will take "stop()" and "refuel()" which will get inherited from CAR
        Car c1 = new BMW();

        //So here now we need to understand that using "c1" which method/features we can access. "c1" is reference variable of CAR.
        //So when we want to check that what methods/features we can access using car we need to take care of below 2 things
        //1. Reference type/ type of the reference (here "c1" is the reference and type of the reference is CAR) - It could be parent class or child class
        //2. The feature/method which we are trying to access using reference(c1) has any connection with the type(CAR)
        //3. To check the connection we should understand concept of "3 types of methods" and what connection those methods has with the type(CAR) of reference(c1)
        //4. Then finally check that reference type check is passed or fail

        // There are 3 types of method in inheritance and the connection is explained below
        //1. Overridden methods - It has connection with parent class (Because overridden methods are there in the both classes)
        //2. Inherited methods - It has connection with parent class (Because these method are there in parent class and inherited by child class)
        //3. Individual methods - It does not have connection with any other class

        c1.start();
        //Now let's understand c1.start()- Which is an overridden method
        //With thw help of c1, can we access start() method which is overridden? If we write c1.start() then which class's "start()" will be called
        // Assume, CAR is already there on the road and has the start method and "start()" is of BMW class. So it will take/call the child class "start()". Because we have already overridden it and we have it(start()) in the BMW(child)class
        //c1.start() , is it overridden or inherited method?
        //It is overridden method. But overridden from where?. Overridden from CAR class. Means overridden method having some connection with CAR class.
        //And now who is trying to access c1.start()?. C1 - The reference variable of CAR class.
        //So as we have seen that overridden method is having connection with CAR class, so JAVA can access it using CAR class reference c1

        c1.stop();
        c1.refuel();
        //Now let's understand "c1.stop(); and c1.refuel();- Which is an inherited methods
        //We are able to access "c1.stop(); and c1.refuel();" because those are inherited methods and actually got inherited from CAR class
        //But how exactly java will give the access with the top-casting?
        //JAVA will check that "c1.stop(); and c1.refuel();" actually coming from where - Those are Coming from CAR class
        // And those methods are given to BMW class with the help of inheritance
        //And now we are trying to access it using reference variable c1
        //So java will check type of c1 and type of c1 is CAR and these two methods (c1.stop(); and c1.refuel();) are coming from where? - CAR class - So access will be given without any problem

        //c1.autoparking();
        //Now let's understand about c1.autoparking - which is an individual method
        //It is an individual method of BMW class
        //And we are trying to access it using CAR class reference
        //So here the object is BMW but reference is "c1" which is of CAR class
        //So java will check that you are trying to access "c1.autoparking". This "autoparking" feature have any connection with CAR class - NO
        //And who is trying to access "c1.autoparking". The reference variable of CAR class which is "c1"
        //So "c1" is CAR class reference variable and feature(autoparking) is of BMW class's individual feature. So that is mismatch. So java will not give access to "autoparking"


        System.out.println("---------End of topic 3---------");

        //Can we do down casting? - Can we create parent class object which is referred by child class reference variable?
        //down casting? is possible at compile time(when we design the things) - yes
        //but at the run time - No
        //parent class object can be referred by child class ref variable using down casting?

        //BMW b1 = new Car(); // This will give "type mismatch" error
        // Car c1 = new BMW() - Every BMW is a car but "BMW b1 = new CAR()" - Every CAR can not be BMW
        //Soluation
        //1. Car b1 = new Car() - change the type
        //2. BMW b1 = (BMW)new Car(); - convert the CAR to BMW. So right hand side looks like an BMW car then it's actually referred by BMW reference variable
    //    BMW b1 = (BMW)new Car(); //ClassCastException - You are trying to convert the CAST of the class
    //    b1.start();
            /* which class "start()" will be called?- None - Error will appear "Exception in thread "main" java.lang.ClassCastException: class OOP_Inheritance.Car cannot be cast to class OOP_Inheritance.BMW (OOP_Inheritance.Car and OOP_Inheritance.BMW are in unnamed module of loader 'app')
	 at OOP_Inheritance.TestCar.main(TestCar.java:153)"
	 Error will be thrown at line this line "BMW b1 = (BMW)new Car();" but why?
	 (BMW)new Car() - here we are actually making fool to compiler - here compiler previously giving error while we have written "BMW b1 = new Car();"
	 But by writing/down casting using (BMW)new Car() we have resolved the compile time error but the exception will be given at run time(Because at run time jvm/jav will check that you can not convert the CAR to BMW)
	 It means down-casting at run time is not allowed in JAVA?
	 But down-casting is allowed at compile time. But we don't have any use-case for that. So we never write the code like this/ we never do down casting.
	 But why "run time down-casting" is also not allowed?

	 - Top casting
	 - We have 1 small box and 1 big box
	 - We can keep small box inside the big box. Small box can easily be casted in big box

	 - Down casting
	 - We have 1 small box and 1 big box
	 - We can keep big box inside the small box but we need to fold it/press it/cut into multiple piceace then we will try to fit big box inside the small box . big box can not easily be casted in small box
	 - So at the run time compiler will come to know that object is actually distorted and not ready to be used
	 - So here at compile time, we have forcefully converted a CAR into BMW and we are claiming that RHS has become BMW object, but at run time JAVA will catch this and will throw the "ClassCastException"

	 Another example
	 Small car in india - nano
	 And on nano car we have symbol of BMW and painted it like it's an BMW paint - Means at compile time we have resolve the error
	 But when we run it we come know that it's nano and not an BMW - So at run time we will catch the error

	 */

        System.out.println("---------End of topic 4---------");

        BMW bmw = new BMW();//child class object is referred by child class reference variable and trying to access gran parents methods
        bmw.engine(); // what is the connection between BMW and Vehicle?-inherited method - So we can access grandparent property

        System.out.println("---------End of topic 5---------");
        Car car = new Car(); //child class object is referred by child class reference variable and trying to access its parent class(VEHICLE) methods
        car.engine();

        System.out.println("---------End of topic 6---------");
        Car c2 = new BMW();// engine() is somehow related to CAR or not? - YES(Because CAR is a child of VEHICLE. So child has behaviour of it's parent) so we can access it
        c2.engine();

        System.out.println("---------End of topic 7---------");
        //can we do the top-casting with grandparents? - YES
        //Child class object is referred by grandparent class reference variable
        Vehicle v1 = new BMW();
        //with "v1" can we access "start()" and "stop()"?
        //start() is of child class (CAR) and parent can not take anything from child.
        //So using "Vehicle"(parent class) we won't be able to access "start()" which is of "Child class"(Car). Because reference type check will be failed
        //Same concept applies to stop()  and refuel() as well
        // v1.start();
        // v1.stop();
        //  v1.refule();
        v1.engine();
        System.out.println("---------End of topic 8---------");

        //can child override method from gran-parent? - YES
        //We can override from parent and from grandparents as well
        Vehicle v2 = new BMW();
        v2.gear();

        System.out.println("---------End of topic 9---------");
        //can we do down casting at compile time with the grandparents? Earlier we have seen down-casting with parent class
        // BMW b2 = (BMW) new Vehicle();//We are converting every vehicle to BMW // We will face the class cast exception. // Every Vehicle can not be converted to BMW
        System.out.println("---------End of topic 10---------");

/*
Below method are not the part of this video "Java_21_RunTimePolymorphism_FinalClass_Methods_MethodOverriddingRules_OOP_Abstraction_InterfaceConcept.mp4"
*/

        //We have the "speedometer()" in "CAR" class and in "Vehicle" class as well
        //So if we create the "speedometer()" in BMW then from which class it will be overridden?  CAR (parent class) or grandparent class(Vehicle)?
        //It will be overridden from the CAR(Parent class) and BMW's "speedometer()" will be executed when we do below
        //For us it does not matter that from which class it got overridden, Because ultimately we have overridden it so at the run time our last overridden will be called.Because preference will always be given to child class
        BMW bw = new BMW();
        bw.speedometer();

        //We have the "speedometer()" in "CAR" class and in "Vehicle" class and in "BMW" as well
        //So if we create the "speedometer()" in CAR then from which class it will be overridden?  Vehicle (parent class) or BMW(Child class)
        //It will be overridden from the Vehicle(Parent class) and CAR's "speedometer()" will be executed when we do below
        //Parent can not override anything from child
        Car car_1 = new Car();
        car_1.speedometer();

        System.out.println("---------End of topic 11---------");

        //How can we call the "static billing()" of BMW - with the help of class name
        BMW.billing();

        //How can we call the "static billing()" of CAR - with the help of class name
        Car.billing();


        System.out.println("---------End of topic 12---------");
        //Static methods can be inherited
        BMW.audioSystem();// STATIC method of the parent class can be accessed by child class name as well

        System.out.println("---------End of topic 13---------");

        //Can we call the private methods? - No
        //Only way of calling the private method is to create public method and via public method , call that private method internally and access that public method - Means with the help of encapsulation we can do it.
        Car car1 = new Car();
     //   car1.privateMethodTesting();
        car1.privateMethodTestingAccessViaPublic();

        System.out.println("---------End of topic 14---------");
        BMW bmw2 = new BMW();
        bmw2.power();

        System.out.println("---------End of topic 15---------");

        //Can we inherit the "final" method- YES
        BMW bmw1 = new BMW();
        bmw1.reverseSystem(); //This method is final and inherited from CAR class

        System.out.println("---------End of topic 16---------");
        BMW.ABS();
        Car.ABS();
        System.out.println("---------End of topic 17---------");

        Car car9 = new Car();
        car9.accessPrivateStaticParkingSystemMethodViaPublic();

        BMW bmw7 = new BMW();
        bmw7.accessPrivateStaticParkingSystemMethodViaPublic();

        System.out.println("---------End of topic 18---------");

        /**
         * we have CAR as a parent class
         * CAR class have two child class - BMW and Audi
         * so BMW and AUdi both are siblings
         * Here
         * We are creating the object of BMW, so using BMW reference can we access any AUDI's(sibling's) class method? - NO
         */

        BMW bmw6 = new BMW();
        //bmw6.theftSafety(); // using sibling(BMW) reference we are trying to access method of another(Audi) sibling class

        System.out.println("---------End of topic 19---------");

        //Combination with other child(Audi) class - We will use all the features from AUDI class and some inherited features from CAR class
        Audi audi = new Audi();
        audi.start();
        audi.stop();
        audi.refuel();
        audi.theftSafety();
        Audi.billing();
        audi.power();
        Audi.ABS();

        System.out.println("---------End of topic 20---------");
    }


}
//Overriding always happns between parent to child or grandparent to child. Because always child is going to override
// Method overriding is run time polymorphism
//Who is taking the decision while calling the method?
//Here compiler is totally confused that which method has to be called? so at compile time, compiler is allowing the same method name in both(parent and child) class. So  compiler thinks that lets decide at run time that which method needs to be executed
//So at run time,JVM will decide that which methods should be
//preference will always be given to child class first

//child can override method from grandparent ? - YES (refer engine())


/**
 * Notes from
 * Java_21_RunTimePolymorphism_FinalClass_Methods_MethodOverriddingRules_OOP_Abstraction_InterfaceConcept.mp4
 */
/**
 * 1. Behaviour when we have "speedometer()" in Vehicle(Grandparent),CAR(Parent) and (BMW)Child
 * What to refer from classes.
 * "speedometer()" in Vehicle(Grandparent),CAR(Parent) and (BMW)Child
 * Runner class: Topic no 11
 *
 * 2.Limitation of top-casting
 * -If child class object is referred by parent class reference variable than which method we can not access-We can not access the individual methods of child class
 * -Reference type check will fail so that we can not access the child class individual method
 * -We will get an error at compile time because we don't have the (child's class method) in parent class
 *
 * 3.Method hiding (kind of overriding behaviour of static method)
 * What to refer from classes.
 * billing() in CAR and in BMW classes
 * Runner class: Topic no 12
 *
 * 4.Access of parent class static method via child class name - Yes
 * What to refer from classes.
 * audioSystem() in CAR class
 * Runner class:Topic no 13
 *
 * Notes:
 * Instance → inherited
 * Static → accessible
 * Private → invisible
 *
 * 5.To check that private methods can be overridden or not? - NO
 * What to refer from classes.
 * privateMethodTesting() in CAR class and in BMW class
 * privateMethodTestingAccessViaPublic in CAR class and in BMW class
 * Runner class:Topic no 14
 *
 * 6.To check that can we inherit the final method? - No
 * What to refer from classes.
 * power() in CAR class and in BMW class
 * Runner class: - Topic no 15
 *
 *7.To check that "final" can be inherited or not?
 *What to refer from classes.
 *reverseSystem() in CAR and in BMW
 * Runner class: - Topic no 16
 *
 * 8.To check that "final and static" method can be overridden and inherited or not
 *What to refer from classes.
 * ABS() in CAR class and BMW()
 * Runner class: - Topic no 17
 *
 *
 * 9. Can we create the same method with "private and static" in parent and child class - yes
 * What to refer from classes.
 * parkingSystem() in CAR class and BMW()
 * Runner class: - Topic no 18
 *
 *
 * 10.using sibling(BMW) reference we are trying to access method of another(Audi) sibling class
 * What to refer from classes.
 * theftSafety() in Audi
 * Runner class: - Topic no 19
 *
 *
 * Keyword	Can Override	Is Inherited
 * final	❌	                ✅
 * static	❌	                ❌ (only accessible)
 * private	❌	                ❌
 *
 *
 *
 *
 */


/**
 * If a class is declared with final keyword then it can not be a parent / can not be a parent of any class
 */

/**
 * Uses of final keyword:
 * 1. constant values -We can not change the value (final int i =10;)
 * 2. To prevent the method overriding (website logo example)
 * 3. To prevent inheritance (of class)
 */


//To check the diamond problem practically do below - Child(BMW) is trying to have two parents(Car and Truck) - It will give an error - At a compile time it will give you an error
//public class BMW extends Car, Truck
//At a time we can access only and only ONE
//So JAVA does not support multiple inheritance in the form of classes
//A class can not have multiple parent classes and practically child can not have multiple parents
//But multiple inheritance is allowed in the form of interfaces