package constructorconcept;
//Java_18_ConstructorConcept_ThisKeyword
//Program - 5


//what should we write in the constructor?
//We are not going to create main method now - It is a bad practice
public class Customer {
    String name;
    int custId;
    String city;
    long phoneNumber;

    public Customer(String name, int custId, String city, long phoneNumber) {
        this.name = name;
        this.custId = custId;
        this.city = city;
        this.phoneNumber = phoneNumber;

        //what if we write business logic here
        // suppose we are writing business logic for--getsalary --- finalsalry --return????
        //How will we return ? Can we return from the constructor?
        //Constructor can not give you anything.
        //In the page class constructor we always create initialization part
    }

    //Whenever we write the business logic/future logic/implementation logic.It has to be written inside the method or function
    //We should not write the business logic inside the constructor/should not write complex calculation
    //buss logic, feature logic, implenetation logic
    public int getSalary(int totalCTC, int bonus) {
        return totalCTC + bonus;
    }
}
