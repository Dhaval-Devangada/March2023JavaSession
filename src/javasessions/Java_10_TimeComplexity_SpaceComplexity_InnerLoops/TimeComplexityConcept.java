package javasessions.Java_10_TimeComplexity_SpaceComplexity_InnerLoops;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 */
public class TimeComplexityConcept {
    public static void main(String[] args) {


        //TC --> BIG O (time complexity - How optimize/complex your code is written)
        //SC ---> BIG O (Howmuch bytes and bits you are taking)

        //1 to 5 product--> can find 1 product easily
        //1 to 1M records---> need to find 1 specific product from 1 million records

        int i = 1; //The moment we declare this we know that it takes 4 bytes
        System.out.println(i);
        //above statement(es) is getting executed only once as there is no loop
        //O(1) -- Constant Time

        String s = "Selenium";
        System.out.println(s);
        //O(1)
        //if we are asked that what is time complixity of above 4 lines : then it  its  O(1) and not O(4) because all the statements are getting executed once only

        // What is the time com for below for loop and write the formula for that?
        //loop: 1 to 10:
        // whole loop is taking around 10 mins --> 0.00001 sec
        // We bother about only specific space (There are two forms)
        //space --> Aux space + actual var space (in mordern application we don't care about space complexity, because these days we are running application from server which is on AWS and code is not running on our system)
        //Aux space(Every/each line of code we have written we need to calulate memory for that,but in the morden application we don't care about AUX space)
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
            System.out.println("hi");
        }
        //Space complexity for above for loop O(1)
        //1(k=1 it is going to be executed only once) + n(condition will be check 10 times and it can be more than 10 means "n times" as well) + n(how many times K will be printed , here 10 but it can be N times as well) + n(how many times value of K will be increased) --> 3n+1 --> Linear Equation
        //3n + 1(we can ignore this 1, because it is really small value ) --> 3n --> O(3n) we can remove 3 constant as well because we can have N numbers of lines inside the FOR loop, so if we remove the constant then ---> O(n)
        // simpllified the equation
        // keep removing constants from the equation


        //
        int p = 1;
        while (p <= 100) {
            System.out.println(p);
            if (p == 30) { //(this condition will be checked n times  )
                System.out.println("hiii"); // but this will be executed only once
            }
            p++;
        }
        //1+n + n + n + 1 + n ==> 4n + 2 ==> 2(2n+1) ==> 4n --> O(4n)(if more conditions are there then it could be 5n,6n,7n) so the generalize formula is --> O(n)

        System.out.println("----");

        //nested for loops:
        //00 01 02 03 04 05
        //10 11 12 13 14 15
        //20 21 22 23 24 25
        //.
        //.
        //50 51 52 53 54 55
        for (int m = 0; m <= 9; m++) { // outer loop
            for (int n = 0; n <= 9; n++) { // Inner loop
                System.out.print(m + "" + n + " ");//00 01 02 03
                //take some space

            }
            System.out.println();
        }
        //Whenever we have outer loop and inner loop thn we do multipliation
        //(1+n+n+n)(for outer loop)(1+n+n+n)(for inner loop) ==> (1+3n)(1+3n) ==> 1+3n+3n+9n^2 ==> 9n^2 + 6n + 1 --Quadratic equation
        //9n^2+6n ==> 3n(3n+2)--> 9n^2 --> O(n^2)

        //
        for (int m = 0; m <= 9; m++) {
            for (int n = 0; n <= 9; n++) {
                for (int k = 0; k <= 9; k++) {
                    System.out.print(m + "" + n + k + " ");//00 01 02 03
                }
                System.out.println();
            }
            System.out.println();
        } // Time complexity for above is O(1) because we are not taking unnecessary extra space here
        //(n)(n)(n)-->n^3+n2+n+1 -- cubic


        //time complexity of the binary search
        //binary search: 25 (We are looking for 25)
        //1 to 30 -- len = 30
        //li = 0
        //hi = 29

        //30/2
        //15 + 15 (lets assume 25 is there in the second array of set)
        //15 --> 15/2(2 parts of the second 15) --> 7 + 8 (lets assume 25 is there in the second array of set)
        //8 --> 8/2 (2 parts of the second array 8) --> 4 + 4(2 parts of the second array 4) --> 4 / 2 = 2 --> 1+1

        // To calculate the time complixity for binary
        //n --> n/2 --> n/4 --> n/8 (We keep dividing into half and at the end we get that element)
        //k = n(number of elements)/2
        //log(k) = log(n/2) (if we take log both the sides )
        //log(k) = log n - log2
        //log(k) = log n - 1 => log n

        //suppose we have 8 elements
        // In the linear search if we have 0 to 7 elements then we need to perform 8 iterations
        //Binary search(Divide the array)8/2 --> 4/2 --2/2 --> 1
        //linear search-8 --> 0 to 7 -->

        //divided by 2 --> log with base 2
        //divided by 3 --> log with base 3

        //log(a/b) --> log a - log b
        //k = n/2
        //log k = log(n/2) --> log n - log 2
        //log k = log n - 1

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        list.add("naveen");
        System.out.println(list);

        // For the binary search array should be sorted
        //For binary search every time we are dividing by 2 so to solve that equation we are taking log on both sides
        //If the equation involves exponents, applying a logarithm helps "bring down" the exponents using the logarithmic property
        //Taking logarithms can also simplify equations involving ratios or products. For example, if you have: k=n/2
        //and want to compare it logarithmically, you might take
        //log on both sides to make the relationship additive log(k)=log(n/2)
        //Then use the property of logarithms for division: log(k)= log(n) - log(2)
        // Solve Nonlinear Equations

        // When we calculate space complexity at that time we just need to calculate memory for the VARIABLES only
        //Auceliry space means : package will take some space, class will stake some space, object will take some space
        //Aux space is combination of everything


    }
}
