package ExceptionHandling.videoNo25.customExceptionHandling.FinallyBlock;

public class FinallyBlock {
    public static void main(String[] args) {
        /**
         * What do you mean by block?
         * Finally block means -
         * Exception is coming or not - finally block will be executed
         * Dosen't matter exception is coming or not
         * But remember "finally" block should be written with the try-catch block only,without try catch we can not write finally
         */

        System.out.println("ABC");

        try {
            int i = 9/0;
        } catch (ArithmeticException e) {
            System.out.println("AE is coming");
            e.printStackTrace();
        }
       // System.out.println("test");
        finally {
            /**
             * Finally is block, finally is not a method so we can not write like "finally()" this
             */
            System.out.println("I am in the finally block");
        }

        /**
         * "int i = 9/0;" will throw the exception
         * java will go to catch block and exception message will be printed
         * will print the stacktrack
         * then java will go got finally block
         *
         * input
         * > int i = 9/0 > java will go to finally block
         * > int i = 9/3 > java will go to finally block
         * > Dosen't matter exception is coming or not java will go to finally block
         *
         *
         */

    }
}
