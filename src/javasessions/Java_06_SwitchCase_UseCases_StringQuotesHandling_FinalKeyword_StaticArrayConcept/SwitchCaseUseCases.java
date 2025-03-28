package javasessions.Java_06_SwitchCase_UseCases_StringQuotesHandling_FinalKeyword_StaticArrayConcept;

import java.util.Arrays;

public class SwitchCaseUseCases {

    public static void main(String[] args) {

        // Use case: 1 aeiou (alpha)

        char alphabet = 'z';
        switch (alphabet) {
            case 'a':
                System.out.println("this is vowel");
                break;
            case 'e':
                System.out.println("this is vowel");
                break;
            case 'i':
                System.out.println("this is vowel");
                break;
            case 'o':
                System.out.println("this is vowel");
                break;
            case 'u':
                System.out.println("this is vowel");
                break;

            default:
                System.out.println("this is a consonant");
                break;
        }

        // Use case: 2
        // env - dev/qa/stage/uat/prod

        String envName = "  prod  ";

        switch (envName.trim().toLowerCase()) {// qa
            case "qa":
                System.out.println("run it on QA");
                break;
            case "dev":
                System.out.println("run it on dev");
                break;
            case "stage":
                System.out.println("run it on stage");
                break;
            case "uat":
                System.out.println("run it on uat");
                break;
            case "prod":
                System.out.println("run it on prod");
                break;

            default:
                System.out.println("no env is found..." + envName);
                break;
        }

        // Use case: 3
        // cross browser testing: chrome//ff//edge//safari

        // If we have fix number of cases in that case we can go with "switch case"
        // Use case: 4
        // days in a week/months in a year

        // Use case: 5
        // booking app -- uber:
        String carType = "sedan";
        int persons = 6;
        switch (carType) {
            case "mini":
                if (persons <= 4) {
                    System.out.println("mini is allocated");
                }
                break;

            case "sedan":
                if (persons >= 5) {
                    System.out.println("sedan is allocated");
                    switch (persons) {  // We can write another switch case inside the switch case
                        case 1:

                            break;
                        case 6:
                            System.out.println("extra price is 10 USD");
                            break;

                        default:
                            break;
                    }
                }
                break;

            default:
                break;
        }

        // Use case: 6
        // user based permissions//RBAC: admin, customer, seller, partner, vendor

        // Use case: 7
        // run test cases: sanity, smoke, regression, prod

        // Use case: 8
        //  loan: home, car, education, personal
        int p[] = {1, 4, 5, 2, 3, 22, 31, 2};
        int[] a = new int[p.length - 1];

        int j = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] != 22) {
                a[j] = p[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(a));


    }

}