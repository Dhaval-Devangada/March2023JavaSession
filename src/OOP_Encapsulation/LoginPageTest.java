package OOP_Encapsulation;

public class LoginPageTest {
    public static void main(String[] args) {
        //LoginPageTest:
        LoginPage lp1 = new LoginPage();
        lp1.setUsername("admin@gmail.com");
        lp1.setPassword("admin@123");
        lp1.doLogin();

        LoginPage lp2 = new LoginPage();
        lp2.setUsername("cust@gmail.com");
        lp2.setPassword("cust@123");
        lp2.doLogin();

        //If we don't set the value then we will get the default values and user won't be able to login
        LoginPage lp3 = new LoginPage();
//        lp3.setUsername("cust@gmail.com");
//        lp3.setPassword("cust@123");
        lp3.doLogin();
    }
}
