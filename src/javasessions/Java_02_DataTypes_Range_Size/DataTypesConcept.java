package javasessions.Java_02_DataTypes_Range_Size;

public class DataTypesConcept {

    public static void main(String[] args) {

        // Java is not 100% object oriented
        // Reason -> Here below we have not created any object/objects just to store the values

        // package name should be written in the small letters
        // variable name should be written in the camel cases, start with small
        // Class name should start with capital
         int total_fee_amount = 1000; // in java we don't prefer _

        //strict data types: byte b = 10; but here we need to tell what is b , it is a byte

        //1. primitive data types: it will just take some space in the memory
        //no need to create the object of the class
        //Numeric :
        //Integral:
        //a. Integer: byte, short, int, long
        //b. Floating-point: float, double
        //char: char // Internally they are maintained in the form of Unicode or ASCII value
        //Boolean: true/false

        //2. Non-primitive data types: String, Class, Interface, Arrays, Abstract Class


        int mn; // we have occupied some space(here 4 byte) but no one is living there

        //1. byte:
        //size: 1 byte = 8 bits
        //range: -128 to 127 ==> -2^7 to 2^7-1
        byte b = 10;
        byte b1 = 20;  // Here only just the value will take 1 byte , b1 will occupphy space in the stack  and byte is already predefined
        b = 40;
        System.out.println(b);
        byte c = -10;
        byte v = 0;
        //byte n = 130;
        System.out.println(b + b1);

        //2. short:
        //range: -32768 to 32767 ==> -2^15 to 2^15-1
        //size: 2 bytes = 2x8 = 16 bits
        short s = 1000;
        short s1 = 25000;

        //3. int:
        //range: -2147483648 to 2147483647 ==> -2^31 to 2^31-1
        //size: 4 bytes = 4x8 = 32 bits
        int i = 100000;
        int j = 1;
        int l = 0;
        int k = -989;
        //int s2=12.33// This is not possible

        //4. long:
        //size: 8 bytes = 8x8 = 64 bits
        //range: -2^63 to 2^63-1
        //population /distance between sun and moon //total vaccicines dose * total populations
        long l1 = 123456789;
        long l2 = 98765678989L;  // here we need explicity need to tell java that we are storing long number
        System.out.println(l2);

        //acc number/SSN/Aadhar card/phone number//credit card -- String
        //we are not going to perform any operation on above number so they should be stored in the String
        //4444545467678999
        //98989898989990
        //long ssn = 19191919199L;//8 x 1000

        //5. float:
        //size: 4 bytes = 4x8 = 32 bits
        //range: after . can take upto 6 to 7 digits
        //before . there is no limitation
        float g = 12.33f; // Here we need to tell explicity that we are storing floating number
        float h = (float) 12.55; //another way tell explicity that we are storing float number
        System.out.println(g);
        System.out.println(h);
        float p = 100; // in the floating number we can store 100 as well but we the output will be 100.0
        System.out.println(p);//100.0

        // int and float both will take 4 bytes
        //big brother of float kid double

        //6. double:
        //size: 8 bytes = 64 bits
        //range: after . can take upto 15 digits
        //before . there is no limitation
        // for Double number if we want to write "d" we can otherwise we can ignore
        double d = 12.3333;
        System.out.println(d);
        double buildVersion = 1.0;// for this we can use float
        //usecase : madicle calculation BMI index , After "." , where 6 to 9 digits matters , pi


        //7. char:
        //size: 2 bytes = 16 bits
        //All the characters in java are considered as numeric value
        // Why java needs 2 digits just to store 1 char
        //unicode chars: ASCII + special uni code chars (symbolic char , language based char chinese/japanese/arebic char,symbole of $ /ruppee )
        // when we perform any mathematical calculation on the ASCII then we will get the operation will be performed on the ASCII value of the respective char
        // char should be written in the single digit
        // only 1 digit allowed in the char
        //multiple digits are not allowed
        //ranges:
        //a-z: 97 to 122
        //A-Z: 65 to 90
        //0-9: 48 to 57
        // space is a kind of char as well
        char c1 = 'a';
        char c11 = 'b';
        char c2 = 'A';
        char c3 = '1';//49
        char c33 = '2';//50
        char c4 = '$';
        char gender = 'm'; //usecase
        char execution = 'Y'; // want ot execute testcases or not
        char grade = 'A';

        System.out.println("Printing only char "+ c1);//a (when we print)
        System.out.println(c11);//b (when we print)
        System.out.println(c1 + c11);//97 + 98 = 195 (when we print)
        System.out.println(c11 - c1);//98-97=1 (when we print)
        System.out.println(c2);

        System.out.println(c3 + c33);
        System.out.println((int) c1);// This will print the ASCII value of the C
        System.out.println((int) '@');// This will print the ASCII value of the @
        System.out.println((byte) '$'); // This will print the ASCII value of the '$'
        System.out.println((byte) ' ');

        int go = 100;
        char pop = 'a';
        System.out.println(go + pop); // we can add intger and char as well , so char can be used in our mathematical calculations as well
        System.out.println(c1 + "" + c11);//ab

        System.out.println('a' + '1');
        System.out.println(12.33 + 'a');

        //boolean: true/false:
        //size: ~1 bit - it is actually less than 1 bit
        // 0 and 1 is representation of true and false
        boolean flag = true; // true is a predefined boolean keyword
        boolean flg = false;

        int totalBillAmount = 9000;
        int total_fee_amountm = 1000; // in java we don't prefer _

        int kk = 100;
        int pp = 100;
        System.out.println(kk);
        int result = kk + pp;
        System.out.println(result);//200

        float dd = 9.14159265358979323846f;// Here resultnant will have up to 6/7 digit as we are using float
        double ff = 9.14159265358979323846d;// Here resultnant will have up to 14/15 digit as we are using double
        System.out.println(ff);

        //once the program is over then memory is released

    }
}
