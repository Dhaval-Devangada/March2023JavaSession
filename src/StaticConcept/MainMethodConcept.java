package StaticConcept;

//Java_16_StaticVariables_Methods_PermGenration_MetaspaceMemory
//Program - 3

//Where exactly mainMethod will be stored - its is static - so always be stored inside the CMA/Meta space
//But why main method is static?
//Who is calling main method? - JVM - JVM will come inside the class and always check that do you have main method or not?
//If main method is non-static then how can JVM call main method? -> Then JVM needs to create object
//JVM should not create any object, object should be created by use. Object should be created based upon our business requirement
//Why main method is void in nature? - because we never write business logic inside the main method - so if there no business logic then we don't need "return" as well
//main method will never return anything but why - because main method is just caller method for us - We just write the calling part there - like create objects and call the variables and methods
//we are not writing "search" or "login" functionality


public class MainMethodConcept {
    // calling purpose
    // no buss logic
    // no return
    // CMA
    // no need to create the obj to call main()
    //PSVM - String[] - Java will always go and check this in the class
    public static void main(String a[]) { //If we comment/remove this main method then we won't have the option to run this program
        System.out.println("this is the main guy");

        MainMethodConcept.main(10);
        MainMethodConcept.main(10,"Naveen");
    }
    //main is a method name and not a keyword
    //it's not mandatory that every class will have main method


    //What if we change the method name of main method?
    //instead of main we can use any other method name as well but in that case we need to call from another main method/ class. Because JVM specificaly  look for "public static void main(String[] args)" because it's predefine in java
    //If we use any other name instead of main then it's just become some method in java and which is valid. So java won't give you any error
    public static void niam(String a[]) {
        System.out.println("this is the main guy");

        MainMethodConcept.main(10);
        MainMethodConcept.main(10,"Naveen");
    }


/*
   This is duplicate not overloading.
   public static void main(String a[]) {
        System.out.println("this is the main guy");

        MainMethodConcept.main(10);
        MainMethodConcept.main(10,"Naveen");
    }*/

    /**
     * Can we overload the main method? -YES
     * So which main method will be called by JVM
     * JVM does not understand below main methods
     * main method is predefined in JAVA
     * JVM will check for public static void main with String array parameter
     *
     * Below methods also explains that STATIC methods can be overloaded
     */
    public static void main(int a) { //We can call this method by using classname.method name
        System.out.println("hi");
        System.out.println(a);
    }

    public static void main(int a, String b) { //We can call this method by using classname.method name
        System.out.println("hello");
        System.out.println(a + b);
    }
}
//practically we don't overload the main method. This is just for an interview

//what is the problem with static?
//10 tc's are there and all are saying that I really want to launch the browser - 10 tc's are running in parallel mode - I want to launch 10 browser at the same time
//our driver is static - > static driver;
//static driver is stored in CMS
// so our driver is occupied with 1st test case so other testcases won't be able to use our driver because its is already occupied with first testcase
// Means we can not achieve  parallel execution with static
//with static it will always be sequential  execution

//Now our driver is non-static
//So 10 objects will be created for all 10 testcases and every object will have its individual copy of driver
// So we will be able to achieve  parallel execution as well. Be
