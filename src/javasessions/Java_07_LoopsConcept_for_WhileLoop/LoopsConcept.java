package javasessions.Java_07_LoopsConcept_for_WhileLoop;

public class LoopsConcept {


    public static void main(String[] args) {
        //Which loop has to be use in which case that is very important

        //loop -> start the loop -> execute statement as per your requirement -> exit the loop

        //1 to 10:
        //1. while loop:
        //start the loop -> immediately after that you check the condition -> if it is true -> statement execution -> again check condition
        // -> if false ->exit
        //we need to write condition in such a way that we can come out of the loop

        int i = 1;
        while (i <= 10) {  // this condition represent boolean ...either "true" or "false"
            System.out.println(i);
            //i++; // This will increase the number and will help us to exit from loop so that we don't get infinite loop
            // ++i; //ultimatily value of i will get increased in the memory
            i = i + 1;
        }

        System.out.println("----------------");

        //
        int l = 1;

        while (l <= 100) {
            if (l == 5) {
                System.out.println("hi");
                break; // This will help us to exit the while loop // break will always breaking the loop
            }
            System.out.println(l);

            //to exit from loop
            ++l;
        }
        System.out.println("----------------");

        //infinite loop - It has also a use case as well. See below example
//        while (true){
//            System.out.println("Welcome to taj hotel --hotel 24*7*365 days");
//        }
        // casions , bill boards

        System.out.println("----------");

        int count = 0;

        while (count <= 100) {
            if (count == 25) {
                System.out.println("25 runs");
            }
            if (count == 50) {
                System.out.println("half century");
            }
            if (count == 100) {
                System.out.println("century");
            }
            count++;
        }

        System.out.println("---------for loop---------");
        //FOR LOOP
        // initiliaze -> check condition -> perform action -> increment decrement - > check the condition -> perform action

        //1 to 10
        //for loop:
        for (int k = 1; k <= 10; k++) { //k=1 will be executed only once
            System.out.println(k);

            // first step : k=1
            //2nd step : k<=10
            //3rd step : System.out.println(k);
            // 4th step : k++
            //5th step : back to step number 2
        }

//        System.out.println("with for loop we can also get infinite loop");
//        //with for loop we can also get infinite loop
//        for (int k = 1; k <= 10; ) {
//            System.out.println(k);
//        }

        System.out.println("---------ugly for loop 1---------");
        //below is also right syntax but look ugly
        int g = 1; // declared and initialazation
        for (; g <= 10; g++) {
            System.out.println(g);
        }

        System.out.println("---------ugly for loop 2---------");
        //below is also right syntax but look ugly
        int j; // declared
        for (j = 0; j <= 10; j++) { // but initialiazed j here
            System.out.println(j);
        }
        System.out.println("---------ugly for loop 3---------");
        //below is also right syntax but look ugly
        int k = 1;
        for (; k <= 10; ) {
            System.out.println(k);
            k++;
        }

        // Below code will keep printing infinite times Bye
//        for (; ; ) {  // By default condition is "True"
//            System.out.println("Bye");
//
//        }

        // In Below code we have updated the conditon to "False" so other code will become dead
//        for (;false;){  //
//            System.out.println("Bye"); // This line will become dead code
//        }

        ///  use case of for loop - To retrive values from array
        System.out.println("---------------");
        int arr[] = new int[4];
        //0 to 3
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;

        for (int n = 0; n < arr.length; i++) {
            System.out.println(arr[n]);
        }

        ///dropdown - months - 1 - 12
        ///  country drop down
        /// menu - sub menu
        ///  big basket - number of categories are fixed - big basket will not sell electonics item - so number of categories are fixed, if they add then it will be a rare case , not reguralry
        ///  number of subjects in exam
        /// total semstesers
        /// flight booking seats, theater seats, movie seats

    }
}
//use cases of while loop
// we have to use while loop when number of iterations are not fixed
//Think about from test automation point of view
// sometimes logo is appearing after 10 seconds (here we don't know how much time do we need to wait)
//wait for the element on the page : 0,2,5,10,20 seconds
//wait for the page loading : 0,2,5,10 seconds in my system it is 10 seconds but in virat's system it is taking 20 seconds due to internet
//dropdown values: wait until all the values are visible
//Web table pagination (we don't know how many times we need to click on the next)
//calendar : i want to select march 2032(here we don't have any idea how many times I want to click on the next )
//carousel


//use cases of for loop:
//use for loop when number of iterations are fixed
//To fetch the values from the array - because arrays have fixed size