package OOP_Inheritance;

/**
 * Program no - 2
 * Java_21_RunTimePolymorphism_FinalClass_Methods_MethodOverriddingRules_OOP_Abstraction_InterfaceConcept
 *
 */
public class Audi extends Car{  //Now the CAR is having two child classes 1.BMW 2. AUDI


    @Override
    public void start() {
        System.out.println("Audi - start");
    }

    public void theftSafety(){
        System.out.println("Audi - theftSafety");
    }
}
