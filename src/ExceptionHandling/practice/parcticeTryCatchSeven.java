package ExceptionHandling.practice;


import ExceptionHandling.Employee_Try_Catch;

public class parcticeTryCatchSeven {

    String name;

    public static void main(String[] args) {
  /*      try{
            parcticeTryCatchSeven e = new parcticeTryCatchSeven();
            e = null;
            System.out.println(e.name);//This will throw NPE

            int k =9/0;// This will throw AE

        }catch(NullPointerException n){
            System.out.println("NE is coming...");
            n.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println("AE is coming...");
            e.printStackTrace();
        }*/


        /**
         * Option -2
         */

        try{
            parcticeTryCatchSeven e = new parcticeTryCatchSeven();
            e = null;
            System.out.println(e.name);//This will throw NPE

            int k =9/0;// This will throw AE
        }catch(Exception e){
            System.out.println("Some exception is coming...");
            e.printStackTrace();
        }
    }
}
