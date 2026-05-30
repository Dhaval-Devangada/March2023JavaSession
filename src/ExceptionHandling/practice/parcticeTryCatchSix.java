package ExceptionHandling.practice;


public class parcticeTryCatchSix {
    String name;
    public static void main(String[] args) {
        parcticeTryCatchSix e = new parcticeTryCatchSix();

        try{
            e = null;
            System.out.println(e.name);
            // Above line will throw nullPointer exception. JAVA will check>Do we have any CATCH block with NPE - YES then > it will be handled
            //And program will execute next line of code
        }catch(NullPointerException n){
            System.out.println("NE is coming...");
            n.printStackTrace();
        }
        System.out.println("Bye");

        e.name = "Komal";
        System.out.println(e.name);

        System.out.println("Bye");
    }

}
