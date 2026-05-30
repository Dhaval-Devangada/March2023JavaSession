package ExceptionHandling.practice;

public class parcticeTryCatchFive {
    public static void main(String[] args) {

        System.out.println("A");
        System.out.println("A");
        System.out.println("A");

        try{
            int k =9/0;
            // Above line will throw ArithmeticException exception. JAVA will check>Do we have any CATCH block with ArithmeticException  - NO then > JAVA will throw and exception
            //And program will be terminated > next line of code will not be executed
        }catch(NullPointerException n){
            System.out.println("NE is coming...");
            n.printStackTrace();
        }catch(ArithmeticException n){
            System.out.println("AE is coming...");
            n.printStackTrace();
        }

        System.out.println("Bye");
    }
}
