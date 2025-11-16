package OOP_Encapsulation;
/*Java_19_OOP_Encapsulation_getter_setter_thisKeyword
Program - 5*/
public class RegTest {

    public static void main(String[] args) {

        // CRUD:
        //set the value for the first time using constructor
        // POST call -- create a user (This is behaving like post call)
        Register reg = new Register("Neelam", 25, 9898989890L, "Pune", true);//We have to create the object of the class then the constructor will be called

        // check my user profile
        // GET call (This is behaving like get call)
        System.out.println(reg.getName());
        System.out.println(reg.getAge());
        System.out.println(reg.getPhoneNumber());
        System.out.println(reg.getCity());
        System.out.println(reg.isPerm());

        // update the values: (updating the values using setters) //If we want the update functionality then we can user the setters otherwise we can ignore
        // PUT (This is behaving like put call)
        reg.setCity("Bangalore");
        reg.setPhoneNumber(9876543212L);

        System.out.println("--------");

        // check my user profile once again to check the updated values
        // GET call (This is behaving like get call)
        System.out.println(reg.getName());
        System.out.println(reg.getAge());
        System.out.println(reg.getPhoneNumber());
        System.out.println(reg.getCity());
        System.out.println(reg.isPerm());

        System.out.println("--------");

        //Registering using 2nd constructor
        Register reg1 = new Register("Vishnu", 98989898765L);
        //For "name" and "phoneNumber" values will be initialize and for others we will get default values

        // check my user profile
        // GET call
        System.out.println(reg1.getName());
        System.out.println(reg1.getAge());
        System.out.println(reg1.getPhoneNumber());
        System.out.println(reg1.getCity());
        System.out.println(reg1.isPerm());

        //noe we are updating the other data
        // update: PUT
        reg1.setAge(30);
        reg1.setCity("Delhi");
        reg1.setPerm(true);

        System.out.println("---Updated Data-----");

        // check my user profile
        // GET call
        System.out.println(reg1.getName());
        System.out.println(reg1.getAge());
        System.out.println(reg1.getPhoneNumber());
        System.out.println(reg1.getCity());
        System.out.println(reg1.isPerm());

        //
        Selenium.click();

        //Hoe valued can be manipulated if the instance variable is private.
        reg.dob = "1-1-1990";
        reg.dob = "30-12-1996";
        System.out.println(reg.dob);//30-12-1996

        System.out.println(reg1.dob);//null

    }
}
//use of constructor
//unnecessary obj creation
//user need to supply the data for user regi
//we are designing the backend here
