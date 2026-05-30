package ExceptionHandling.videoNo25.customExceptionHandling.customeException;

public class Browser {
    public static void main(String[] args) {

        String name = "naveen";   //If browser name is "chrome" in that case program will run smoothly
        //what if browser name is "naveen"

        if(name.equals("chrome")){
            System.out.println("Launch chrome");
        }
        else{
            System.out.println("browser not found");
        }

        System.out.println("Enter the URL");
    }
}
/**
 * If browser name is "chrome" in that case program will run smoothly
 * Below is the o/p
 * Launch chrome
 * Enter the URL
 *
 * what if browser name is "naveen"?
 * Below is the o/p
 * browser not found
 * Enter the URL
 *
 * Don't you think it's a bug in the code > Without browser how can you enter the URL?
 * How to handle these scenarios?
 *
 *Now what should we do if browser name is not available?
 * We need to throw our own exception > we don't want to proceed further > means we will throw the exception forcefully
 *
 * What java says that
 * I will execute the code line by line
 * If the condition is not satisfied we will go to else part and then will execute next line of code
 * So here we will try to enter the URL, but we won't be able to enter it.Because there is no browser
 * so it's a bug in the code
 *
 * So if browser is not found then I want to throw my own exception
 * But which exception I want to throw
 * If you see the exception Hierarchy then there is no exception like "browser not found" exception
 * Java can not give you exception for each and everything
 *So java says if you want to create your own exception then you can do it
 *
 * So what we can do, java says why don't you create one more class and attach it with "RunTimeException"
 * Means create custom exception class and attach it with "RunTimeException"
 * Attach it with "RunTimeException" Means - Create child of run time exception
 * So we will add your exception and then you can handle with your own exception
 *
 * So to achieve it, what we will do here is that we will create our common exception class here
 * So for that we have created "FrameworkException" class, which is our common exception class here
 */