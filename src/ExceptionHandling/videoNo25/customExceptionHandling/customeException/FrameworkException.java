package ExceptionHandling.videoNo25.customExceptionHandling.customeException;

/**
 * "FrameworkException" is our own exception name
 * You can give any exception name - like "GlobalException"
 * Suppose we are developing framework so lets say "FrameworkException"
 * So this class should extends what - should extends "RunTimeException"
 */

/**
 * This is common custom exception class
 */
public class FrameworkException extends RuntimeException {
    /**
     * What we will do is
     * We will create the constructor of this class which is "FrameworkException"
     * Then we will say, you give me the message,
     * What is the message you really want to supply to us
     * Why message?
     *
     * Because if you remember, we have seen that with every exception there is a message
     * [like "divide by zero" we have seen with "Arithmatic Exception"]
     * [like "null can not be resolved to type" we have seen with "NullPointer  Exception"]
     * For every Exception there is a message
     */

    //Constructor
    public FrameworkException(String message){
        super(message);
        /**
         * throw the "FrameworkException" with below particular message
         * And also we are using "Super()" keyword
         * "Super()" keyword is used for what - To call the constructor of the parent class
         * And here "RuntimeException" is the parent class
         * And we are passing the same message to "Parent" class constructor
         * And that's it
         * Now this is simple custom framework exception class is ready, so whenever you want to throw your own exception. Use this  class.
         * Refer "UpdatedBrowser" code > Run that code > And check the exception message
         * Whatever the exception class name we want to give, we can give
         */
    }
}
