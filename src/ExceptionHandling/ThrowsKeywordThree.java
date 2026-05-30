package ExceptionHandling;

public class ThrowsKeywordThree {
    public void m1() throws ArithmeticException{
        System.out.println("m1 method");
        m2(); //All the method are part of same object so they can call it each-other without creating object
    }

    public void m2() throws ArithmeticException{
        System.out.println("m2 method");
        m3(); //All the method are part of same object so they can call it each-other without creating object
    }

    public void m3() throws ArithmeticException{
        System.out.println("m3 method");
        int i = 9/0;
    }


    public static void main(String[] args) {  // Here we don't have "throws ArithmeticException" that means main method is not throwing exception
        ThrowsKeywordThree throwsKeyword = new  ThrowsKeywordThree();

        //main is handling the exception
        try{
            throwsKeyword.m1();
        } catch (ArithmeticException e) {
            System.out.println("AE is coming");
            e.printStackTrace();
        }

        System.out.println("bye");
    }
}

/**
 * Now main method is handling the exception and not throwing it
 * so "bye" will be printed or not - YES - "bye" will be printed. because we are handling the exception so program will not be terminated the moment exception is coming.
 * Exception will be caught by CATCH block and "bye" will be printed
 *
 * So is it a good practice to handle the exception in main method? - NO
 * Why?
 * Because in JAVA main method is caller method. It is USER method for me
 * Think about/like
 * m1() - is like login method
 * m2() - is like search method
 * m3() - is like payment method
 * main() - is like user
 *
 * payment method-m3() is giving the exception
 * and payment method -m3() is throwing exception to search method-m2
 * and search method-m2 is throwing the exception to login method-m1
 * and login method-m1 is throwing the exception to main method-user
 *
 *Do we really want user to handle the exception?
 * Think practically, why user should handle the exception?
 * Although main method is like java code for me so it is allowing us to add "try-catch" block in the main method but it is not a good practice
 * Main method is justa caller method for us . Just to call a method
 * Actual business logic is written inside the methods [m1,m2,m3]
 * Are we going to write business logic inside the main method - NO
 * If we're writing the business logic inside the method/doing some calculation inside the methods and if we are getting the exception in the methods/in business logic area then exception should be handled inside the methods/business logic area and not in Main method/caller method
 *
 * Can we handle the exception inside the main method with the try-catch - NO [it's not ideal. User is not responsible for handling exception. We should never do that]
 *
 * so now question is , who should handle the exception. m1(),m2(),m3()
 * ideally it should be handled by m3()
 * but m3() say I am throwing the exception from my side
 * now m2() says I am going to handle it
 * So inside m2() we can write try-catch block around the line which is giving us exception
 * Refer ThrowsKeywordFour
 */