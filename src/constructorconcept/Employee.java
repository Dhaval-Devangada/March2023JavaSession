package constructorconcept;
//Java_18_ConstructorConcept_ThisKeyword
//Program - 1
/**
 * Let's see the problem statement first then we will try to solve this
 * What was the problem if we don't have the constructor?
 * How constructor resolves that problem?
 */
public class Employee {

    String name;
    int age;
    String city;

    // const:
    // 1. name should same as class name
    // 2. can not return anything/no void
    // 3. can pass parameters to the const...const overloading? yes its possible
    // 4. how to call a const...we need to create the object of the class and respective const.. will be called

    public Employee() {// 0 param -- default const...
        System.out.println("defalt const...");
    }

    public Employee(int a) {// 1 param
        System.out.println(a);
    }

    public Employee(int a, int b) {// 2 param

    }

    public Employee(int a, String b) {// 2 param
        System.out.println(a+b);
    }

    public Employee(String a, int b) {// 2 param

    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name="Tom";
        e1.age=20;
        e1.city="LA";

        Employee e2 = new Employee();
        e2.name="Dhaval";
        e2.age=21;
        e2.city="Gujarat";

        Employee e3 = new Employee();
        e3.name="Virat";
        e3.age=29;
        e3.city="Vadodara";

        Employee e4 = new Employee(); // Anyone can create object of this class. And if they don't assign any value then that Employee/object won't have any value. That object won't be collected by GC as well because it has the reference.
        Employee e5 = new Employee();// These objects are there in the heap but they don't have any values but the photo copies of all class members(variables/methods) will be given to all the objects.
        Employee e6 = new Employee();// So don't you think its the application in the problem that why are you allowing to create these kind of objects.
        Employee e7 = new Employee();// Because these kind of objects you are creating in the heap and heap is getting increased and these objects are not doing anything because they don't have any value. So thats a problem.
        //What if some employee just has "name" and don't have any other parameter. We don't have any constructor for that.
        //So in conclusion above way is not right way of writing the code.
        //Refer EmployeeOne Program

        //What is issue with above code?
        //1st problem:Tomorrow if i need to create 100 Employee than i need to create 100 objects and need to assign value like above for 100 times
        //2nd problem: Anyone can create object of this class. And if they don't assign any value then that Employee/object won't have any value. That object won't be collected by GC as well because it has the reference.
    }
}
