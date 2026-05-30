package ExceptionHandling.videoNo25.customExceptionHandling.checkedAndUncheckedException;

public class ExceptionHierarchy {
    /**
     * Error - something is coming because of the system/env/infra/memory issues
     * Exceptions - is coming because of code divide by zero/class cast exception/null pointer exception
     *
     * Exception is havig child classes
     * Refer "4-ExceptionHierarchy.png" screenshot
     *
     * Exceptions and Errors are divided into two parts
     * 1. Checked exception
     * 2. Unchecked exception
     *
     * or we can say
     * 1. Compile time exception
     * 2. Run time exception
     *
     * RuntimeException and it's sub-classes and
     * Error and it's sub-classes are unchecked exception. [Unchecked exception are those exception which compiler can not identify]
     * And all other exceptions are checked exception
     *
     *
     * List of unchecked exception.
     *
     *RunTime exception sub classes are below
     * >ArithmeticException
     * >NullPointerException
     * >ClassCastException
     * >IndexOutOfBoundsException
     *      >ArrayIndexOutOfBoundsException
     *      >StringIndexOutOfBoundsException
     *
     *
     * Errors and it's sub-classes are below
     *>Virtual machine error
     *      >StackOverFlowError
     *      >OutOfMemoryError
     *>AssertionError
     * ExceptionInIntializerError
     * IOError
     * AWTError
     *
     *
     * -----
     *
     * Compiler was not able to identify the "nullPointerException"/"AirthmaticException" at compile time. We were getting exception at run time.
     * Compiler was not able to check/identify those exception at compile time so these are called "Unchecked Exceptions" or "Run Time Exception[It will be occured at run time]"
     * Other than above scenario all other scenario/where compiler will immediately tell you that this exception is there, compiler will immediately find that.
     * Below are compile time exception
     * >IOException
     *      >EOFException [End of File]
     *      >FileNotFoundException
     *      >InterputtedIOException
     *      >FileNotFoundException
     * >SQLException
     * >AWTException
     * >InterputedException
     *
     *
     * Unchecked means it won't be caught by compiler. It will be caught at the run time
     * Checked means it will be caught at compile time
     */
}
