package ExceptionHandling.videoNo25.customExceptionHandling.checkedAndUncheckedException;

import java.io.FileInputStream;

public class CheckedExceptionOrCompileTimeExceptionExample {
    public static void main(String[] args) {

        /**
         * 1st example of checked exception
         */
        //Uncomment below to check Compile time exception / Checked exception
       //  FileInputStream ip = new FileInputStream("");
        //Above is giving you error - "Unhandled exception type FileNotFound"
        //What if file is not available
        //Compiler is immediately catching the exception
        //So above is compile time exception

        /**
         * 2nd example of checked exception
         */
        //Below line of code is also giving you checked exception
        //It will give you one error [Error: Unhandled exception type InterptedException]
        // And It two suggestions 1.Add throws declaration 2. Surround with try/catch
        //Uncomment below to check Compile time exception / Checked exception
        //  Thread.sleep(5000);

    }

}
