package ExceptionHandling;

public class ThrowKeywordConcept {

    public static void main(String[] args) {
        /**
         * JAVA can not give you each and every exception
         * because you never know what kind of code you are writing
         * for example
         * some excel data is not available and I really want to throw "Excel data not found exception"
         * in your framework browser name is not available I really want to throw "browser not found exception"
         * Java can not give you in-built exception all the time then in that case I really want to generate my own exception
         */

        String browser = null; //Assume that this browser we are reading from the excel/XML file and browser is getting null

        //If browser==null then I want to throw my own exception
        if (browser==null){
            try{
                throw new Exception("NO BROWSER EXCEPTION");
                // Using this we are just throwing the exception we are not handling it. So to handle the exception we need to wrap this line with try-catch
            }catch (Exception e){
                System.out.println("browser not found.....please pass the right browser");
                e.printStackTrace();
            }

        }
    }
}

/**
 * o/p
 *
 * browser not found.....please pass the right browser [this coming because we are printing]
 * java.lang.Exception: NO BROWSER EXCEPTION [this is coming because of e.printStackTrace();]
 * 	at ExceptionHandling.ThrowKeywordConcept.main(ThrowKeywordConcept.java:20)
 */

/**
 * So above is custom exception we are throwing
 * There are other ways also to throw custom exception using throw keyword
 * "Throws" and "Throw" both are totally different thing and not related to each-other
 *
 * Throws means always in-front of the method name
 * Throw keyword means to throw your custom exception on the basis of your condition but the actual handling will be done by try-catch block
 *
 *
 * Need to see
 * finally block
 * compile time /run time exception
 * use case of throw - custom exception
 *
 * Questions
 * Should handle the exception or terminate the program?
 * terminate the program means we are shutting down the /application
 * Your code is on live server - you are terminating the program -
 * Your entire application will shut down immediately
 * You should never terminate the program - that is what the exception handling
 * Exception itself trying to terminate the program but we are saying, please don't terminate it , please proceed further and execute next line of code
 * If we really want to terminate the program then we can use "finally"
 * system.exit() we can use it to terminate the program/jvm completely after getting the exception
 *
 *
 *
 * We have two catch block
 * One for ArithmeticException
 * Two for arrayIndexOutOfBound
 * and now if we have two other catch block one with [Exception] and other with [Throwable]
 *
 * so in above case it will go to which catch block
 * tryCatchQuestion
 */