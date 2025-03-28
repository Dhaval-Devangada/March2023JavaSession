package javasessions.Java_05_ConditionalStatements_IfElse_SwitchCase;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        //switch is a keyword
        //In switch case two important thing -
        //1- key
        //2- case
        // duplicate cases are not allowed - we can not have two cases with the "chrome" key
        // if no case is available then it will go to default case ()
        // Here we don't have conditions , we have cases
        //we can write switch case without "break" as well
        // "break" can not be applied without loop or without "switch case"
        //If we don't write break then all the cases will be executed
        //Switch case is only allowed for -  int,short,byte string and characters
        //Boolean, long, float, and double types are not allowed

        String browser = "edge";
        double version = 111.11;


        //Switch case with String
        switch (browser) {
            case "chrome":
                System.out.println("launch chrome");
                if (version == 111.11) {
                    System.out.println("launch chrome 111.11");
                    break;
                }
                break;
            case "firefox":
                System.out.println("launch firefox");
                break;
            case "safari":
                System.out.println("launch safari");
                break;
            case "edge":
                System.out.println("launch edge");
                break;

            default:
                System.out.println("plz pass the right browser name..." + browser);
        }

        //Can we solve grading problem using "switch"?
        // Are we going to create 100 case here? No
        //Unnecessary so many cases will be there

        //Switch case with Integer
        int marks = 95;
        switch (marks) {
            case 10:
                System.out.println("grade D");
                break;
            case 90:
                System.out.println("grade A");
                break;
            // case marks>90:   //We can not write range (markes>90)
            //     System.out.println("grade A");
            default:
                System.out.println("FAIL");
                break;
        }


        // switch is not applicable for "Double"
//		double bmi = 12.33;
//		switch (bmi) {
//		case value:
//
//			break;
//
//		default:
//			break;
//		}

        // Can we write "Switch" case with "Characters" values? Yes
        char c = 'e';
        switch (c) {
            case 'a':
                break;

        }

        // Can we write "Switch" case with "Boolean" values? NO
//		boolean flag = true;
//		switch (flag) {
//		case true:
//
//			break;
//
//		default:
//			break;
//		}

        // Can we write "Switch" case with "Short" values? Yes
        short s = 12;
        switch (s) {
            case 10:

                break;

            default:
                break;
        }

        // Can we write "Switch" case with "Long" values? No
//		long l = 10000;
//		switch (l) {
//		case value:
//
//			break;
//
//		default:
//			break;
//		}

        // character we can store in the integer as well as in character as well
        int ch = 'A';//65
        System.out.println(ch++);
        System.out.println(ch);

        char t = 'd';//d-100
        System.out.println((char) (t + 3));// 103=g // Here we are explicitily telling that we want output in characters

        // increment and decrement not allowed on boolean

    }
}
