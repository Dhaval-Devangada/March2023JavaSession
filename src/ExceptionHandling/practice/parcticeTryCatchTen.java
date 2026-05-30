package ExceptionHandling.practice;

public class parcticeTryCatchTen {
    public static void main(String[] args) {
        try{
            System.out.println("Writing Error Class instead of Exception");
            int k =9/0;// This will throw AE
        }catch(Error e){ //Error is not right class with catch, if we are getting the null pointer exception
            System.out.println("Some exception is coming...");
            e.printStackTrace();
        }
        System.out.println("Bye- Writing Error Class instead of Exception");
    }
}
