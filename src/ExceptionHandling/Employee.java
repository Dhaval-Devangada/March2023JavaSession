package ExceptionHandling;


/**
 * Program - 1
 * Java_24_SuperKeyword_ExceptionHandling_TryCatch_Throws
 */

/**
 * What is exception?
 * Unwanted condition/code/unwanted/abnormal happen in your code and because of that your program is getting terminated
 * If you don't handle exception then what will happen?
 * Do we want our application to give timeOut error / terminated - NO
 * If user is not able to "addToCart" then ideally what we want - We want user to try again
 * We don't want that - the moment error is coming then entire system is down - We want out next line to get executed.
 * Same thing in selenium as well, if we are not able to click on specific button then fine, ignore that and move to the next one/line/element
 * What we need to follow in exception - Handle the exception and move further
 * Exceptions are coming but we need to handle them properly
 * Exception is not about try/catch and throw and throws keyword
 * We need to understand how to create custom exception and custom exception classes and all that
 */
public class Employee {

    public static void main(String[] args) {

        System.out.println("A");
        System.out.println("A");
        System.out.println("A");

        int i =9/0;
        /**
         * whenever the exception is thrown it will tell you
         * What is the exception?
         * What is the exception name?
         * And on which line number it's coming?
         *
         * o/p
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * 	at ExceptionHandling.Employee.main(Employee.java:30)
         *
         * Interpretation of exception message
         * Exception in thread "main" java.lang.ArithmeticException[This is actual exception name]: / by zero [This is message]
         * 	at ExceptionHandling.Employee.main(Employee.java:30)[Inside the main method, "Employee" class
         * 	and under the "ExceptionHandling" package] you are getting an exception
         *
         *
         * Here the moment exception is coming program will be terminated,
         * So who is the culprit here, Not all the lines are giving the exception
         * Only  this line "int i =9/0;" is giving the exception
         * So what we need to do it, handle the exception with the try catch block
         * Refer Employee_Try_Catch Program
         */

        System.out.println("bye");

    }

}
