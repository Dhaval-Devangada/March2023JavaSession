package classandobjects;

public class Customer {
    // instance vars/class variables/global variables
    String name;
    int age;

    // data members of the class
    // vars -- class
    // methods/functions -- are used for buss logic/feature/implementation/to peform any actions
    // (booking flight is a method name/feature name)
    //Search is method name , Login  is a method name
    //Data members should be accessed via object

    // can not create a method inside a method. // we can not create a method inside the main method as well
    // but can call a method from another method. (Search is calling "Add to cart method")
    // all the methods are always independent or parallel to each other
    //We can not create nested methods

    // There are 3 types of methods:

    // 1. no return and no input: (Method which will not give you anything and will not take anything from you as well, just perform some action) / This fun is void in nature
    // void - can not return anything -- no return keyword
    // perform click , launch the URL
    public void test() { // 0 parameter / no input parameter
        // 1 copy of this function will be given to/stored inside the object( when we create it) and object is inside the heap
        System.out.println("test method");
        int i = 10;
        System.out.println(i);
    }

    // 2. some return and no input: (Will give you something but will not take anything from you)
    // return type: int (What kind of value this function is returning)
    public int sum() { //1 copy of this function will be given to/stored inside the object( when we create it) and object is inside the heap
        System.out.println("sum method");
        int a = 10;
        int b = 20;
        int c = a + b;// 30  // (What kind of value this function is returning)
        return c;
    }
    //Void and return can not be together


    // return type: String
    public String getTrainerName() {  //Task of this fun is just give me the trainer name
        System.out.println("getting the trainer from NAL");
        String name = "naveen";
        int a = 100;
        return name; // return should be the last statement of our function
      //  return a;    //Two return keywords are not allowed , we can not return two values at the same time
        // After return keyword we should not write any code
    }

    public short getNumber() {
        System.out.println("getting number");
        return 100;  // we can return the value directly as well
    }

    // 3. some return and some input: (Fun should give something and fun should take something)
    // return type: int
    // input params: a,b (int)
    public int add(int a, int b) { // parameters (give me two int variables)
        //1 copy of this function will be given to/stored inside the object( when we create it) and object is inside the heap
        System.out.println("adding two numbers");
        int z = a + b;
        return z;
    }

    public int multiply(int a, int b) {
        System.out.println("multiplying two numbers");
        int mul = a * b;
        return mul;

    }

    public double getTotalMarks(double score, int handWritingScore, int attendScore) {
        //Always make sure that whatever parameter you are passing you are using all of those parameters in your logic and if you are not using than don't pass it
        System.out.println("calculating marks");
        double finalScore = score + handWritingScore + attendScore;
        return finalScore;
    }


    public void getURL() {
        System.out.println("print the url");
        return; //blank return/no return --> void (This fun is void in nature and has no return)
    }


    //main method is called by JVM
    public static void main(String[] args) {
        System.out.println("main method");
        // We can not access the class vars and methods directly / We can not access data members directly
        //To access it we have to create object of the class
        // create the object of the class:
        Customer c1 = new Customer();// Here photo copy of class vars and copy of methods will be given to new object
        c1.name = "Tom"; // we are accessing the variable with the help of reference variable , we are not calling the variable , we always call the methods
        c1.age = 20;

        c1.test(); // this is calling a method (we are calling a method from another method)

        int m1 = c1.sum();
        System.out.println(m1 - 5 + 10);

        //What is the diff between println and return?
        //What is the advantage of writing "return"? - We can use the returned value for some other purpose
        // We can do additional operation on returned value
        //Func is giving me something and on the basis of that further we are building our logic
        //println will just print on the console, it not dong anything other than printing

        String trName = c1.getTrainerName();   //Func is giving me something and on the basis of that further we are building our logic
        System.out.println(trName + " for JAVa and Selenium");
        if (trName.equals("naveen")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println(c1.getNumber());// 100 // calling a method directly with println is a good practice? - NO (Because we can not do additional work )
        //we can do additional operation by below approach which is not ideal. We are calling same fun multiple times
        System.out.println(c1.getNumber()+5);
        System.out.println(c1.getNumber()+10);

        //ideal approach
        short m2 = c1.getNumber();
        System.out.println(m2 + 10);

        // System.out.println(c1.test());//syntax error/compilation error , because test() is not returning anything so what exactly pritln will consume
        //println is not applicable for thr void functions. (The fun which is giving you the void, you can not use it inside println)

        int sum = c1.add(10, 20);// values -- arguments  // Sum is holding variable
        System.out.println(sum);
        sum = c1.add(100, 200);//// values -- arguments
        System.out.println(sum);
        //When the call the function and we supply the values, these values are called arguments
        //When we define/declare the defination of the function, at that time whatever the input parameters are there. these are called parameters
        //Arguments is represention the values and the PARAMETER is representing the input parameter

        int v1 = c1.multiply(2, 3);
        System.out.println(v1);

        double score = c1.getTotalMarks(90, -5, -10);
        System.out.println(score);

    }
}
