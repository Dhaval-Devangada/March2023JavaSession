package ExceptionHandling;

public class ThrowsKeyword {

    /**
     * Throws keyword is not going to handle your exception
     * Only try-catch block will handle the exception
     * Throws keyword never handle the exception.
     * Throws keyword just supply the exception from one method to another method that's it
     * It's a wrong concept that throws keyword is used for handle the exception
     *
     */

    public void m1(){
        System.out.println("m1 method");
        m2(); //All the method are part of same object so they can call it each-other without creating object
    }

    public void m2(){
        System.out.println("m2 method");
        m3(); //All the method are part of same object so they can call it each-other without creating object
    }

    public void m3(){
        System.out.println("m3 method");
        int i = 9/0;
    }


    public static void main(String[] args) {
        ThrowsKeyword throwsKeyword = new  ThrowsKeyword();
        throwsKeyword.m1();
        System.out.println("bye");

        //Now who is the culprit/who is throwing the exception>m3() [line > int i = 9/0]
        //run this program without handling the exception
        //"bye" will not be printed because before that program is getting terminated
    }
}

/**
 * How to read the exception
 * Always read the exception from the bottom - From the last line
 * Same thing applies in selenium as well
 * Start from the bottom and try to investigate that how exactly and from where exactly exception is coming.
 * So what kind of data structure it is? means how exactly "exception handling" information is getting stored? / In which format? - STACK or QUEUE > STACK
 * STACK - Last in First Out
 *
 *
 * O/P:
 *
 * m1 method
 * m2 method
 * m3 method
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * 	at ExceptionHandling.ThrowsKeyword.m3(ThrowsKeyword.java:25)  [This line is executed last] Because of which exception is coming. [This line is executed last but during o/p is appearing first so we can conclude that exception information is getting stored in STACK data structure. And that is why these information is known as stack trace information]
 * 	at ExceptionHandling.ThrowsKeyword.m2(ThrowsKeyword.java:20)    [This line is executed Third]
 * 	at ExceptionHandling.ThrowsKeyword.m1(ThrowsKeyword.java:15)   [This line is executed second]
 * 	at ExceptionHandling.ThrowsKeyword.main(ThrowsKeyword.java:31) [This line is executed first]
 *
 * 	Above is known as stackTrace of our exception
 *
 *
 * 	Now how to handle/throw the exception from one method to another method for that refer
 * 	ThrowsKeywordTwo Example
 */