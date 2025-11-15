package constructorconcept;
//Java_18_ConstructorConcept_ThisKeyword
//Program - 7
public class LoginTest {

        //The class where we have main method is known as runner class / caller class
        public static void main(String[] args) {

            //taru
            LoginPage lp = new LoginPage("taru@gmail.com", "taru@123");
            lp.doLogin();

            //suppose we have second user
            //every user have different machine
            //user2 can not use user1 object
            // and for Vijay(2nd user) we don't need to create another constructor, the same will be used
            //vijay
            LoginPage lp1 = new LoginPage("vijay@gmail.com", "vijay@123");
            lp1.doLogin();

            //username and password will be passed to constructor
            //and constructor will pass it to class variable/object
            //we have "doLogin" and "resetPwd" both are non-static so they are part of object
            // so basically both variables and methods are non-static and they are part of object as well
            // So class methods can directly access the class variable without creating any object. Because both are part of the same object.
            //power of object oriented programming - create one single object and access all the data members

        }
}
