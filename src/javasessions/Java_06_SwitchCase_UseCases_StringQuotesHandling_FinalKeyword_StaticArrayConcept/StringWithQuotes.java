package javasessions.Java_06_SwitchCase_UseCases_StringQuotesHandling_FinalKeyword_StaticArrayConcept;

public class StringWithQuotes {
    public static void main(String[] args) {

        String str1= "I love Java and its concepts";
        System.out.println(str1);

        String str = "I love \"India\" and its Nature";

        System.out.println(str); // I love "Java" and its concepts <== we want this output
        // To do it we need to escape the characters => To do that we need to put "\" to the left of "

        String st = "This is my \"Desk\" and \"I like to\" keep oit clean";

        System.out.println(st);

        String username = "admin";
        String password = "admin123";

        String url = "https://" + username + ":" + password + "@abc.com/login.html";
        System.out.println(url);

        //a[text()="Priya"]
        //a[text()='Priya']


        String userName = "Dhaval";
        String xpath = "//a[text()='" + userName + "']"; // By clicking on username we can check that we are referring correct username or not
        System.out.println(xpath);                       // If we are not able to click that means it is not a variable name


    }
}
