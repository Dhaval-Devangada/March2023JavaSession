package constructorconcept;
//Java_18_ConstructorConcept_ThisKeyword
//Program - 3
public class User {
    String name;
    int age;
    String city;
    double salary;
    char gender;
    boolean isActive;

    //PO - buss -- AC
    //create the user:
    //1. name, age
    //2. name, age, city
    //3.
    //4. all fields

    //default constructor
    //if we don't have below than we can not create the unnecessary objects.
    //We are deliberately not defining default constructor.
//    public User(){
//
//    }

    //This constructor says whenever you want to create the object.Please give me name and age
    //Here we are restricting the constructor that if you have name and age than only you can create the object
    //Give me the username and age
/*    public User(String name, int age) //These are local variables
    {
        System.out.println("name value" +name );
        System.out.println("age value" + age);
       //If we don't write any code here and call the constructor/create the object by passing the "name" and "age" then we will get "null" and "0". Which are default values.
       //Why? because we don't gave/defined any values for "name" and "age" inside the object
        //We have just passed values to the "name" and "age" which are local variables of constructor/special method.
        //"name" and "age" are not global variables.They are local variables and local variables are not part of the object so when we have created the object using parameterized constructor then "name" and "age" won't get defined in the object.
        //But "name" and "age" will be just passed to the method/parameterize constructor.
        //We have "name" and "age" as a global variable / class but we have not initialize them . We have initialize local variables.
        //But our target is to initialize the "name" and "age" which are in the object/actual class variables because when we write "User u1 = new User("Tom", 30);" we are telling java to initilize the "age" and "name" which are there in the object or we are telling java to initilize class variables/global variables
        //But we have passed values to constructor, so now it's constructor's responsibility that whatever we supply to constructor, it should give it to class variables.
    }*/

  /*  public User(String name, int age){
        name = name; //global name = local name
        age=age;
        System.out.println("local name value: " +name );
        System.out.println("local age value: " + age);
        System.out.println("class name value: " + this.name);
        System.out.println("class age value: " + this.age);
        //if assume that left side parameter is global and right side parameters are local
        //so basically we are trying to assign values to global variable
        //but above assignments will also give default values because we are assigning local variables to local variables
        //so how we can assign local variables values to global variables? So that our object can have local variables values
        // We can assign global variables to local like below variables as well
    }*/

  /*  public User(String name1, int age1) {
        name = name1; //"name" is global and "name1" local so now when we run then will have "Tom" as output and object will have "Tom" as value
        age = age1;

     //   but "name1" and "age1" looks slightly ugly
     //   what if tomorrow have more parameters like gender,salary,surname ..Are we going to write gender1,salary1,surname1?
     //   It looks ugly and we don't want to maintain so many parameters as well
     //   We want that all my class variables and local variables have same name
    //     So to do that we have special keyword in java and which is "this" keyword
     //    With the help of "this" keyword we can access all our class variables
    //     this.name = name; //this.global variable = local variable
    //     so now we don't need to change name to name1 , age to age1
    //   Refer below example
    }*/

    public User(String name, int age) //These are local variables
    {
        this.name = name; //this.global variable = local variable
        this.age = age;   //this.global variable = local variable
    //so with the help of this.name and this.age we have initilize the global name and age
    }

    //can we overload the constructor? What if user has name,age and city and want to create account.
    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    //what if another user has name,age and gender and want to create an account.
    public User(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public User(String name, String city, boolean isActive) {
        this.name = name;
        this.city = city;
        this.isActive = isActive;
    }

    public User(String name, int age, String city, double salary, char gender, boolean isActive) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.salary = salary;
        this.gender = gender;
        this.isActive = isActive;
    }


    //so now we have the different constructor so that we can create user using different combination
    //so now we have varities of options to create the user
    public static void main(String[] args) {

   //   User e1 = new User(); //we have commented/not created this default object for this class. so using this line we won't be able to create object. Means we are resticting the unnecessary object creation.So this line will give an error

        //Here what is the purpose of supplying the "name" and "age"?
        User u1 = new User("Tom", 30); //"Tom" will be given to "name" and "30" will be given to "age"
        System.out.println(u1.name + " " + u1.age);

        User u2 = new User("Taru", 35, "LA");
        System.out.println(u2.name + " " + u2.age + " " + u2.city);

        User u3 = new User("Peter", 20, "Bangalore", 12.33, 'm', true);
        System.out.println(u3.name + " " + u3.salary  + " " + u3.isActive);

        //User u4 = new User();  //you should not create user without any information

     //   Testing t1 = new Testing(); // we won't be able to create this as "Testing" class default constructor is set to private
     //   t1.getBrowserName();

        Testing.getBrowserVersion(); // In testing class we have created the default constructor as private but we have defined "getBrowserVersion" method as STATIC. So we are able to access this method.


        Employee e1 = new Employee(); //We are able to create this, because in the "Employee" class we have the default constructor created. so anyone can access the "Employee" class from anywhere

   //     System sys = new System(); //System class is having private constructor in JAVA so we won't be able to create object of it.
        System.gc(); //so everything(data members-variables and methods) in system class is static in nature . So can call it using class name
//There is no non-static property in the system class because of the private constructor
    }
}
//we can not create unnecessary object of this class
//we can not create any random object of this class
//we can not create default constructor of this class
//suppose we don't have any information of the user and user is able to create account which is not good and unnecessary user got created
//we really want to restrict unnecessary object creation that is the main purpose of the constructor
//2nd purpose - Constructor is helping us to initialize our class variables with the help of "this" keyword

//purpose of constructor is always helping me to create the object of respective class
// & it is also restricting unnecessary object creation
// &also restricting unnecessary default object as well
// & also helping us initialize our class variables for the respective object
// & we don't need to write ugly code like u1.name="Tom",u1.age=22

//whatever is required, you supply to constructor and constructor will initialize the value

//on what basis we are creating the constructor or just randomly we are creating the constructor

//you are java developer
//PO will give business logic acceptance criteria
//Want to create registration page
// And you can create the user with below combination
//1.name,age
//2.name, age and city
//3.all the fields'

//so as java developer we need to create constructor based on our requirement
