package ExceptionHandling.videoNo25.customExceptionHandling.FinallyBlock.tryWithOutCatchButWithFinally;

/**
 * We can write try block without catch block but we need to add "finally" block with try block
 * But is it a right practice that you are writing try block without catch and you are not handling the exception
 * it's not a good practice
 * but we can write try without catch block
 * But we can not write "catch" and "finally" block without "try block" > its not possible
 * try commenting "try block"
 *
 * can we write "finally" with try-catch block? - No
 * try commenting "finally" block
 * finally is always associated with the try-catch block
 *
 * We can write try-catch block inside the finally block as well
 * And we can write the finally inside the finally as well
 *
 *
 * "finally" should be written after try-catch
 * we can not write finally inside the catch block
 * try writing "finally" inside the catch block
 * try writing finally before "try" block
 *
 */
public class tryWithOutCatchWithFinally {
    public static void main(String[] args) {

        System.out.println("ABC");

        try {
            int i = 9/0;  // dosen't matter "i=9/0" or "i=9/3" > java will go to finally block
        }
//        catch (ArithmeticException e) {
//            System.out.println("AE is coming");
//            e.printStackTrace();
//        }
        finally {
            System.out.println("I am in the finally block");
            try {
                int i=8/0;
            } catch (ArithmeticException e) {
                System.out.println("AE is coming");
                e.printStackTrace();
            }finally {
                System.out.println("I am inside the second finally block");
            }

        }



    }
}
