package OOP_Abstraction;

//This is the caller class which will have main method and this class also behave like patient/User for us
public class TestHospital {
    public static void main(String[] args) {

        //Can we create the object of "FortisHospital" here?
        FortisHospital fh = new FortisHospital();
        //Which methods we can call using above object reference? - Methods which are available in the "FortisHospital" class.
        //It does not matter that method is overridden method or common method or individual method
        fh.physioServices();
        fh.cardioServices();
        fh.neuroServices();
        fh.emergencyServices();
        fh.dentalServices();
        fh.medicalInsurance();
        fh.medicalTraining();

        //But can we create the object of USMedical? - No
        //Interface object can not be created - Why?
        //Think practically, User is not going to create the object of Interface/USMedical. User will create the object of class/User will go to hospital
        //In object oriented programming language, implementation is always done at class level
        //Suppose if JAVA will allow to create the object of interface then USER will immediately go to interface and will try to call the method from the Interface but we don't have any business logic there. so USEr won't get any service and that is why JAVA is preventing to create the object of interface
        //If there is no implementation then there is no use of creating the object of interface

        //Let's try to create the object of interface. Uncomment below to see the error (cannot instantiate the type USMedical). instantiate means I can not create the object of USMedical
        // USMedical us = new USMedical()

        //In selenium we can not create the object of WebDriver because WebDriver is an interface

        //Can we do the top-casting with interface? - YES
        //Child class object can be referred by parent interface reference variable
        USMedical us = new FortisHospital();
        //We can not create the object of interface but we can create reference of interface that is allowed
        //That interface's reference variable pointing to the RHS(Which is child class object)
        //FortisHospital's object will get created and that object will have all the methods(overridden,common and individual) of "FortisHospital" class. Inside the object everything will be given.
        //FortisHospital's object will have methods from (UK interface,US interface and India interface + common method which is there in all the interfaces+ individual method of "FortisHospital")
        // USMedical
        //Now with the help of us(object reference) can we access method of USMedical which has been implemented in FortisHospital class - YES
        us.physioServices();
        us.cardioServices();
        us.ENTServices();

        //us(reference variable) is coming from USMedical.
        //So Java will check where are you coming from, from USMedical
        //And you are trying to access which methods?
        // If those methods are coming from USMedical interface(reference typecheck will be passed) then using "us" reference variable Java will be able to access USMedical's methods only which are there in "FortisHospital" class
        //Using "us" reference variable java won't be able to access methods of UKMedical interface which are there in the "FortisHospital" class. Because reference type check will fail
        //Using "us" reference variable java won't be able to access methods of IndianMedical interface which are there in the "FortisHospital" class. Because reference type check will fail

        //trying to access methods from "UKMedical" interface. UKMedical interface's methods will not appear in suggestion
        // us.neuroServices();

        //trying to access methods from "IndianMedical" interface.  IndianMedical interface's methods will not appear in suggestion
        //us.oncologyServices();

        //What about common methods?
        //Common methods are coming from/are there in all the interfaces
        //So reference type check will pass(common methods is there in USMedical and "us" reference variable is also a "USMedical" type ) and will be able to access it using "us" reference variable

        //common method
        us.emergencyServices();

        //What about FortisHospital's individual methods?
        //with the help of parent interface or parent interface reference variable we can not access child class's method
        //us.medicalInsurance();

        //We can not access any of the method which are coming from other interfaces (except USMedical) and individual methods
        //We can only and only those methods with top-casting which are coming from the specific interface only.

        //Can we do the down-casting at the compile time? - At Compile time java is not allowing the down-casting
        //What is down-casting -> PArent class object is referred by Child class reference variable
        //But here(in Interface) JAVA is not  allowing to create the object of Parent Interface
        //So at the compile time it-self down-casting is not possible.

        //FortisHospital fh = new USMedical(); //Will get compile time error
        //FortisHospital fh = (FortisHospital)new USMedical();//If we try to convert it forcefully then also we will get compile time error

        //It's not just about learning the syntax
        //Learn what is the use-case?
        //Why are we doing this?
        //What is the purpose of that?

        //There are all the methods in the object but why we are not able to access all the method using "us" reference variable
        //Java is a strict type language. It's not like that, anyone can come and can access any method
        //All the methods are there in the object, but which method is accessible, is dependent upon that who is trying to access that method. It depends on who is the USER
        //If the reference type is US then only USMedical methods will be accessible
        //This is default behaviour in all the object-oriented programming languages
        //If we are giving the access then what is the point of creating the interface as well, we can create the plain class and can give access to all the methods
        //So to provide the data security or to provide the method implementation security. We don't give the direct access

        //Can we create the constructor in the interface?
        // Constructor will be call when we create the object and we can not create the object of interface.
        //So in interface there is no concept of constructor also

        //interface can be final - No
        //Because we need to implement interface's methods in class
        //If we make the interface final that means we are preventing implementation

        //can we have the abstract method final? - No
        //If we make it final then no class can override it
        //So we can't provide business logic /implementation
        //So there is no need of that final abstract method

        //private methods can not be overridden and abstract methods has to be overridden

        //method implementation is also called method overriding

    /*
    Java_22_Interface_JDK1.8Changes_Abstraction_Variables_BuilderPattern_ConstructorChaining
    */
        //How to call the variable defined in the interface? - Using the interface name
        System.out.println("Calling the variable using the interface name: " + USMedical.min_fee);

        //Can We call the variable defined in the interface using the class name? - YES
        System.out.println("Calling the variable using the class name: " + FortisHospital.min_fee);

        //Calling the static method of interface which has a body
        USMedical.USMedPharmacy();

        //Can we call with child class(FortisHospital) as well? - NO (This is slightly strange) - It means,"USMedPharmacy()" can not be inherited in "FortisHospital"
       // FortisHospital.USMedPharmacy();
        //Static methods are coming or getting inherited but variables are not coming or getting inherited.


        //Calling default keyword method from interface with method body using "FortisHospital" classes reference variable
        //We are able to call "billing()" using "FortisHospital's" reference variable because "billing()" is getting inherited from "USMedical" interface
        FortisHospital frh = new FortisHospital();
        frh.billing();



    }



}
