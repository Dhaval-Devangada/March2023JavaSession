package OOP_AbstractClass;

public abstract class AmazonTest {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.title();
        loginPage.url();
        loginPage.displayLogo();
        loginPage.doLogin();
        Page.displayFooters();
        loginPage.loadingTime=20;
        //We are able to change variable value means "abstract class variable" is not final in nature
        //Also we are able to access "abstract class variable(loadingTime)" using the reference variable, and it doesn't give any error/warning under the reference variable, means Abstract class variable is not static in nature

        System.out.println("-------------");

        //top-casting
        // Child class object can be referred by Parent abstract class reference variable
        Page page = new LoginPage();
        page.title(); //reference type check will pass because "title" method is there in "Page" class
        page.url();//reference type check will pass because "url()" method is there in "Page" class
        page.defaultPageTimeOut(); //reference type check will pass because "defaultPageTimeOut()" method is overridden from "Page" class

        //Can we access the individual method? - NO - Because reference type check will be failed
        //page.doLogin();

        //Can we do downCasting at compile-time? - Parent class object referred by child class reference variable
        //Not possible because we can not create the object of Abstract class.
       // Page p1 = new Page(); //error - can not instantiate the type page. If we can not create the object of Abstract class then we can not do down casting as well
       // LoginPage lp1 = new Page();

        LoginPage lp2 = new LoginPage(20);

    }
}
