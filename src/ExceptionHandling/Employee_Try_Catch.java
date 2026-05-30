package ExceptionHandling;

public class Employee_Try_Catch {
    String name;
    public static void main(String[] args) {

        System.out.println("---------------ONE------------------");
        /**
         * What will happen if exception is thrown by the line which is written inside the "try" block.
         */

        System.out.println("A");
        System.out.println("A");
        System.out.println("A");

        /**
         * The line which is culprit, that line only should be written inside the try_catch block.
         * try is a keyword
         *The line which we have written inside the "try" block will throw the exception and "catch" block will catch the exception
         *With "catch" block we need to tell, we need to tell that which exception is coming
         * We need to assess/identify that which exception can come due to lines which we have written inside the "try" block
         * We need to write that exception name inside the parenthesis which is along with "catch" block and create any reference variable as well inside the same parenthesis "(ArithmeticException e)"
         *
         * Catch block
         * catch block is used for reporting purpose
         * We can write our custom reporting message there [System.out.println("AE is coming...");]
         * If we really want to print/report more information about that particular exception than we can write one more method which is [e.printStackTrace()]
         *
         */


        try{
            int i =9/0;
        } catch (ArithmeticException e) {  //Here we don't need to create any object of "ArithmeticException". JVM will do it automatically. JAVA will create the object internally and we will be able to call our method
            System.out.println("AE is coming...");
            e.printStackTrace(); // printStackTrace will tell you exact information about specific exception that, why exception is coming. What is the reason behind that . What is exception name. line number on which exception is coming. It will give you that.
        }

        /**
         *  Program execution flow
         *  print
         * A
         * A
         * A
         * Will go inside try block, exception will be thrown and will be caught by "Catch" block
         * Now lines which are inside the "catch" block will be executed
         * Once "catch" block is executed then
         * print
         * bye
         */

        System.out.println("bye");

        /**
         * So in above program we have handled the exception
         */

        System.out.println("---------------TWO------------------");

        /**
         * What will happen if exception is not thrown by the line which is written inside the "try" block.
         *
         * What if we write 9/3, will it go inside the "catch block" - NO
         * Because there is no exception, 9/3 is simple division
         * "catch" will be executed only and only when the exception is coming
         */

        try{
            int j =9/3;
        }catch(ArithmeticException e){
            System.out.println("AE is coming...");
            e.printStackTrace();
        }

        System.out.println("---------------Three------------------");

        /**
         * Which lines will be executed from "try" block and Which lines will not be executed from "try" block when the exception is coming.
         * "Hello" will not be printed as exception is coming before that lines
         */

        try{
            int k =9/0;
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        }catch(ArithmeticException e){
            System.out.println("AE is coming...");
            e.printStackTrace();
        }
        /**
         *  Program execution flow
         *  print
         * A
         * A
         * A
         * Will go inside try block, exception will be thrown and will be caught by "Catch" block /immediately it will go to catch block
         * though there are lines written[System.out.println("Hello");] inside the try{} block after this line [int k =9/0;], but those lines will not be executed because this line [int k =9/0;] is giving exception
         * Now lines which are inside the "catch" block will be executed
         * Once "catch" block is executed then
         * print
         * bye
         */

        /**
         * So is it a good practice that, we are getting the exception at line [int k =9/0;]  and writing the code after that line which is throwing an exception
         * Why we have written these lines "System.out.println("Hello");" inside the try block
         * It's not a good practice.
         * What if tomorrow, we have written some important code there /instead of "System.out.println("Hello");"
         * Then that code won't be executed if exception is thrown at "[int k =9/0;]".
         * That means our important code won't get executed. Because once the exception is there then JAVA will jump to "catch" block
         * Our important code should be executed. Dosen't matter exception is coming or not.
         * So instead of printing this "System.out.println("Hello");" inside the "try" block. We should keep it outside the "try" block
         */
        System.out.println("---------------FOUR------------------");

        /**
         * Which lines will be executed from "try" block and Which lines will not be executed from "try" block when the exception is coming.
         * "Hello" will  be printed because as exception is not coming when "int k =9/3;"
         * JAVA will not go to catch block as try block is not throwing exception
         */

        try{
            int k =9/3;
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        }catch(ArithmeticException e){
            System.out.println("AE is coming...");
            e.printStackTrace();
        }


        System.out.println("---------------FIVE------------------");

        /**
         * We can not remember the exception name everytime. What if tomorrow some weird exception is coming
         * For every exception java has created separate class
         *
         * Remember one thing
         * If specific line is giving arithmetic exception then java will look for "catch block - which is handling ArithmeticException"
         * If specific line is giving nullpointer exception then java will look for "catch block - which is handling NullpointerException"
         *
         * If we are handling the exception but at the time of handling (in catch block) we are handling with wrong (exception) then it will not be hadled  and program will be terminated & next line of code won't be executed.
         * Means our line is throwing "ArithmeticException" but in the catch block we have mentioned "Nullpointer exception" - that means we have not handled the exception well
         * So when exception will arise then > Java will look for "catch block with ArithmeticException" but we don't have any so java will throw exception and program will be terminated
         * and any other line of code will not be executed by java
         * refer below example
         */

        try{
            int k =9/0;
            // Above line will throw ArithmeticException exception. JAVA will check>Do we have any CATCH block with ArithmeticException  - NO then > JAVA will throw and exception
            //And program will be terminated > next line of code will not be executed
        }catch(NullPointerException n){
            System.out.println("NE is coming...");
            n.printStackTrace();
        }

        /**
         * So it's not a good practice to handle "ArithmeticException" with "NullpointerException"
         */

        System.out.println("---------------SIX------------------");
        /**
         * How to handle Nullpointer exception example
         */

        try{
            Employee_Try_Catch e = new Employee_Try_Catch();
            e = null;
            System.out.println(e.name);
            // Above line will throw nullPointer exception. JAVA will check>Do we have any CATCH block with NPE - YES then > it will be handled
            //And program will execute next line of code
        }catch(NullPointerException n){
            System.out.println("NE is coming...");
            n.printStackTrace();
        }

        System.out.println("---------------Seven------------------");
        /**
         * What if we have two lines which is throwing two different exceptions
         * In that case we have two options
         * 1. We can create two catch blocks[One for "NullPointerException" and One for  "ArithmeticException"]
         * 2. We can handle both the exception just by using "Exception" - Because in JAVA "Exception" is the parent class of all the exceptions classes
         * "Under the exception" class we have all the underlying exception classes. So "exception" class will handle all the exceptions
         */

        /**
         * Option - 1
         */
        try{
            Employee_Try_Catch e = new Employee_Try_Catch();
            e = null;
            System.out.println(e.name);//This will throw NPE

            int k =9/0;// This will throw AE

        }catch(NullPointerException n){
            System.out.println("NE is coming...");
            n.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println("AE is coming...");
            e.printStackTrace();
        }

        /**
         * Execution flow
         *
         * int k = 9/0; will NOT be executed.
         *
         * Here’s what happens step-by-step:
         * e = null;
         * System.out.println(e.name);
         * 👉 This line throws a NullPointerException immediately.
         * As soon as the exception occurs:
         * The remaining lines inside the try block are skipped
         * Control jumps directly to the matching catch block
         *
         * So this line:
         *
         * int k = 9/0;
         *
         * ❌ never executes
         *
         * The catch(NullPointerException n) block runs:
         *
         * NE is coming...
         *
         * and stack trace is printed.
         *
         * So if we have two lines in try block, which throwing exception
         * then when java reaches at first line of code which causing the exception after that
         * - JAVA will jump to matching CATCH block and won't execute any further line from try block
         * Jumping on matching CATCH block works like SWITCH case.
         */


        /**
         * Option - 2
         */
        try{
            Employee_Try_Catch e = new Employee_Try_Catch();
            e = null;
            System.out.println(e.name);//This will throw NPE

            int k =9/0;// This will throw AE
        }catch(Exception e){
            System.out.println("Some exception is coming...");
            e.printStackTrace();
        }

        /**
         * But with second options
         * Just by reading the code we can not know that which exception is thrown by the program
         * Because in the catch block we have written plain "Exception" - the super class of all the exception classes
         * So just to write "catch(Exception e)" is to handle the exception is not a good practice.
         * In try block code is giving two types of exceptions - so we should handle it by respective exception class
         *
         */

        System.out.println("---------------Eight------------------");

        /**
         * Which class is SUPER/Parent class of "Exception class"? - Throwable Class
         * So Instead of "catch(Exception e)" we can write "catch(Throwable e)" as well
         */

        try{
            Employee_Try_Catch e = new Employee_Try_Catch();
            e = null;
            System.out.println(e.name);//This will throw NPE

            int k =9/0;// This will throw AE
        }catch(Throwable e){
            System.out.println("Some exception is coming...");
            e.printStackTrace();
        }

        System.out.println("---------------Nine------------------");
        /**
         * Which class is SUPER/Parent class of "Throwable class"? - Object Class (Object class is a parent class of all the classes in JAVA)
         * So Instead of "catch(Exception e)"/catch(Throwable e)  can we write "catch(Object e)" as well? - NO
         * It will give you an error - "Exception class must be a subclass of throwable" - Either it should be "Throwable" or "Sub class of Throwable"
         * Throwable > Exception > Respective exception
         * But you can not write an object
         *
         * Try uncommenting below code To check result/error with "Object"
         *
         */

/*        try{
            Employee_Try_Catch e = new Employee_Try_Catch();
            e = null;
            System.out.println(e.name);//This will throw NPE

            int k =9/0;// This will throw AE
        }catch(Object e){
            System.out.println("Some exception is coming...");
            e.printStackTrace();
        }*/

        System.out.println("---------------Ten------------------");
        /**
         * There is another child of "Throwable" class - Error
         * Error and Exceptions are same ? - NO
         * Exceptions are not errors
         * Instead of "Exception" , Let's write "Error" and check that "Exception" is getting handled or not?
         * If it's not throwing any error means exception is getting handled by ERROR class as well
         * But No - It will throw you exception and won't print "Bye- Writing Error Class instead of Exception".
         * Means "Error" can not handle the "Exception"
         * Because "Errors" are different
         * What do you mean by "Error"? -
         * Error means - Syntax error, Stackoverflow error, Any kind of RAM issue,Any kind of Fatal error,Any kind of CPU error
         * Error is coming because of any system failure
         * Error is coming because of hardware or environment issue
         * And Exceptions are coming because of the code we have written
         *
         * In stackOverflow our code is right but we don't have much space in ram that's why we are getting stackOverflow error
         * Code is right, code is not giving any kind of exception
         * When we write the code we can have many kind of problem/we do a lot of mistake
         * divide by zero
         * Arithmatic exception
         * nullPointer exception
         * classCastException
         * topCasting
         * downCasting
         * arrayIndexOutOfBound
         *
         * Above all are coming because of the code
         * Exceptions are coming because of the code
         * Errors are coming because of the environment(Ram,Hardware,Infrastructure).
         *
         * JAVA supports both - with the help of Throwable we can handle both [Exceptions and Error]
         * So try-catch block we can use for the Error handling as well [of course we can use it for Exception handling as well]
         *
         */

        try{
            System.out.println("Writing Error Class instead of Exception");
            int k =9/0;// This will throw AE
        }catch(Error e){ //Error is not right class with catch, if we are getting the null pointer exception
            System.out.println("Some exception is coming...");
            e.printStackTrace();
        }
        System.out.println("Bye- Writing Error Class instead of Exception");
    }

    /**
     * Whenever the exception is coming then JAVA will directly jump CATCH block and won't execute the next line
     */


}
//We can not write try alone, along with try we need to write catch as well
     /*   try{
            int i =9/0;
        }
       */

//We can not write Catch block without try block - NO
/*
catch(NullPointerException e){
        System.out.println("Some exception is coming...");
            e.printStackTrace();
        }*/
