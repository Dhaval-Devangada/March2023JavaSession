package javasessions.Java_09_ArraysConcept_StaticArray_ArraysIteration;

import java.util.Arrays;

public class ArrayTravesing {
    public static void main(String[] args) {
        int k[] = new int[4];

        k[0] = 10;
        k[1] = 20;
        k[2] = 30;
        k[3] = 40;

        System.out.println(Arrays.toString(k));// This will print all the values of the array, This is without for loop so we can't put any condition
        //System.out.println(k); // This will give us garbage value or memory address
        //so don't print the array directly

        // This will give AIOB error, because we have index up to 3
        for (int i = 0; i <= k.length; i++) {
            System.out.println(k[i]);
        }

        //1st correct approach
        for (int i = 0; i <= k.length - 1; i++) {
            System.out.println(k[i]);
        }

        //2nd correct approach
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }

        //to iterate the array: for loop:
        //index based loop:
        for (int i = 0; i <= k.length - 1; i++) {
            System.out.println(k[i]);
            if (k[i] == 30) {    //Advantage with the loop is that we can put the conditions in between
                System.out.println("hi");
                break;
            }
        }

        System.out.println("-------");
        //for each loop:
        for (int e : k) {
            System.out.println(e);
            if (e == 30) {  // we can write condition here as well
                System.out.println("bye");
                break;
            }
        }
        System.out.println("-----");

        //short array traversing
        short s[] = new short[5];
        s[0] = 100;
        s[1] = 200;
        s[2] = 300;
        s[3] = 400;
        s[4] = 500;

        for (short e : s) {
            System.out.println(e);
        }

        System.out.println("-----");

        //String array traversing
        String browsers[] = new String[4];
        browsers[0] = "chrome";
        browsers[1] = "firefox";
        browsers[2] = "safari";
        browsers[3] = "edge";

        for (String e : browsers) {
            System.out.println(e);
            if (e.equals("safari")) {
                System.out.println("launch safari");
                break;
            }
        }

        //problem statement : Employeey's details data type could be anything
        //So can we store all the different types of data in the one array? YES
        // For that we need to create object array
        // Object is a class which is already there in java. It's having a property that it can store any type of data.
        // "O" in Object is capital because it's a class
        //Employee data : String, int, double, char, boolean
        //use Object array: static array
        //Object is a class:
        Object emp[] = new Object[5];
        emp[0] = "Tom";
        emp[1] = 25;
        emp[2] = 12.33;
        emp[3] = 'm';
        emp[4] = true;
        //emp[5] = "Bangalore"; //AIOB is run time exception

        //li = 0
        //hi = 4
        //l = 5

        for (Object e:emp){
            System.out.println(e);
        }

        //I want to print the data with the index using foreach loop. because in the foreach loop we don't maintain the index
        //0=Tom
        //1 =25

        int count = 0;
        for (Object e : emp) {
            System.out.println(count + "=" + e);//0=Tom 1=25
            count++;
        }

        //Disadvantage of the for-each loop
        //can we print the reverse order using foreach loop?
        //You cannot directly reverse a collection using a forEach loop, but with a little manipulation
        // (like reversing the collection beforehand or using other iterators), you can achieve reverse-order iteration.

        //0 = Tom
        //1 = 25
        //reverse order with for each loop:

        //reverse order with index based loop:
        System.out.println("----");
        for (int j = emp.length - 1; j >= 0; j--) { //Always start with "length -1", if we want something in reverse order form array
            System.out.println(emp[j]);//true m 12.33 25 Tom
        }

    }
}
