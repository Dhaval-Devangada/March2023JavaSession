package OOP_Encapsulation;

/*Java_19_OOP_Encapsulation_getter_setter_thisKeyword
Program - 2*/
public class EmpTest {
    //Assume that below main method is behaving like user for us
    public static void main(String[] args) {
        //There is no private constructor in the Employee class so we can create the object of that class
        Employee e1 = new Employee();
      //  e1.name;  // We can not access these variable because these are private variable
      //  e1.age;
      //  e1.name ="Dhaval"; // We can not do this as well because name is private property
        //So to define the name we need to use below method.
        e1.setName("Tom"); // we can access "setName" method because it is publicly available
        e1.setAge(20);
        e1.setSalary(12.33);


        //How to get values of private members? via public methods

        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
        System.out.println(e1.getAmount(100));//30

        //If we are setting the values of 1 private member using one object (e1.name="Dhaval") then it want impact the value of other object(e2.name="Vijay"/null which is default).Because both are separate object
        //So for below we will get defaults values because we have not set the values for below object
        Employee e2 = new Employee();
        System.out.println(e2.getName());
        System.out.println(e2.getAge());
        System.out.println(e2.getSalary());


        //System.out.println(e2.setAmount()); //we have not created any setter for "amount" so we can not set the amount
        //e2.amount = 3000; //we can not do this as well
        System.out.println("e2 object - value of amount: " +e2.getAmount_1());
        System.out.println("e1 object - value of amount: " + e1.getAmount_1());
        //in above statements
        // Here for both object we will get the same value for the amount because we are not changing/manipulating from other class
        //Whatever calculation is done in "Employee" we are just getting it

        //We can manipulate it by passing any value to getAmount method
        //here "amount" will be calculated based on passed arguments
        //so both objects will have diff values because user will pass the diff args
        System.out.println("e2 object - value of amount: " + e2.getAmount(5));
        System.out.println("e1 object - value of amount: " + e1.getAmount(25));

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
