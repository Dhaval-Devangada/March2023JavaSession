package OOP_Encapsulation;
/*Java_19_OOP_Encapsulation_getter_setter_thisKeyword
Program - 4*/
//Refer this and Program no 5 together
public class Register {
    //POJO - plain old java object (private variables , public constructors/combination of multiple constructors and public getters and setters)
    //The class which are having above-mentioned kind of template known as POJO class
    //POJO class can not be the child of any class

    public String dob;

    //private members
    private String name;
    private int age;
    private long phoneNumber;
    private String city;
    private boolean isPerm;

    //public constructor
    public Register(String name, int age, long phoneNumber, String city, boolean isPerm) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.isPerm = isPerm;
    }
    //All of our private variables got initialize when we wrote above line and we will be able to access it with the getters
    //So if we have the constructor then we can avoid setters because "constructor" is behaving like setters for me
    //in the setter we were supplying the data which were setting the global variables
    // in the setter we wre using "this.global=local" and in the constructor we are also using "this.global=local" and both are setting the global variables
    //so it is not mendetory to write setters - No , because we can use constructor
    //But getter is important - Because if there is no getter then we can not fetch the value
    //But if we have use constructor for setting up the value and also we are using the setter then what the use/importance of writing setter through we have used constructor
    // To update the value we can use setters
    //so for the first time to set the value - we are using constructor
    //Then to update the value - we are using setters
    //If we want to prevent the value from updating then we don't to implement setters. So in that case once the value is initialize then it's done/set/finalize. We can not change it.
    //So in that case we create "Registration" class without setters
    //User can create the users and get the information but user can not set the values because there is no update functionality.Once the values are done it's done. YOu can not edit or change it.
    //If we combine our private instance variable with public constructor then is it encapsulation? - YES it is - Because we can still set the values using CONSTRUCTORS. Constructor is behaving like setter for me.
    //So encapsulation is just not about getter and setter. It's about that you are binding the private variables with help of public properties and those properties can be constructor also and can be methods as well
    //If we combine our private instance variable with public methods(getters and setters) then that is also encapsulation
    //encapsulation means both public & private should be there

    //public constructor
    //what if user just have name and phoneNumber and want to register - Then we have below const
    public Register(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // public getter/setter:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPerm() {
        return isPerm;
    }

    public void setPerm(boolean isPerm) {
        this.isPerm = isPerm;
    }

}
//Please refer screenshot 4
//We have Browser class
//Do we really think about 1.checkOSCompitable,checkRAMSIZE,checkChromeVersion,checkChromeService...When we want to lunch the chrome - No
//We just simply launch the chrome
//After clicking on chrome - how the chrome is internally interacting with system that is internal thing
//User don't need to know about complex logic written in those method.
//So we will always create the public layers and just call those private methods
//This browser class example is also classic example of encapsulation (because we have public and private methods)
//And private methods are being called with one public layer
//And in a class one public method should be there otherwise we can not access anything from that class
//If we are making everything private then no one can access it

//Please refer screenshot 5
//Selenium example - which method we use to click on the element?
//.click()
//We have selenium 4.0 library inside which wwe have .click()
//and from testng class we are calling .click() of selenium
//.click() is publicly available
//But to click on the element selenium has to do a lot of operations internally
//check the DOM structure -> check the element is available or not->check on which browser
//So there are other private methods which selenium is internally calling while we use the ".click()"
//there are 10,000 of methods are there they can not give all 10,000 methods to user
//User is not bother about how we are checking the DOM properties and all

//Question
//In the end we are updating the variables using setters, so does encapsulation giving us data security?
//This is not about data security. This is about feature security or I am not exposing my variables / methods directly to the user
//User can set the data or user can set/supply any kind of data but that will be restricted to specific object only.It is only for that particular user only.Other user will not be impacted
//encapsulation is ust about we are not giving direct access to private properties.If you want to access then you need to go through public layer

//Below are the important aspects of the encapsulation
//Securing the data members of the class using encapsulation
//We are hiding unnecessary information to the user using encapsulation
//Whenever we create function like CRUD operations(update the user/get the user/update the profile), in this case also we can use the encapsulation


