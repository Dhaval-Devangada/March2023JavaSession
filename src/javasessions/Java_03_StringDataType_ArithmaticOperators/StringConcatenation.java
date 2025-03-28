package javasessions.Java_03_StringDataType_ArithmaticOperators;

public class StringConcatenation {

    public static void main(String[] args) {

        // String is a class in Java
        // " "
        String s = "hello world";
        System.out.println(s);

        String s1 = "100";
        System.out.println(s1 + 20);//10020 // Concatination

        System.out.println(10 + 20);//30

        int a = 100;
        int b = 200;
        String x = "Hello";
        String y = "Selenium";

        System.out.println(a + b);//300
        System.out.println(x + y);//HelloSelenium

        //We have to start from left to right

        System.out.println(a + b + x + y);//300HelloSelenium
        System.out.println(x + y + a + b);// HelloSelenium100200
        System.out.println(x + y + (a + b));// HelloSelenium300

        System.out.println(a + b + x + y + a + b);// 300HelloSelenium100200

        System.out.println("the value of a " + a);
        System.out.println("the value of b " + b);
        System.out.println("the sum is : " + (a + b)); // Here a+b will be calculated seprately

        // Double + String
        double c = 12.33;
        double d = 12.44;
        System.out.println(c + d);
        System.out.println(x + y + c + d);
        System.out.println(a + b + x + y + c + d);
        System.out.println(a + b + x + y + (c + d));

        //Char + String
        char c1 = 'a';// 97
        char c2 = 'b';// 98
        System.out.println(c1 + c2); //195
        System.out.println(x + y + c1 + c2);//HelloSeleniumab (Because there is no mathematical calculation)

        System.out.println(c1 + c2 + x + y);// addition of two characters then concatination with string

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(b / a);
        System.out.println(a * b);

        System.out.println(c2 - c1);
        System.out.println(c1 * c2);

        //Strings can be concatenated with booleans as well
        System.out.println("this emp is :" + true); // active
        System.out.println("your bank account is " + false);//false

        System.out.println(9 / 3);//3
        System.out.println(9 / 2);//4.5--> 4 //when both numbers are int then result will also be int
        System.out.println(9.0 / 2);//4.5 --> one of the number is float then output will be float (at least one of the number should be float)
        System.out.println(9 / 2.0);//4.5
        System.out.println(9.0 / 2.0);//4.5

        System.out.println(0 / 1);//0 (0/ by any number will give you zero)
        System.out.println(0 / 100);//0
        //System.out.println(9/0);//ArithmeticException: / by zero (Java does not understand what do you mean by infinity) ("int number/0" will give you ArithmeticException )
        //System.out.println(0/0);//ArithmeticException: / by zero

        System.out.println(9.1 / 0);//Infinity ("float number/0" will give you Infinity ) ("infinity" is only defined for the Double(long,double,float)  values and not an integer values)
        System.out.println(9.0 / 0);//Infinity
        System.out.println(9 / 0.0);//Infinity
        System.out.println(9.0 / 0.0);//Infinity


        System.out.println(0.0 / 0.0);//NaN - Not A Number
        System.out.println(0 / 0.0);//NaN - Not A Number
        System.out.println(0.0 / 0);//NaN - Not A Number

        //System.out.println(0/0);//AE (ArithmeticException)

        //System.out.println('a' / 0);//AE (ArithmeticException)

        System.out.println('a' / '0');//97/48=2

        //-128 to 127
        byte x1 = 10;
        byte x2 = 20;
        // byte x3=x1+x2;  This line will give you compilation error through we sum of (x1+x2) is in the range.
        //Reason - Suppose we are passing those data from Excel and it could be possible that we pass number which is out of
        //byte range (-128 to 127) then at that time we can face error
        // Conclusion : x3(resultent)  can come out of range of the byte (Because B1 and B2 could be anything tomorrow)
        //short x6=x1+x2; This will also give compilation error because of
        // any ,mathematical operation we do on bytes -> Resultant should always be stored inside the Int
        int x4 = x1 + x2;

        byte b1 = 125;
        byte b2 = 120;
        int b3 = b1 + b2; //30
        System.out.println(b3);

        int b4 = b2 - b1;

        //For integers java won't give compilation error because, integer alreday has large range
        // Resultant can throw error for int as well, so in that case we can change from "int" to "long"
        int f1 = 100;
        int f2 = 200;
        int f3 = f1 + f2;

        System.out.println(10 % 2);// reminder 0
        System.out.println(9 % 2);// reminder 1
        System.out.println(50 % 3);
        System.out.println(100 % 3);

        //Base of Decimal number is 2
        //Base of hexa decimal is 16  // there are 16 symbols or possible digit values from 0 to 9, followed by six alphabetic characters -- A, B, C, D, E and F.
        //Java will always try to print Decimal number

        byte h = 065; //octal number -- base of 8 // ANy number starting with 0 will be considred octal number
        System.out.println(h);
        //065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 0 + 48 + 5 = 53

       // byte t1 = 089 // This will give you error because 9 is not an octal number - Range of octal is 0-7 only
        short t = 0736;//0-7  // we are storing in "short" because byte will throw compilation error
        System.out.println(t);

        int u = 0765676543;// we are storing in "int" because byte & short  will throw compilation error
        System.out.println(u);
        //0765676543 = (0 × 8⁹) + (7 × 8⁸) + (6 × 8⁷) + (5 × 8⁶) + (6 × 8⁵) + (7 × 8⁴) + (6 × 8³) + (5 × 8²) + (4 × 8¹) + (3 × 8⁰) = 131562851


        byte y1 = 125;//1 bytes
        byte y2 = 120;//1 bytes
        int x3 = b1 + b3;//64 bits -- 4 ===>total => 6

        byte x5 = (byte) (y1 + y2);//245 // Here we are making fool
//		System.out.println(x3);//245-256 = -11
        //-128 to 0 to 127 --> 256

        int age = 10;
        //byte /short

//		int x1 = 125;//4 bytes
//		int x2 = 120;//4 bytes
//		int x3 = b1+b3;//4 4bytes===>Total bytes => 12

        System.out.println(9f / 2f);


    }

}
