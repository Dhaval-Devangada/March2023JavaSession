package classandobjects;
//Jan_15_MethodsExamplesWithArrayList_MethodOverloading_CompileTimePolymorphism
//Program no - 3

public class Person {

    /**
     *     1 copy of all the below  methods/functions will be given to/stored inside the object( when we create it) and object is inside the heap
     *
     *
     *     Can we create duplicates methods in JAVA?
     *
     *     Two methods with same method name. It is not allowed
     *     The logic you are going to write in second method and first method is same, so compiler will get confused
     *     so below way of writing duplicate(same method name and number of params) method is not allowed in JAVA
     *    public void test(){
     *
     *     }
     *
     *     public void test(){
     *
     *     }
     */

    /**
     *
     *     What is method overloading?
     *     Method overloading always happen within the same class
     *     Method overriding happens with parent and child class
     *
     *     Definition
     *      Method overloading: Poly(many) + Morphism(forms) --> CompileTime(static binding/polymorphism) // Method overloading is also called POLYMOREPHISM. Many forms of the methods/feature
     *      within the same class if you have multiple methods:
     *      1. with the same name
     *      2. with the different parameters
     *      3. with the different types of parameters
     *      4. with the different sequence/order of the parameters
     *      5. return type does not matter
     */

    //below way of creating duplicate methods allowed in JAVA.
    // We can not say duplicate it is known as overloading
    //So keep in mind that there is difference between "duplicate(same method name and number of params)" and overloading(same method name diff params. Please refer definition)
    public void test() {// 0 param
        System.out.println("0 param");
    }

    public String test(int a) {// method with 1 int param
        return "testing";
    }



   /* Below is the example of "with the different types of parameters"*/
    public int test(int a, boolean flag, char c) {// Method with - 3 param - int,boolean,char
        return 100;
    }

    public void test(int a, int b) {// Method with 2 params - Both are int

    }

    public void test(String a) {// method with 1 String param

    }
    /**
     * Examples ended
     */



    /**
     *Below is the example of "with the different sequence/order of the parameters"
     *Both are having same name but the sequence of the parameter is different
     */
    public void test(String a, int b) {// 2 params - string, int

    }

    public void test(int y, String x) {// 2 params - int, string

    }
    /**
     *  Examples ended
     */


    public void test(int b, String a, int c) {// 3 params - int, string, int

    }

    //Only common thing above all methods is - Method name - test
    // 1st Different thing is - 0 param, 1 param, 3 param,
    // 2nd Different thing is - 2 diff params,  3 different params



    // real time use cases of Method Overloading:
    // amazon: On "amazon" which feature should be overloaded
    // search:
    //Think about from the feature point of view.
    //User can perform the search with diff ways
    //Different ways we can search
    public void search() { // Call the "search" and Whatever 10,000 products you have just give me that

    }

    public void search(String name) { // based on the name search will be performed

    }

    public void search(String name, int price) {  // I want good polo t-shirt with 2000 price
        System.out.println(name + " " + price);
    }

    public void search(String name, int price, String color) {// I want good polo t-shirt with 2000 price and with black color

    }

    /**
     *     Above 4 methods are overloaded
     *     We have 4 ways for search
     *     1 copy of all the above/below  methods/functions will be given to/stored inside the object( when we create it) and object is inside the heap
     *     What is the advantage of it? why are we overloading these methods?
     *     Why can't we just write single "Search" method and write 1000 lines of code with so many switch cases and if..else conditions - then maintenance will be hard and won't be able to add/update the feature easily
     *     With overloading maintenance will be very easy
     *     We can add/update the feature very easily
     *     From user point of view advantage is: usability (user can know these are the diff veraites of search i can perform)
     */


    // login:
    //We can overload the login method
    public void login() {

    }

    public void login(String un, String pwd) {

    }

    public void login(String un, String pwd, String role) {

    }

    public void login(String phone, int otp) {

    }

    // payment:
    //We can overload the payment method
    public void doPayment(String cc, int cvv) {

    }

    public void doPayment(String upi) {

    }

    public void doPayment(String cc, int cvv, int otp) {

    }
    //gift card, qr code, cash


    // uber:
    // booking
    //Map is not a feature - so we can not overload it. Map is a element on the page
    //We can overload the feature.
    //Payment is a feature, login is a feature (some activity where user has to perform)

    //What type of booking I want?
    public void booking(String stPoint, String endPoint) {

    }

    public void booking(String stPoint, String endPoint, String carType) { //St point, end point and I am really particular about CAR

    }

    //255 is the limit if parameters/arguments which we can pass to method
    public void booking(String stPoint, String endPoint, String carType, int persons) {

    }
    /**
     * Real Time Examples ended
     *
     */


/*
What if we have same type as a parameter and just diff is PRIMITIVE and NON-PRIMITIVE
 */
    public Integer pop_c(Integer a) { //call/pass by ref  //Give me the reference of the class
        System.out.println("Integer type - bye");   //Integer a - is the reference of the object without creating object
        return 100+a;               // this pop-c method says that you have to supply the value in the form of object only  // unboxing then boxing
        //All the wrapper class are wrapped around primitive data types - It can handle the object and can handle normal value as well
    }

    public Integer pop_c(int a) { //call by value
        System.out.println("int type_ hiiiii");
        return 1000;
    }


    /*
    Below is also overload
    We have primitive and non-primitive as a parameters
     */
    public Integer pop(Integer a) {
        System.out.println("byeeee");
        return 1000;
    }

    public Integer pop(int a) {
        System.out.println("hiiiii");
        return 1000;
    }

    /*
    When we call the below method
    popIt(20) then first method will be called
    popIt(253641236L) then second method will be code
    We can select any method from the suggestion but execution depends upon the argument we pass
    If we pass "long" argument then 2nd method will be called and if we pass "int" argument then 1st method will be called
     */
    public int popIt(int a) {
        System.out.println("hiiii");
        return 1000;
    }

    public int popIt(long a) {
        System.out.println("hello");
        return 1000;
    }

    /**
     * primitive and non-primitive examples ended
     *
     */



    public static void main(String[] args) {
        Person p = new Person();
        // Which method has to be called -- it's already decided at the compile time --it will not be decided at the run time.
        // When JVM compile the code from .JAVA to .CLASS file then, in the .class file it is already clear that which method has to be called at run time
        // So JAVA won't get confused/will not need to take decision at run time
        // So compile time polymorphism is faster than "run time poly" because it is already decided that which method has to be called
        // In run time compiler is totally confused that which method has to be called , parent class method/ child class method

        p.search("macbook");
        p.search("Mouse", 1000);
        p.search("laptop", 1000, "silver");


        int u = p.pop(10);
        System.out.println(u);//1000

        p.pop_c( 125);


    }
}

//During interview
//Give the Definition
//Give the real time example
//In polymorphism - we need to explain both - 1.method overloading 2. method over ridding
//There are two types of polymorphism
//1.Compile time(static) 2. Run time(Dynamic)

/*
Why it is compile time? -> Because before running the code, compiler is already aware that which method has to be called
      p.search("macbook");
      p.search("Mouse", 1000); //I need to call this method where this parameters are there
      p.search("laptop", 1000, "silver");
*/

//We can not overload each and every method
//We need to check the feature -> Does feature have diff varieties?
//all above methods => All the feature are pointing to the specific feature only.
//Diff varieties of login, payment, booking


/*
* What other parameters we can pass while our type is Integer
* Since the parameter type is Integer, you can pass:

a literal integer obj.pop_c(10)

an Integer object
* Integer x = 25;
* obj.pop_c(x);

an int variable
* int y = 30;
* obj.pop_c(y); ← autoboxed to Integer

even null obj.pop_c(null); — but this will throw a NullPointerException when 100 + a executes.

* */


/**
 * Real Time Examples
 *
 * ⚙️ 1. Selenium/Web Automation — Clicking Elements in Different Ways
 *
 * In automation frameworks, we often click buttons in different ways — based on what info we have.
 * 👉 So, we overload the clickElement() method.
 * public class ElementActions {
 *
 *     // Click by WebElement
 *     public void clickElement(WebElement element) {
 *         element.click();
 *         System.out.println("Clicked using WebElement");
 *     }
 *
 *     // Click by locator
 *     public void clickElement(By locator) {
 *         DriverUtil.getElement(locator).click();
 *         System.out.println("Clicked using By locator");
 *     }
 *
 *     // Click using JavaScript
 *     public void clickElement(String cssSelector) {
 *         WebElement el = DriverUtil.getElement(By.cssSelector(cssSelector));
 *         DriverUtil.ClickWithJS(el);
 *         System.out.println("Clicked using JS executor");
 *     }
 *
 *     public static void main(String[] args) {
 *         ElementActions ea = new ElementActions();
 *
 *         WebElement loginBtn = DriverUtil.getElement(By.id("login"));
 *         ea.clickElement(loginBtn);                   // WebElement
 *         ea.clickElement(By.xpath("//button"));       // Locator
 *         ea.clickElement("#submit-btn");              // CSS selector + JS click
 *     }
 * }
 *
 *
 *
 * 💬 2. Logger Utility — Log Different Types of Messages
 *
 * Logging utilities (like Log4j, SLF4J, or custom ones) often use method overloading.
 *
 * public class LoggerUtil {
 *
 *     public void log(String message) {
 *         System.out.println("INFO: " + message);
 *     }
 *
 *     public void log(String message, int errorCode) {
 *         System.out.println("ERROR " + errorCode + ": " + message);
 *     }
 *
 *     public void log(String message, Exception e) {
 *         System.out.println("EXCEPTION: " + message);
 *         e.printStackTrace();
 *     }
 *
 *     public static void main(String[] args) {
 *         LoggerUtil log = new LoggerUtil();
 *
 *         log.log("Test started");
 *         log.log("Element not found", 404);
 *         log.log("Timeout occurred", new RuntimeException("Wait failed"));
 *     }
 * }
 *
 *
 * 💰 3. Banking System — Deposit Functionality
 *
 * A real business case:
 * A deposit() method can accept cash, cheque, or online transfer — same method name, different parameters.
 * public class BankAccount {
 *
 *     public void deposit(double amount) {
 *         System.out.println("Deposited cash: ₹" + amount);
 *     }
 *
 *     public void deposit(String chequeNumber, double amount) {
 *         System.out.println("Deposited ₹" + amount + " via cheque: " + chequeNumber);
 *     }
 *
 *     public void deposit(double amount, String upiId) {
 *         System.out.println("Deposited ₹" + amount + " via UPI: " + upiId);
 *     }
 *
 *     public static void main(String[] args) {
 *         BankAccount acc = new BankAccount();
 *         acc.deposit(5000.00);
 *         acc.deposit("CHK123456", 8000.00);
 *         acc.deposit(12000.00, "dhaval@upi");
 *     }
 * }
 *
 *
 *
 * 📦 4. E-commerce — Placing Orders
 *
 * Overloaded methods for placing an order using different types of inputs.
 * public class OrderService {
 *
 *     public void placeOrder(String productName) {
 *         System.out.println("Order placed for product: " + productName);
 *     }
 *
 *     public void placeOrder(String productName, int quantity) {
 *         System.out.println("Order placed: " + productName + " x" + quantity);
 *     }
 *
 *     public void placeOrder(String productName, int quantity, String couponCode) {
 *         System.out.println("Order placed: " + productName + " x" + quantity + " with coupon " + couponCode);
 *     }
 *
 *     public static void main(String[] args) {
 *         OrderService order = new OrderService();
 *
 *         order.placeOrder("Shoes");
 *         order.placeOrder("T-Shirt", 2);
 *         order.placeOrder("Watch", 1, "FESTIVE25");
 *     }
 * }
 *
 *
 * 📱 5. Notification System — Send Notifications via Email, SMS, or Push
 * public class NotificationService {
 *
 *     public void send(String email, String subject, String message) {
 *         System.out.println("Email sent to " + email + ": " + subject);
 *     }
 *
 *     public void send(String phoneNumber, String message) {
 *         System.out.println("SMS sent to " + phoneNumber + ": " + message);
 *     }
 *
 *     public void send(String message) {
 *         System.out.println("Push Notification sent: " + message);
 *     }
 *
 *     public static void main(String[] args) {
 *         NotificationService ns = new NotificationService();
 *
 *         ns.send("user@example.com", "Login Alert", "You just logged in");
 *         ns.send("+919876543210", "Your OTP is 1234");
 *         ns.send("New offer available!");
 *     }
 * }
 *
 *
 * 🧪 6. API Automation — Hitting API with Different Data Types
 *
 * You can overload a method to call APIs with or without headers, or different body formats.
 * public class ApiClient {
 *
 *     public void sendRequest(String endpoint) {
 *         System.out.println("GET Request sent to " + endpoint);
 *     }
 *
 *     public void sendRequest(String endpoint, String jsonBody) {
 *         System.out.println("POST Request to " + endpoint + " with body: " + jsonBody);
 *     }
 *
 *     public void sendRequest(String endpoint, Map<String, String> headers, String jsonBody) {
 *         System.out.println("POST Request to " + endpoint + " with headers and body");
 *     }
 *
 *     public static void main(String[] args) {
 *         ApiClient api = new ApiClient();
 *
 *         api.sendRequest("/users"); // GET
 *         api.sendRequest("/login", "{\"username\":\"admin\"}"); // POST
 *         api.sendRequest("/update", Map.of("Auth", "Bearer 12345"), "{\"id\":10}");
 *     }
 * }
 *
 *
 * 📊 7. Report Generator — Generate Reports in Different Formats
 * public class ReportGenerator {
 *
 *     public void generateReport(String type) {
 *         System.out.println("Generating " + type + " report");
 *     }
 *
 *     public void generateReport(String type, String format) {
 *         System.out.println("Generating " + type + " report in " + format + " format");
 *     }
 *
 *     public void generateReport(String type, String format, boolean sendEmail) {
 *         System.out.println("Generated " + type + " report in " + format + " and emailed: " + sendEmail);
 *     }
 *
 *     public static void main(String[] args) {
 *         ReportGenerator r = new ReportGenerator();
 *
 *         r.generateReport("Sales");
 *         r.generateReport("Customer", "PDF");
 *         r.generateReport("Inventory", "Excel", true);
 *     }
 * }
 *
 *
 * 🚀 8. Math/Utility Class — Calculate Area of Different Shapes
 * public class AreaCalculator {
 *
 *     public double area(double radius) { // Circle
 *         return Math.PI * radius * radius;
 *     }
 *
 *     public double area(double length, double width) { // Rectangle
 *         return length * width;
 *     }
 *
 *     public double area(double base, double height, boolean isTriangle) { // Triangle
 *         return 0.5 * base * height;
 *     }
 *
 *     public static void main(String[] args) {
 *         AreaCalculator a = new AreaCalculator();
 *
 *         System.out.println("Circle: " + a.area(5));
 *         System.out.println("Rectangle: " + a.area(4, 6));
 *         System.out.println("Triangle: " + a.area(4, 5, true));
 *     }
 * }
 *
 *
 * | Domain       | Method Name        | Purpose                    |
 * | ------------ | ------------------ | -------------------------- |
 * | Automation   | `clickElement()`   | Different click strategies |
 * | Logging      | `log()`            | Info / Error / Exception   |
 * | Banking      | `deposit()`        | Cash, Cheque, UPI          |
 * | E-Commerce   | `placeOrder()`     | Different ways to order    |
 * | Notification | `send()`           | Email, SMS, Push           |
 * | API Testing  | `sendRequest()`    | GET / POST / with headers  |
 * | Reports      | `generateReport()` | Different formats          |
 * | Math         | `area()`           | Different shapes           |
 *
 */