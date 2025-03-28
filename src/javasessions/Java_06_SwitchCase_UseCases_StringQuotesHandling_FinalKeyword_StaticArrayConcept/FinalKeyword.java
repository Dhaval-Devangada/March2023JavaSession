package javasessions.Java_06_SwitchCase_UseCases_StringQuotesHandling_FinalKeyword_StaticArrayConcept;

public class FinalKeyword {
    public static void main(String[] args) {

        //final -- constant values

        int a = 10;
        a = 20;
        a = 30;
        a = 40;
        System.out.println(a);


        final int days = 7;
        //days = 10; // Here someone can manipulate the days by overriding it . And days of the week are fixed. It should not be changed
        // Wheel of the car are fixed
        //Total months are fixed
        int totalAmout = 100 * days;
        System.out.println(totalAmout);

        final String title = "Login Page";

        final double basePrice = 12.22;

        final char gender = 'm';


    }
}
