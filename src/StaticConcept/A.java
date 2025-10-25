package StaticConcept;

//Java_16_StaticVariables_Methods_PermGenration_MetaspaceMemory
//Program - 4

import classandobjects.Browser;

public class A {
    public static void main(String[] args) {
        System.out.println("A-Main");

        //Can we call B class main method
        //B.main(args); //This will give us StackOverflowError

        //We can call the main method from diff package as well
        Browser.main(args);

    }
}
