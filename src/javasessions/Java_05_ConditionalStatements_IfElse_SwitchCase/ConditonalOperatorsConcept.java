package javasessions.Java_05_ConditionalStatements_IfElse_SwitchCase;

public class ConditonalOperatorsConcept {
    public static void main(String[] args) {

        System.out.println(10 == 20);

        int x = 10;
        int y = 20;
        //() always represent boolean condition / It should always represent boolean value
        if (x == y) {
            System.out.println("x is eq to y");
        } else {
            System.out.println("x is not eq to y");
        }

        if (x >= y) {
            System.out.println("x is eq to or grtr than y");
        } else {
            System.out.println("bye");
        }

        // Conditional operators
        //> < >= <= == !=
        if (x != y) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // "true" represents a boolean value
        if (true) {
            System.out.println("Hiii");
        } else {                           //dead code
            System.out.println("hello bye");
        }

        // "false" represents a boolean value
        if (false) { //dead code // This if part become dead code - Because if() condition will always satisfies
            System.out.println("Hiii");
        } else {
            System.out.println("hello bye");
        }

        // if don't want warning for dead code then we can write code like below
        // if-else logic is depedent upon flag variable
        boolean flag = false;
        if (flag) {
            System.out.println("Hiii");
        } else {
            System.out.println("Bye");
        }

        // Can we compare double values
        double d1 = 12.33;
        double d2 = 12.34;
        if (d1 == d2) {
            System.out.println("both are eq");
        } else {
            System.out.println("both are not eq");
        }

        // == is a Comparison Operator: is applicable for all primitive data types:int, short,float,long, char, boolean
        char c1 = 'a';                          //97
        char c2 = 'a';
        if (c1 == 97) {
            System.out.println("c1 and c2 are eq");
        }

        // Grade system - To show example of nested-if
        //nested if - else
        // parent if --> parent "if" have child if and else & parent "else" is importnat to show important message to user that something is not getting satisfied
        // It is always a good practice to write else - We should say to user that if something is not getting satisfied then we need to
        // tell something to user
        //else can not be written without the if condition
        int marks = 100;
        if (marks <= 100) {
            if (marks >= 90) {
                System.out.println("A Grade");
                if (marks >= 95) {
                    System.out.println("eligible for scholarship");
                } else {
                    System.out.println("not eligible for scholarship");
                }
            } else {
                System.out.println("B Grade");
                if (marks >= 70) {
                    System.out.println("you got 20% discount on the fee");
                }
            }
        } else {// It is always a good practice to write else - We should say to user that if something is not getting satisfied then we need to
                 // tell something to user
            System.out.println("incorrect marks");
        }


        //if -  if - if - if (indepedent if's)
        // Below program will print both
        //launch chrome and  plz pass the right browser....
        // Below way is not the right way to write the code
        // Reason
        // 1- our condition is getting satisfied in first condition itself - but still java will go and check all other conditions and our last if will not getting satisfied so "else" statements will get printed
        // 2-if our any condition is getting satisfied then other conditions should not be executed - Here all the conditions are getting executed
        // 3- Even if we pass wrong parameter - "Opera" then also java will go to all the conditions and will execute
        // 4- If we have 100 conditions and last condition is getting satisfied then unnecessary all other 99 conditions will be executed (Performance issue)
        String browser = "chrome";
        if (browser.equals("chrome")) {
            System.out.println("launch chrome");
        }
        if (browser.equals("firefox")) {
            System.out.println("launch firefox");
        }
        if (browser.equals("safari")) {
            System.out.println("launch safari");
        }
        if (browser.equals("edge")) {
            System.out.println("launch edge");
        } else {
            System.out.println("plz pass the right browser...." + browser);
        }
        // Above is not the right way to writing the code , below is the right way
        // Above is the problem and below is the soluation


      //  if - elseif
        // Here if our "if" condition is satisfied then java will not got to other "else if" conditions
        // The movement the condition is satisfied it's done
        // If we pass the "edge" then 4 conditions will be checked - So we are checking the 3 conditions unnecessary
        // if our 100th condition will get satisfied then we will unnecerrary check 1-99 condition
        // This is slightly batter than above because if our 1st condition is getting satidfied - then it won't check other conditions
        // Amazon - user is searching for the product(from 100 products) and we are checking(comparing with) all the products then we are telling user that product is not found/ giving searched product after long time
		String browser1 = "chrome";
		if(browser1.equals("chrome")) {//true  // String is non-primitive so use .equals for comprasion
			System.out.println("launch chrome");
		}
		else if(browser1.equals("firefox")) {//false
			System.out.println("launch firefox");
		}
		else if(browser1.equals("safari")) {
			System.out.println("launch safari");
		}
		else if(browser1.equals("edge")) {
			System.out.println("launch edge");
		}
		else {
			System.out.println("plz pass the right browser...."+ browser1);
		}

        // so to solve above problem we have switch case
        //Don't directly jump on to the topic
        // First try to understand the problem statement
        //Then how to solve that problem (what all options we have )
        // Then we understand the batter
        // We need to understand what is a need of the switch case
        // "break" can not be applied without loop or without "switch case". So in the "if " we can not write "break"
    }
}
