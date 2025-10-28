package classandobjects;

//Jan_15_MethodsExamplesWithArrayList_MethodOverloading_CompileTimePolymorphism
//Program no - 1
public class Testing {

    // WAF:
    // launch a browser --> chrome//ff//safari//edge
    // statement: browser is launched
    // return: true/false -- boolean (Browser is launched or not?)
    // (Input parameter) -- launchBrowser(browserName (string))

    //Single return
    public boolean launchBrowser(String browserName) {

        //1 copy of this function will be given to/stored inside the object( when we create it) and object is inside the heap

        System.out.println("launching the browser..." + browserName); //Always give nice message to user

        boolean flag = true;  // For all the cases we are returning TRUE, so it is good to set the flag as TRUE here and for DEFAULT case we can set it to FALSE

        switch (browserName.trim().toLowerCase()) { // trim the space and convert the value to lowerCase because user can pass the space and capital letter as well
            case "chrome":
                System.out.println("launch chrome -- PASS");
                break;
            case "edge":
                System.out.println("launch edge");
                break;
            case "safari":
                System.out.println("launch safari");
                break;
            case "firefox":
                System.out.println("launch firefox -- Pass");
                break;

            default:
                System.out.println("plz pass the right browser..." + browserName);
                flag = false;
                break;
        }

        return flag;
    }

    // with multiple returns:
    public boolean launchBrowerTest(String browserName) {
        System.out.println("launching the browser..." + browserName);

        switch (browserName.trim().toLowerCase()) {
            case "chrome":
                System.out.println("launch chrome -- PASS");
                return true; // return should be the last statement
               // break; // We have returned the value above , so this BREAK will become unreachable code. So we can remove it
            case "edge":
                System.out.println("launch edge");
                return true;
                //break; // You are not writing "break" thats okay
            case "safari":
                System.out.println("launch safari -- pass");
                //break; if we write "break" here and then we write "return" then "return" will become unreachable code
                return true;
            // break;
            case "firefox":
                System.out.println("launch firefox -- Pass");
                return true;
            // break;

            default:
                System.out.println("plz pass the right browser..." + browserName);
                return false;
        }
     //   System.out.println("hdhdh"); This will become unreachable
    }
    //"return" and "break" can not be together, because both are same and both will end the CASE
    // can we avoid the "break" in switch case - YES - we can use "return" instead

    //Which approach is good ? 1st (single return) and 2nd (multiple return) - 1st because - Don't need to write multiple return


    public static void main(String[] args) { // This main method will be called by JVM

        Testing test = new Testing();
        if (test.launchBrowser("opera")) {
            System.out.println("enter the url");
        }

        boolean f = test.launchBrowerTest("opera");
        System.out.println(f);
    }
}
