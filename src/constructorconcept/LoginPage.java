package constructorconcept;
//Java_18_ConstructorConcept_ThisKeyword
//Program - 6
public class LoginPage {
        String username;
        String password;

        //This constructor say that whenever you try to create the object of LoginPage, please supply the "username" and "password" .
        // We will supply the "username" and "password" to respective "userName" and "password" in your object.
        public LoginPage(String username, String password) {
            this.username = username;
            this.password = password;
        }

        //now user says I want to Login //it's a feature
        //we have "doLogin" and "resetPwd" both are non-static so they are part of object
        // so basically both variables and methods are non-static and they are part of object as well.
        // So we can easily access "username" and "password"(class variables) in the "doLogin()" or in the methods which are part of this object.
       // It's like i really want to drive my car and i have two hands , so I can use my hands. I don't need to create new object for that
        // driving car is method and two hands are my variables
        public void doLogin() {
            System.out.println("login to app");
            System.out.println("entering username: " + username);
            System.out.println("entering password: " + password);
            System.out.println("user is logged in");

        }
        // now user says I want to resetPassword // it's a feature
        public void resetPwd() {
            System.out.println("reset my pwd");
        }

        // LoginPage is a separate class and To test the feature of this class we need to create another class
    // We need to create separate class with main method to test the feature of this class
}   //This LoginPage class is behaving like template for me. If tomorrow we have more users through we don't need to change anything in "LoginPage" class
    //"useName" and "password" are template for you to define the LoginPage
//constructor is part of template now to define the object
//"doLogin" and "resetPwd" are my functions for every user. Any user can login and can "reset the password"
//it's not like that for every user we are going to create different constructor and separate Login method and separate ResetPwd methods
//When we try to call them from runners /from the main method /from caller then caller has to create the object because we have different variates of users
//Constructor is not a part of the object. Constructor photo copy will not be given to the object
//Constructor is class property
//If we say it's a part of the object then its limited to that object only/that user only, then what about other users. How we will give username and password to other users
//so it's not like that, if 100 users are there/100 objects are there then every object will hold the constructor body. Don't you think it's a memory issue once again. Unnecessary 100 objects will be created
//So it will not be stored anywhere - No heap, no stack. It's a separate memory allocation for the CLASS LOADERS. These are called class loaders
// Class will be somewhere, right - Class will be stored in class loaders. Constructor will be stored inside the class loaders as well.
