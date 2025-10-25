package StaticConcept;

//Java_16_StaticVariables_Methods_PermGenration_MetaspaceMemory
//Program - 5

public class B {
    public static void main(String[] args) {
        System.out.println("B-Main");
        //Can we call A class main method
        A.main(args);
    }
}
