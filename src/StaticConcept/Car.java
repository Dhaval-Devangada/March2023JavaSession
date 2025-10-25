package StaticConcept;

//Java_16_StaticVariables_Methods_PermGenration_MetaspaceMemory
//Program - 2

public class Car {

    String name;    //Every car will have its own name
    String engineNumber; //Every car will have its own engineNumber
    String chasisNumber; //Every car will have its own chasisNumber
    double price; //Every car will have its own price
    final static int wheels=4; //class static final var
    static final int wheels_car=4; // sequance of static and final does not matter
    //It depends upon the use case that we won't our variable final or not
    //final static int wheels_car_=; // This will give an error. Because we have made the value final but java don't know which value is final. So if we make the variable final then we need to define the value as well
    //Static is a class value - its always part of class - its always representing class value
    //Generally we use final for the universal truth -> footer, headers,logo, category, number of months, days in week

    //static method - common for all
    //utils/generic functions
    public static void displayLogo() {  // logo is the common property for all the pages

    }

    public void getUrl() {  // This should be non-static because every page will have diff URL

    }


    public static void main(String[] args) {

        final int i = 10;//local var  // local variable can be final
    //   static int i = 10;//local var //Can we make local variable static in nature? NO
        // Static is a class value - its always part of class - its representing class value -Local variable can not be stored inside the meta space So local variable can not be static
        //local variable can not be part of any object also

        Car c1 = new Car();
        c1.name = "Audi A6";
        c1.chasisNumber = "AEBVNM121212";
   //     c1.wheels =4; // we have already assign the value so we don't need this

        Car c2 = new Car();
        c2.name = "Audi Q5";
        c2.chasisNumber = "AUDI121212122";
    //    c1.wheels =4;

        Car c3 = new Car();
        c3.name = "BMW  X7";
        c3.chasisNumber = "BMWVNM121212";
      //  c1.wheels =4;

        ///Car.wheels = 5; // Some other developr is trying to change the wheels property because he is able to access it
        /// Wheels can not be/ can never be 5 - So this is bug so to resolve it we need to make WHEELS property "final"
        /// The moment we make it final then no one can manipulate the value
        /// final means - constant value - value cannot be changed
        ///static and final both are different
        ///static is common property for all and final is constant value which can not be manipulated

        System.out.println(c3.name +  " "  + c3.engineNumber + " " + c3.chasisNumber + " "  + Car.wheels);

    }
}
/**
 * 3 objects will be created and copies og all the 4 vars will be given to objects
 * 100 objects are there than 100 copies of all the 4 var will be given to objects
 * But wheels vars has same value in all the objects which is 4
 * Wheels memory allocation = Which is taking 4 bytes *3 objects  = 12 bytes in the memory
 *
 * So, wheels is a property of the object but value of wheels is common for all the object which is 4.So we are un necessary assigning for each and every object
 * wheels is common property value(The value is common) for all the cars, so we can make it static so that it will be stored in CMA and will take only 4 bytes in memory
 * Tomorrow if we are creating 100 objects then wheels=4 will take only 4 bytes and not 400 bytes
 * name,chasisNumber,price - Values are not common - so they should be non-static - And every object should have individual copy
 *
 * common value means static property
 * non-common value means non-static property
 *
 * When we create system 80% will be non-static members and 10/20% will be static members
 * So by keeping that in mind java people has created "per generation" with fix memory allocation
 * per generation is static memory - up to 1.7 we had meta space with static memory - which was causing memory issue when we have more static members
 * Meta space is dynamic memory - from 1.8+ - we have More dynamic memory in nature
 * So concept of meta space is -> once meta space is full then it will start taking space on the RAM automatically/dynamically
 *
 * We don't have GC for meta space
 */
/**
 * Browser class
 * Common property for Browser class
 * DOM - Property will be static - Dom will remain same
 * Browser name - non-static
 * Version- non-static
 *
 *
 * Human class
 * Two hands
 * Two legs
 *
 * Amazon - Try to traverse through all the pages
 * Search - will be there on all/most of the pages
 * Menubar - will be there on all/most of the pages
 * Header - will be there on all/most of the pages
 * Footer - will be there on all/most of the pages
 */
/**
 * Real time examples
 * 💡 1. Utility / Helper Classes (Common in Automation)
 *
 * When you create a utility class like DriverUtil, ExcelUtil, FileUtil, or WaitHelper,
 * you make methods static so they can be used directly without creating an object.
 *
 * public class DriverUtil {
 *
 *     public static void waitForElement(WebElement element) {
 *         System.out.println("Waiting for element to appear...");
 *     }
 *
 *     public static void click(WebElement element) {
 *         element.click();
 *         System.out.println("Clicked on element");
 *     }
 * }
 *
 * // ✅ Usage (no need to create object)
 * DriverUtil.waitForElement(loginButton);
 * DriverUtil.click(loginButton);
 *
 * Real-life scenario:
 * In Selenium frameworks, classes like DriverManager, WaitHelper, or ConfigReader often have static methods.
 *
 *
 * 💻 2. Static WebDriver in Selenium Frameworks
 *
 * Used to share the same driver instance across all test classes.
 * public class BaseTest {
 *     public static WebDriver driver;
 *
 *     public static void initDriver() {
 *         driver = new ChromeDriver();
 *         driver.manage().window().maximize();
 *     }
 * }
 * Usage:
 * BaseTest.initDriver();
 * BaseTest.driver.get("https://example.com");
 *
 * ✅ Why static?
 * Because we want one shared driver across test cases, not one per object.
 *
 * 🧮 3. Static Variables for Common Constants
 *
 * Real use: storing global config, timeouts, or URLs.
 *
 * public class Constants {
 *     public static final String BASE_URL = "https://amazon.in";
 *     public static final int TIMEOUT = 10;
 *     public static final String BROWSER = "chrome";
 * }
 *
 * // ✅ Usage
 * System.out.println(Constants.BASE_URL);
 *
 * Why static?
 * Because constants are same for all tests, no need to create new Constants() every time.
 *
 *
 * 🏦 4. Bank Account Example (Static Variable for Shared Value)
 *
 * A static variable is common to all objects — like a bank’s name.
 *
 * public class BankAccount {
 *     static String bankName = "HDFC Bank";  // common for all accounts
 *     String accountHolder;
 *     double balance;
 *
 *     public BankAccount(String name, double bal) {
 *         this.accountHolder = name;
 *         this.balance = bal;
 *     }
 *
 *     public void showDetails() {
 *         System.out.println(accountHolder + " - " + bankName + " - ₹" + balance);
 *     }
 *
 *     public static void changeBankName(String newName) {
 *         bankName = newName;
 *     }
 * }
 * Usage:
 * BankAccount a1 = new BankAccount("Dhaval", 20000);
 * BankAccount a2 = new BankAccount("Ravi", 35000);
 *
 * a1.showDetails();
 * BankAccount.changeBankName("ICICI Bank"); // static method changes value for all
 * a2.showDetails();
 *
 * 🧾 Output:
 * Dhaval - HDFC Bank - ₹20000
 * Ravi - ICICI Bank - ₹35000
 *
 *
 * 🧠 5. Static Block — Used for One-Time Setup
 *
 * A static block runs only once, when the class is loaded.
 *
 * Used for loading config, setting up drivers, reading property files, etc.
 *
 * public class ConfigLoader {
 *
 *     public static String baseUrl;
 *     public static String browser;
 *
 *     static {
 *         // This runs once when class loads
 *         baseUrl = "https://example.com";
 *         browser = "chrome";
 *         System.out.println("Config loaded successfully!");
 *     }
 * }
 *
 * Usage:
 * System.out.println(ConfigLoader.baseUrl);
 * ✅ Real-life: You can use static blocks for one-time initialization in frameworks.
 *
 *
 *
 * 📦 6. Static Factory Method (Design Pattern Example)
 *
 * Example from Java libraries and frameworks:
 * public class WebDriverFactory {
 *
 *     public static WebDriver getDriver(String browser) {
 *         if (browser.equalsIgnoreCase("chrome"))
 *             return new ChromeDriver();
 *         else if (browser.equalsIgnoreCase("firefox"))
 *             return new FirefoxDriver();
 *         else
 *             throw new RuntimeException("Invalid browser");
 *     }
 * }
 *
 * Usage:
 * WebDriver driver = WebDriverFactory.getDriver("chrome");
 *
 * ✅ Why static?
 * Because factory methods return instances — you don’t need an instance of the factory itself.
 *
 *
 *
 * 🧾 7. Static Counter — Tracking Objects Created
 *
 * public class Employee {
 *     static int count = 0; // shared among all employees
 *     String name;
 *
 *     public Employee(String name) {
 *         this.name = name;
 *         count++;
 *     }
 *
 *     public void show() {
 *         System.out.println(name + " | Total Employees: " + count);
 *     }
 * }
 *
 * Usage:
 * Employee e1 = new Employee("Dhaval");
 * Employee e2 = new Employee("Ravi");
 * e1.show();
 * e2.show();
 *
 * 🧾 Output:
 * Dhaval | Total Employees: 2
 * Ravi | Total Employees: 2
 *
 * ✅ Static variable count keeps track across all instances.
 *
 *
 *
 * 🧰 8. Static Inner Class (Used in Builders / Frameworks)
 * Static inner classes are used when the inner class doesn’t depend on outer class instance.
 *
 * Example — Builder Pattern:
 * public class User {
 *     private String name;
 *     private int age;
 *
 *     private User(UserBuilder builder) {
 *         this.name = builder.name;
 *         this.age = builder.age;
 *     }
 *
 *     public static class UserBuilder {
 *         private String name;
 *         private int age;
 *
 *         public UserBuilder setName(String name) {
 *             this.name = name;
 *             return this;
 *         }
 *
 *         public UserBuilder setAge(int age) {
 *             this.age = age;
 *             return this;
 *         }
 *
 *         public User build() {
 *             return new User(this);
 *         }
 *     }
 * }
 *
 *Usage:
 * User user = new User.UserBuilder()
 *                     .setName("Dhaval")
 *                     .setAge(28)
 *                     .build();
 *
 *✅ Common in frameworks like Selenium PageFactory, Lombok builders, etc.
 *
 *
 *🧩 Summary Table
 * | Use Case          | Example                        | Static Type           |
 * | ----------------- | ------------------------------ | --------------------- |
 * | Utility classes   | `DriverUtil.click()`           | Static method         |
 * | WebDriver sharing | `BaseTest.driver`              | Static variable       |
 * | Constants         | `Constants.BASE_URL`           | Static final variable |
 * | Bank name         | Shared variable                | Static variable       |
 * | Config loading    | Static block                   | Static initializer    |
 * | Factory pattern   | `WebDriverFactory.getDriver()` | Static method         |
 * | Counter tracking  | Object count                   | Static variable       |
 * | Builder pattern   | `User.UserBuilder`             | Static inner class    |
 */

/**
 * Think of static as something that belongs to the company —
 * and non-static as something that belongs to an employee.
 *
 * | Entity        | Example      | Belongs To              |
 * | ------------- | ------------ | ----------------------- |
 * | Company Name  | `static`     | Shared by all employees |
 * | Employee Name | `non-static` | Unique per person       |
 * | HR Policy     | `static`     | Common for all          |
 * | Salary        | `non-static` | Individual per employee |
 */

/**
 * 🧩 Summary Table
 * | Concept               | Where Stored | Access               | Lifetime          | Example           |
 * | --------------------- | ------------ | -------------------- | ----------------- | ----------------- |
 * | **Static variable**   | Method Area  | `ClassName.variable` | Till class unload | `Bank.bankName`   |
 * | **Instance variable** | Heap         | `object.variable`    | Till object GC    | `b1.customerName` |
 * | **Local variable**    | Stack        | Within method        | Till method ends  | `int x = 10;`     |
 * | **Static method**     | Method Area  | `ClassName.method()` | Till class unload | `Math.sqrt()`     |
 * | **Static block**      | Method Area  | Executes once        | Till class unload | Config setup      |
 */