package javasessions.Java_09_ArraysConcept_StaticArray_ArraysIteration;

import java.util.Arrays;

public class ArrayLiteralsConcept {
    public static void main(String[] args) {

        //New key word is used for object creation as well but here we are using for initilaziing the array /for taking some space inside the memory

        //What is the problem with below syntax : It is quite lengthy syntax. What if tomorrow we have 10 values then we need to write  k[0]....k[9]
        int k[] = new int[10]; // difference between array literls and this declaration
        //here we are using "new" keyword and saying that first you take the 10 segments
        //This types array we declare when we have no idea that how many values we want
        // Here we have 10 segments in the memory but we are storing only two values. so 8 segments are empty
        k[0] = 100;
        k[1] = 200;
//		System.out.println(k[0]);//100
//		System.out.println(k[2]);//0 // Here we have not store any value so it is giving 0
        //default value of integer is always 0. If it dosen't have any value then it will give you default value
        // In intiger we can not have the null
        // In any primitive data type we can not have null value

        //Can we jump few segments and then store the values? YES, in between index 0 will be stored
        k[5] = 500;
        System.out.println(k[5]);

        //soluation: Java says if we know the values already then we can use the literals
        //Array literals means, if we have the values then we can directly initiliaze it
        //Array Literals: static array: having arrays elements already
        int p[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //li = 0
        //hi = l-1

        int l = p.length;//10
        //0 to 9
        System.out.println(l);
//		p[10] = 200;
//		System.out.println(p[10]);//AIOB

        //can we store double values in array literals? YES
        double d[] = {12.33, 44.55, 8.99};
        double dd[] = {12.33, 44.55, 8.99};

        //can we store Characters values? YES
        char c[] = {'a', 'b', 'r'};

        //can we store String values in array literals? YES
        String emp[] = {"Shhubham", "Pooja", "Naresh", "Adil"};

        //can we store Object  literals? YES
        Object studentInfo[] = {"Vijay", 25, 34.44, 'm', "Pune", "India", false};

        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(emp));
        System.out.println(Arrays.toString(studentInfo));

        //can we iterate the array using foreach loop? Yes
        for (String e : emp) {
            System.out.println(e);
        }
        //
        for (Object e : studentInfo) {
            System.out.print(e + " ");
        }

        //delete a value from the array:

        System.out.println(Arrays.equals(d, dd));


    }
}
