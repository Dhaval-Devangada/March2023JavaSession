package SuperKeyword;

public class BMW extends Car{

    int min_speed = 200;
    //There is no concept like variable overriding
    // Car class is having it's own variable and "BMW" class is having it's own variable
    //Method will be overridden not the variables

    public void displaySpeed(){

        //How to use SUPER with variable?

        System.out.println("BMW display speed Method");
        System.out.println("BMW min speed:" + min_speed);
        //min_speed and "displaySpeed" both are part of the same object so they can call each other.
        //value - 200
        //Suppose we are doing some calculation and we really want super class variable as well but without creating the object of "Car" class
        //Straight forward way is , Create the Car class object and do c.min_speed
        //We can use "Super" key as well. "Super" means, we can use Super class property
        System.out.println("Car min speed:" + super.min_speed);//100

    }

    //Can we apply same thing to methods as well?
    public void speed(){
        System.out.println("bmw speed");
        super.speed();
    }

    //We can not use "SUPER" keyword outside the CAR we can use it inside the method only
      // super.speed(); //This will give error
    //If we write "SUPER" outside of the class then JAVA will assume that you are trying to

    public BMW(){
        //In this BMW we want to call another BMW constructor for that we use - this
        //And if we want to call parent class constructor then we need to use SUPER
        super(); //We are calling default constructor.
        //super(20);
        System.out.println("BMW-Constructor");
        //super();
        // We can not write "super()" constructor call in between/at last in the code. Constructor call must be the first statement in a constructor
        //It's not mendetory that from default const we can call only default cons, we can call parameterize const as well
        //To check above scenario - uncomment parameterize const (super(20)) and comment out (default const)
        //Can we call both parent class const - NO -Why? because for that we need to write SUPER two times and we can't write SUPER in second line
        //SUPER should always be the first statement
        //this should always be the first statement in the const
        //So we can not SUPER and THIS together as well because any one of them needs to come in second line
        /**
         * Not allowed
         * this(25);
         * super(20);
         *
         * Not allowed
         * super();
         * this();
         *
         * Not allowed
         * super();
         * this(20)
         *
         * Not allowed
         * this()
         * super(20)
         *
         * so both are not allowed together, you decide that you want to call "super()" or "this()" or
         * you want to call parent class const or you want to call current class const. It dependents upon the use case you are defining but both can not be done
         */
    }

    //Whatever we can achieve with default const. We can achieve with parameterize const as well
    public BMW(int i ){
        super(); //We are calling default constructor.
        //super(20);
        System.out.println("BMW Constructor..."+ i);
    }
}
/**
 * So what is the advantage of the SUPER keyword here
 * I can access all my parent properties without creating the object with the help of SUPER keyword
 *
 * So are we creating parent class object unnecessarily - no
 * If we don't have SUPER keyword then what we should do to access the CAR class property - To access the property of CAR class we need to create Object of CAR class unnecessarily
 * So why to create extra object. So batter use SUPER keyword
 *
 * 3 use cases of super keyword
 * To call super class variable
 * To call super class method
 * Super Keyword can be used inside the const, but it should be the first statement inside constructor. Same thing applies to "this" keyword as well.
 *
 * this and super can not be used together because 1 will become 2nd statement and that is not allowed in java
 * what is the diff between this and super?
 * this - this keyword is pointing to current class object
 * super - super keyword is pointing parent class object
 *
 * Can we call our grandparent constructor?
 *
 *
 *
 */