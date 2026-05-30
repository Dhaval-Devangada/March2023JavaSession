package ExceptionHandling;

/**
 *  We have to catch block
 *  One for ArithmeticException
 *  Two for arrayIndexOutOfBound
 *  and now if we have two other catch block one with [Exception] and other with [Throwable]
 *  so in above case it will go to which block
 *  if respective exception is found then immediately it will go to that exception related catch block
 *  So in below case if NPE or AE related catch block not found "Exception" catch block/"Throwable" catch block
 *  So if respective exception is found then it will go there otherwise it will go to "exception/throwable" catch block
 */
public class TryCatchQuestion {
    public static void main(String[] args) {
        System.out.println("A");


        try{
//            Employee_Try_Catch e = new Employee_Try_Catch();
//            e = null;
//            System.out.println(e.name);//This will throw NPE

            int k =9/0;// This will throw AE
        }catch(NullPointerException n){
            System.out.println("NE is coming...");
            n.printStackTrace();
        }
//        catch(ArithmeticException e){
//            System.out.println("AE is coming...");
//            e.printStackTrace();
//        }
        catch (Exception e){
            System.out.println("Some exception is coming");
        }
        catch (Throwable e){
            System.out.println("Throwable exception is coming");
        }
    }
}
