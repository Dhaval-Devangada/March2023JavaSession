package WebDriver_Arch;

//Don't relate with selenium
//What is the target? What problem we are going to solve?
//Target is that with our automation tool/app we really want to perform something on the browser
//click, enter text, find the element, close the browser on different browser
//Now need to think of approach that should we opt for interface or abstract class
//interface approach
public interface WebDriver {

    //Method to click anywhere in browser
    public void click();
    //WebDriver can not take any decision that how exaclty click will work
    //WeBDriver has no idea how click will work on Safari,on Chrome, On Firefox
    //All the browser has different DOM structure so click/browser any feature has different working mechanism/code for diff browser
    //So webDriver can not take any decision

    //Method to enter text
    public void sendKeys();

    //Method to close the browser
    public void quit();

    //To find the element
    public void findElement(String element);

    /**
     * We have 4 above methods. Now we will create child class for it.
     * We have created "ChromeDriver.java"
     * So what exactly "ChromeDriver" has to do now
     * ChromeDriver got the instruction from the "WebDriver" that if you want to automate you need to implement WebDriver interface's "Abstract" methods in your class and you can define how you want click
     * ,because WebDriver does not have any idea how Chrome browser click is working.
     * So ChromeDriver needs to implement "WebDriver"
     * ChromeDriver Needs to implement all the abstract methods declared in "WebDriver" interface
     * WebDriver is totally different entity and chromeDriver is totally different entity
     *
     *
     * In ChromeDriver class we have defined the behaviours(Of all abstract method of WebDriver's class) which is specific to Chrome
     *
     * Now what is the advantage of interface?
     * - We can create one more class - Firefox
     * - Firefox also implementing the WebDriver
     * - So now firFoxDriver can also perform all the same operation but according to the firefox - They will define their own logic for clicking and all other operation
     *
     * - We can create one more class - edge
     * - edge also implementing the WebDriver
     * - So now edge can also perform all the same operation but according to the edge - They will define their own logic for clicking and all other operation
     *
     * Now we want to test this feature
     * - We will get to know the advantage of the Top casting also
     * Suppose we want to automate AMAZON application
     *
     *
     *
     *
     */
}
