package OOP_Encapsulation;

/*Java_19_OOP_Encapsulation_getter_setter_thisKeyword
Program - 1*
Refer program 2 parallely as well - We have created 2nd program to Test the features of this class
 6*/

//We will not write the main method for these classes. Refer below to understand why we should not write main method in the same program/module?
//Suppose we have one application and in that application we have multiple classes
//Login page class,search page class,home page class , registration page, add to cart ,payment page
//So as a user we want to call methods and constructor of these classes
//so where we should create the main method
//Should we create main method in all(Loginpage,homepage..) the classes to call the methods and constructors of those classes.
//Or should create separate class (runner class) and create the main method there.
//And then main method of the runner class will be called by USER.
//If we create main method in runner class then main method of the runner class is now responsible for creating objects of all other pages and call the respective constructor or the methods
// User will not create main method in all the 100 classes
//we will always create a runner class
//You think from design point of view or application point of view. If I am going to call Amazon page. What we will do is, we will hit "amazon.com" and then we will get the "LoginPage".
//It's not like that for every page we will hit the separate URL/we will create the main method.
// We just need/want an interface where user can interact. So main method is giving us the actual user interface for the user in the form of coding and then main method will start creating the objects and calling the methods


//Encapsulation
//encapsulation is important concept to hide the data member
//so we are going to talk about what do you mean by data hiding
//And how to encapsulate the data? and what is purpose of that? we should understand that
//And can we achieve the encapsulation without the variable and only with the methods
//what is right practice to write the code and write the methods
//tomorrow if we have huge system, then are we going to expose all the methods to the users? - NO
//We will expose only important methods to the users. Not everything we are going to expose to the user
//Because user is not bother about how internally code is working
// User just want to see overall picture and give me some important things and that's it.


import java.security.PublicKey;

//We have class, and we will divide it into two parts
//now there are two section
// 1. Public(Where public properties of the class are there 1.public variables and 2.public methods)
// and 2. Private (Where the private properties of the class are there 1.private variables 2.private methods)
// And then we have a user
// So what all properties can be accessed by the USER from EMPLOYEE class?
// private property can not be accessed by the user because those are private properties and those are restricted
// Outside of this (Employee) class we can not access the private property directly by just creating the object of the "Employee" class
// What about public properties - We can use the public properties because those are publicly available
//If we are not able to access "private" property directly then, is it possible that public methods of the same class can access private property internally-YES because those are part of the same object
// Within the object we can access anything
// So this called encapsulation that -->
// We are not giving direct access to the user for the private properties but we are giving the indirect access, if we want to give that.We say why don't we create public method and these public methods are internally calling the private variables/methods and these public methods are used by the users.So this called encapsulation
// So basically we can call the private methods inside the public methods and those public methods are used by user.
// private variables and methods is used by public layers and those public layers are accessed by the USER
// So USER can not see the private variables/methods
// User will always go and check that what is publicly available
// This is just like an ATM machine and then you are just seeing the overall look a feel,you can not how exactly it is extracting the money and it's calculating the money.
// We can not see the actual cash inside the ATM
// Same thing on the laptop, We can not access the private part of the laptop like circuit or RAM.We can see only public layer
// And through the public layer,the moment we press the key or mouse then, I can interact with my laptop and interal circuit will work on the basis of that.
// And if you think from the user point of view, if you open the entire laptop. Does it really make sense to user? - No
// Encapsulation is saying that why are you giving unnecessary information to user and user is confused and it's not user friendly thing also
// We/user just want mouse and keyboard,monitor to perform the operation,  How internally those are working, we don't bother about it
public class Employee {
    // below are our private class vars/instant vars
    private String name;
    private int age;
    private double salary;
    private int amount;//110, 15
    private int i;


    // we need to create public getter and setter methods:
    // make sure these getter and setter methods are public
    // For every private variable we need to create one getter and setter
    // So if we have 3 variables then 3 getter and 3 setter we need to create so total -6
    // Tomorrow if we have 10 variables then we need to create 10 getters and 10 setters. 10-10 each

    //Now we really want to give values to private members
    //We are creating public method "setName" using which we can define the values of private variables.
    public void setName(String name) { // "name" is local variable because it is defined inside the method
        this.name = name;  // this.gloabl = local
        // Whenever we want to supply local variable to global variable, doesn't matter we are using in the constructor/method. We will always go with the this keyword
        // So here we have initialized the name or set the value of name, so now can we access the "name" in the other class directly? - No
        // Because "setName" method is just setting the value of local variable to global variable.
        // That dosen't change the access modifier from private to public.
        // So what should we do to access it/use the value of "name" in another class?
        // We can create the getter for that
    }

    //Whatever method name we want to write , we can write it.It's not compulsory that we should write only getter and setter only
    public void setEmployeeName(String name){
        this.name = name;
    }

    // We have created this to get the value of private variable in the other class
    //setter means we are going to set the value
    //getter means to get the value
    //We can generate getter and setter automatically from IDE
    public String getName() { // using this method we can access or use the value of "name" in other class
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //Is it really mendetory to create getter and setter?
   // suppose for "amount" we are not creating any setter and just creating only getter. Is it possible?,  just give me the amount
    public int getAmount_1() {
        calculateShareAmount_1();
        return amount;//110, 15
    }
    //But outside of the class, can anyone set the amount- NO - Because there is no "setAmount" but we can the "getAmount"
    //Then who will set the "amount"
    //In "Employee" class we will have method which will set the amount and not via user
    //so getter and setter not mendetory
    //Below method is also private so user can not access it as well
    //User has no idea that how "shareAmount" is getting calculated.
    //so when we combine "1.private int amount", "private calculateShareAmount()" and "public getAmount()" - This we can consider as encapsulation
    //We are hiding the class properties(variables/methods)
    //Both variables and methods can be hidden with the help of private. We can give the access with the public layer
    private void calculateShareAmount_1() {
        int i = 10;
        int fee = 20;
        amount = i + fee;//110, 15  //here we are not assigning local to global so we don;t need to use "this"
    }

    private void calculateShareAmount(int fee) {
        int i = 10;
       // int fee = 20;
        amount = i + fee;//110, 15
    }
    public int getAmount(int fee) {
        calculateShareAmount(fee);
        return amount;//110, 15
    }


}

//No direct access to private variables but we are giving indirect access via public
//Why are we not giving direct access to private variables?
// It is possible we can have some critical variables.
// So if we set the critical variable as private then it can give us data security, and we are not giving the direct access.
// Otherwise, anyone can manipulate the critical data members(variable/method) like name , age and salary
//If we really want to change/ update the value of specific variable then It will only be set via "setter" and value will get set only for that particular object and not for all the objects
// Its totally up to you that if you want to give access to private variables/methods via public layers (You set it and you get it)
//If we are setting the values of 1 private member using one object (e1.name="Dhaval") then it won't impact the value of other object(e2.name="Vijay"/null which is default).Because both are seprate object (Refer EMPTEST.JAVA and e2 object )
//if we have everything public in nature then we don't need getter and setters then your system is not secure and anyone can access you properties and manipulate it