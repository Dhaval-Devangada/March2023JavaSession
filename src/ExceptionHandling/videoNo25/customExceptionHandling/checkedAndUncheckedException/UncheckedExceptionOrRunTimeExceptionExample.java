package ExceptionHandling.videoNo25.customExceptionHandling.checkedAndUncheckedException;

public class UncheckedExceptionOrRunTimeExceptionExample {
    public static void main(String[] args) {

        int i[] = new int[2];
        i[2] = 10;
        //Are we getting any compile time  error as we write the code - NO
        // when we run the program that time we will know that which exception will be thrown
/*        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        at ExceptionHandling.TestException.main(TestException.java:7)*/
    }
}
