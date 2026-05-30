package ExceptionHandling.videoNo25.customExceptionHandling.customeException;

public class UpdatedBrowser {
    public static void main(String[] args) {

        String name = "naveen";   //If browser name is "chrome" in that case program will run smoothly
        //what if browser name is "naveen"

        if(name.equals("chrome")){
            System.out.println("Launch chrome");
        }
        else{
            System.out.println("browser not found");
            throw new FrameworkException("browser not found");
            /**
             * Here we don't need to write throws or try-catch block, RunTimeException will take care of it automatically at the Runtime
             * Where exactly we are going to use this?
             * We are going to use "throw new FrameworkException("browser not found");"  for the negative condition > whenever we are coming to the else part
             * Or in case of "switch" case whenever we are coming inside the "default" case
             * Whenever you want to throw any "Exception" like data mismatch /data is not coming / data is equal to null in that case i really want to "throw" the exception, in that case we can really throw our own exception
             * So in that case, it will immediately terminate [This line - throw new FrameworkException("browser not found");] program here
             * And then it will not go to the "System.out.println("Enter the URL");" line
             *
             * now pass the browser as "chrome" > it will absolutely work fine
             * Any wrong name then it will through the exception
             * Exactly same thing is done by the developer
             * In framework we will also create the custom exception class which will take care if all our exception properly
             */
        }

        System.out.println("Enter the URL");
    }
}
