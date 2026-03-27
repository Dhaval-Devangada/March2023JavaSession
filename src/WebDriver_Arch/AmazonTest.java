package WebDriver_Arch;

public class AmazonTest {
    public static void main(String[] args) {

        //Take everything as a normal classes and normal interfaces
        //Can we create the object of WebDriver here? - No because it's an interface
        //Can we create the object of ChromeDriver - YES

        ChromeDriver chromeDriver = new ChromeDriver();
        //What will happen due to "new ChromeDriver()" line - constructor will be called
        //But we don't have any explicit constructor so JAVA will add hidden default constructor
        //But if we don't want any hidden constructor then we will add explicit constructor
        //We have added the constructor for all the browser
        //In the constructor we have written the logic of "Launching/opening browser"
        //So whenever we create the object of specific browser then respective constructor will be called and respective browser will be launched
        //We don't have any concept of "constructor" and we can't create the constructor in interface  so java will not go to WebDriver interface to look for any constructor

        //So now with "chromeDriver" reference we can call any method of the "ChromeDriver()" class
        chromeDriver.findElement("emailId");
        chromeDriver.sendKeys();
        chromeDriver.click();
        chromeDriver.quit();


        //Now suppose we want to open our Amazon application on "Firefox" then what should we do
        //Can we use the same "chromeDriver" to open the "Firefox" - NO  - "chromeDriver" os the object reference of "ChromeDriver"
        //So we need to create separate object for the firefox

        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        //Now can can perform the exactly same thing on firefox as well
        fireFoxDriver.findElement("emailId");
        fireFoxDriver.sendKeys();
        fireFoxDriver.click();
        fireFoxDriver.quit();

        //So tomorrow if we have 5 Browser then we need to create 5 different objects and will write the same code for every browser
        //We can remove/comment out the code for Chrome when we want to run our app on FF and vice versa
        //We can remove/comment ou the code for edge when we want to run our app on chrome and vice versa
        //In real time if want to run our app on different browser then are we going to comment and uncomment the code  - NO - Not ideal
        //I want to use multiple browser at the same time and what if we have a requirement for the parallel execution also
        //With above approach we can run our script or run our app only on 1 browser then for other browser we need to comment and uncomment
        //if this code is running on - then On production we don't do comment and uncomment
        //So above is not the right approach
        //Tomorrow if we have 10 browsers then we can not right 10 drivers that's not a good approach
        //For right approach refer - WebDriver_Arch_Correct_Approach Package
    }
}
