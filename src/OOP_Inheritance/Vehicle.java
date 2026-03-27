package OOP_Inheritance;

/*
Program no - 4
Java_20_OOP_Inheritance_Parent_ChildClass_MethodOverriding_RefTypeCheck_Top_Down_Casting

*/
//We can create the grandparent as well
//This class is parent of CAR class
public class Vehicle {
    public void engine() {
        System.out.println("Vehicle -- engine");
    }

    public void gear(){
        System.out.println("Vehicle -- normal gear");
    }
    //Below method are the part of this video "Java_21_RunTimePolymorphism_FinalClass_Methods_MethodOverriddingRules_OOP_Abstraction_InterfaceConcept.mp4"
    public void speedometer(){
        System.out.println("Vehicle -- normal speedometer");
    }
}
