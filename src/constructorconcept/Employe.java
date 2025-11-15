package constructorconcept;
//Java_18_ConstructorConcept_ThisKeyword
//Program - 2
public class Employe {
    String name;
    int age;
    String city;

    //We always try to restrict unnecessary object creation for that purpose we are going to use constructor of the class
    //Constructor : Construct the object. It means help me to construct the object

    // const:
    // 1. constructor name should same as class name
    // 2. constructor can not/never return anything/no void
    // 3. can pass parameters to the const...const overloading? yes its possible
    // 4. how to call a const...we need to create the object of the class and respective const.. will be called

    // We have different types of parameter
    public Employe() {// 0 param -- default const...
        System.out.println("defalt const...");
    }

    public Employe(int a) {// 1 param const
        System.out.println(a);
    }

    public Employe(int a, int b) {// 2 param const

    }

    public Employe(int a, String b) {// 2 param const with diff types of type
        System.out.println(a+b);
    }

    public Employe(String a, int b) {// 2 param

    }

    public static void main(String[] args) {

        Employe e1 = new Employe(); // We are not passing anything here so default const will be called
        //There is a difference between const calling and func calling
        //The moment we create the respective const immediately respective const will be called
        Employe e2 = new Employe(10); // We are passing int value so 2nd constructor will be called
        Employe e3 = new Employe(10,"Dhaval");// We are passing "int and String" so 4th const will be called

    }

    //But what is the purpose of constructor.We can do same thing using(overloading/ passing diff parameters) method as well
    //So what is the difference between constructor and method?
    // To understand please refer "user" class
}
