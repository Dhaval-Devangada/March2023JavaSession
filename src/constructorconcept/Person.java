package constructorconcept;
//Java_18_ConstructorConcept_ThisKeyword
//Program - 8
public class Person {
    String name;
    static String collegeName;//abcd
    //can we create constructor with the static variables? - NO
    //Why it is not allowed? Static is not part of the object And constructor is directly associated with the object.
    //The moment we create object the respective constructor will be called.

    public Person(String name, String collegeName) {
        this.name = name;
        this.collegeName = name; // This will give warning. Why? because "collegeName" is static so, it should be accessed in static way.
        //so never supply static data(variables/method) to constructor. Because it has only one copy stored in META SPACE and which is common for all.(Wheels = 4)
        Person.collegeName = collegeName; // This will change the COLLEAGE name in metaspace means someone is able to manipulate value. (Someone can change the wheels=4 to wheels=5) which is not ideal
        int i=5;//we can create local variable inside the constructor
    }

    public Person (String name, int i,int fee){ //Can we pass the "int i" or "int fee" and "fee" or "i" is not part of any template or class variables. It means fee/i is not part of PERSON class
        //It means how I am going to use "fee" or "i"  now. It means we are trying to write business logic with fee/i.
        //And we never write business logic inside the constructor
        //So don't pass unnecessary parameters to constructor as well
        //In the constructor we always pass whatever the class variables with the non-static variables

    }

    public Person(String name) {
        this.name = name;
    }



    public static void main(String a[]) {
        Person p1 = new Person("Naveen", "ABCD");
        Person p2 = new Person("Tom");

        System.out.println(p2.collegeName); // Here for "Tom" we have not passed "ABCD" through we will get "ABCD" as colleage name for TOM. Because "Colleage" name is stored in CMA

        System.out.println(collegeName);

    }
}

//System/Math is a class common for all. It's not like that system class is behaving differently for you and behaving diff for me
