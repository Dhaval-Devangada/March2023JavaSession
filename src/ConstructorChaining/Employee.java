package ConstructorChaining;

public class Employee {

    String name;
    int age;
    double salary;

    public Employee() {
        this("Kapil",20);
        System.out.println("Execution completed");
        //4th use of this keyword
        //Whenever we want to call another constructor from constructor then we can use "this" keyword.
        //And constructor call must be the first statement in the constructor. You can not write it "in between" or "at last"
       // this("Kapil",20); //this will give error because "constructor call must be the first statement in the constructor"

    }

    public Employee(String name, int age) {
        this(name,age,90.0);
        this.name = name;
        this.age = age;
    }

    public Employee(String name,int age, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }



    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.salary);
    }
}

/**
 * Constructor chaining is also possible in JAVA with the help of "this" keyword
 * For parent class constructor calling we can use "SUPER" keyword
 * We can also call variable/method using "SUPER" keyword
 */