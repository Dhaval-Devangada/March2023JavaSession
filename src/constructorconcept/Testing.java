package constructorconcept;
//Java_18_ConstructorConcept_ThisKeyword
//Program - 4
public class Testing {

    // Below is our requirement
    // no one can create the object of this class
    //How can we do it?

    //we can create the private constructor
    //so anyone tries to create the object of this outside of this class then he won't be able to create it
    //so in which case we are going to use this "private" constructor
    //Within the class we can create the object of this class. In the main method.
    private Testing() {

    }

    //so now, if class is having private constructor and no-one can create the object of this class. And we want to other classes to use the methods of this class then what type of method I have to define in this class - Static
    public static void getApp() {

    }

    public static void getAppNumber() {

    }

    public static void getBrowserVersion() {

    }
    public void getBrowserName() {

    }


    public static void main(String[] args) {
        Testing t1 = new Testing(); //Within the class can create the object. It dosen't matter that our constructor is private,public or whatever.
        //But if we have main method in some other class and if  they try to create the object there, than we won't be able to create it.
    }
}

//So if our class's default constructor is private in nature than no-one can create the object of this class
// our class's default constructor is private then all the methods of that class could be STATIC