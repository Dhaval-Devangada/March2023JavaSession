package WebDriver_Arch_Correct_Approach;

public class AmazonTest {
    public static void main(String[] args) {
        
//        ChromeDriver chromeDriver = new ChromeDriver();
//        FireFoxDriver fireFoxDriver = new FireFoxDriver();

       String browserName="FIREFOX";//CHROME
       // Created variable to decide that on which browser you want to run
        // "BrowserName" is coming from XMl,Excel or configuration file. Assume that browser name is coming from other resource
        //Then on the basis of that we will start writing our cross-browser logic

        WebDriver driver = null;
        // Still we have not decided that which case is going to satisfy so initially we are keeping the driver null
        //We are declaring the "driver" here so that we can use it in all our cases

        switch (browserName.toLowerCase()){
            case "chrome":
                driver= new ChromeDriver(); // This is top-casting or up-casting
                break;
            case  "firefox":
                driver= new FireFoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Please pass the correct browser.....");
                break;
        }

        driver.findElement("email id");
        driver.sendKeys();
        driver.click();
        driver.quit();
      //  driver.browserVersion();

    }
}
//Try using diff browser name and run the program
//Try passing wrong browser name
//We don't need to comment and uncomment
// With the top-casting we can not call the individual methods of the "ChromeDriver" or specific browser. This is the disadvantage. We know that.
//But we have not designed any individual methods in the chromeDriver. All the methods are overridden methods because "design" is in our control
// We have designed in a such a way that we always follow the "WebDriver" interface.And we have not created any individual method of the chromeDriver.Because "ChromeDriver" is fully dependent on the WeBDriver interface
//  will know that what kinds of methods I should have it
//Exactly same thing have been done by selenium guys as well. They have not created respective individual methods in the specific driver classes
//What is the advantage of creating the "individual" methods of chromeDriver here.What extra you are doing in Chrome which is not available in the FF
//Top-Casting does have disadvantage but we are not using disadvantage in our design.
//What is the other advantage of this - Can we launch all the browse together? - YEs but not by just this logic - We need to add more logic - We need to create THREADS here as well with the help of TestNg
//Top-casting will help us to achieve  parallel execution also
//Suppose we have 3 diff threads 1 thread will launch CHROME 2nd will Launch FF and 3rd will Launch Safari
//All the 3 threads will come 1 by 1  So there will not be any deadlock condition
//Individual THREAD will come separatly and will run whole code for specific browser
//Each thread will set/initiliaze the "browserName" variable
//This is the real time use case of top casting - You can give this example at a time of interview as well

//But why WebDriver is an interface? We can achieve the same thing with abstract classes as well
//Why selenium guys have created WebDriver as an interface
//1.WebDriver can not take any decision
//2.WebDriver has no idea how CHROME,SAFARI,FIREFOX are working.
//3. WebDriver is a common platform or common interface that they have created where all the standard methods to perform the userActions on the browser are defined there
//Now it's their class's(CHROME,FF,Safari) responsibility to define "click, sendKeys,quit,findElement" and other methods

//We had created the PAGE class as an ABSTRACT class and not as Interface
//Let's see we are designing a WebPage. In terms of WebPage I would prefer that ABSTRACT is a batter approach. Why?
//Because we know that every page will have it's title and the URL so those two methods we can make it ABSTRACT in nature
//But we fell that through-out the application "defaultTimeOut" should be "20 sec" so we have given the business logic in "abstract Page" class
//Some method we really want to define in the form of business logic in "abstract Page" class (Like "Search" - User can perform the search from any page and if any page wants to override then it can override it). Here we are not talking about "STATIC or DEFAULT" methods in the interface
//So here we are giving the flexibility. Because Page is already aware that how my pages should work.
//Here we know the design of each page in our application, and we are aware that how each page should work
//"defaultTimeOut" should be 20 sec for all the pages but login says "I really want to override" but "HomePage" says  "I don't want to override"
//So we are not putting any burden on "homePage" and other files to implement the logic unnecessarily because "Page" is already of aware that business logic. Page is already aware of that "How exactly search will work". "Search(), defaultTimeOut()" is common for everyone.
//So in "Abstract Page" has already written the logic "for search and default timeout" but in case of "interface WebDriver" INTERFACE has no idea - how "click and sendKeys" will work
//Because WebDriver is not a browser. WebDriver is not CHROME,FF or Safari browser.
//So in this case my preference is that WEBDRIVER should be an interface. I will only define global rules and global methods here and let them (child classes) decided what kind of implementation/logic they want to achieve
//So in certain scenario where you really want 100% ABSTRACTION and you really have no idea that how exactly I want to implement business logic - With this kind of design/If we want to create this kind of design - We will prefer INTERFACES
//And where we really want to define business logic in that cases we will go with the "ABSTRACT" classes
//But again it's developer's choice, It's not like that with WEBDRIVER - It should be INTERFACE
// but advantage is that - suppose tomorrow we are launching another browser - DhavalBrowser - It's a very famous browser
//And selenium says we are supporting "DhavalBrowser" as well. So what exactly they have do it in their code
//They don't need to do anything - DhavalBrowser needs to implement "WebDriver" interface. That's it.
//Now it's "DhavalBrowser's" responsibility to implement those  methods which are defined in "WebDriver" interface
//Because "WebDriver" has no idea how they are going interact with "DhavalBrowser". They can not take any decision there (in WEBDRIVER)
//So when to use ABSTRACT classes and when to use INTERFACES
//It's all about understanding of the design. That how flexible design that you are creating
//Same thing you can achieve with the NORMAL classes as well
//Same thing you can achieve with the ABSTRACTION classes as well
//Same thing you can achieve with the INTERFACE classes as well
//But what is the more preferable standard design will we follow that matters

//What are the 3/4 difference between abstract class and interface
//Interfaces are supporting 100% abstraction and after JDK 1.8 java supporting "default" and "static" method
//generally we don't consider "static" method because it gets stored in the CMA(Common memory allocation).It's common for all the objects
//Without JDK 1.8 it's 100% abstract
//For example - We can give "interface WebDriver" example where interface has no idea that how interface should be implemented
//You can give "FortsHospital"

//Can we create "constructor" with interface - NO but Can we create "constructor" with "Abstraction" - Yes
//We can not create object of "interface" and can not create object of "Abstraction" but Abstract class constructor will be called when you create the object of child class
//Can we achieve the multiple inheritance with the abstract classes - NO (Refer "OOP_AbstractClass")
//Refer WebPage and Page Abstract classes
//Now, IN "LoginPage", try extending 2 classes (Page,WebPage)
//If Java does not give any error then multiple inheritance is supported. Otherwise - NO
//Abstract classes are not supporting "multiple" inheritance because multiple inheritance creating a diamond problem( class to class multiple inheritance is not possible)
//Multiple inheritance is possible with the interfaces. That is the advantage you are getting with interfaces. That you can define the region/country specific rules and regulation and let the class decide that how exactly they really want to implement
//Variables - in the abstract class can we create normal variables - YES (This variable behaves like normal class variable (This not static not final in nature)))
//Variables in interface are final and static in nature
//Default methods are not allowed in abstraction while it's allowed in interface

//Note:
//Interfaces are not defining any template of the class
//Class is a blur print of the object while interface is not a blueprint
//From the classes object should be produced not from the interfaces that's why constructors are not allowed there.

//Can abstract class implements interface? YES  - We can do it
//Try
//public abstract class Page implements WebDriver
//So if we do above then what "LoginPage" has to do now. What is the responsibility of child class now - Because someone has to implement methods of the "WebDriver".
//So it's LoginPage's responsibility to implement those methods of the "WebDriver"
//Above case is very rare case
//Ultimately "abstract class" is a class and class can implement the interface
//Class could be abstract class also and non-abstract class also


//Can we create multiple interfaces inside the same interface? - yes that is possible

//Abstract class is implementing the interface but "Abstract class" does not have any child class?
//So in that case - will Abstract give an error? - NO
//Practically - Abstract class is implementing the interface is not a good logic to implement that
//But if you want to do it then you can do it.

//Can we define the class inside the interface or interface inside the class ? - Do ChatGPT
//Can define the interface inside the interface?(WebDriver and Navigation)(WebDriver and TimeOut)
//Can we define the "interface" inside the Class - YES

//Combination
//Interface to Interface
//Class to class
//Class inside the interface
//Interface inside the class


//Be practice at a time of interview and don't give any bookish answer
//Give examples (line WebDriver)
//Do the brainstorming at the time of interview as well