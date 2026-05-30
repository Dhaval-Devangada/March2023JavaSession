package ExceptionHandling.practice;

public class parcticeTryCatchOne {
    String name;
    public static void main(String[] args) {
        System.out.println("---------------ONE------------------");
        /**
         * What will happen if exception is thrown by the line which is written inside the "try" block.
         */

        System.out.println("A");
        System.out.println("A");
        System.out.println("A");


        try{
            int i =9/0;

        } catch (ArithmeticException e) {  //Here we don't need to create any object of "ArithmeticException". JVM will do it automatically. JAVA will create the object internally and we will be able to call our method
            System.out.println("AE is coming...");
            e.printStackTrace(); // printStackTrace will tell you exact information about specific exception that, why exception is coming. What is the reason behind that . What is exception name. line number on which exception is coming. It will give you that.
        }

        System.out.println("bye");

    }
}
