package DataConversion;

/**
 * What do you mean by data conversion?
 */
public class DataConversion {
    public static void main(String[] args) {

        String x = "100";
        System.out.println(x + 20); // 10020 but we were expecting 120
        /**
         * This is what happens in the selenium or any automation tool, that whatever the data you are reading from the webpage will give you string
         * Selenium will always give you the String
         * And whatever the Sting value we are getting we want to perform airthmatic operation on that
         * But we can not do airthmatic operation with String value
         * So to perform the airthmatic operation we need to convert the String to int > using wrapper class
         * Typecasting is different > when you converting int to byte and byte to int
         */


        //string to int:
        //using wrapper class:
        //int[primitive data type] ---> Integer [This Integer is class - which is non-primitive] - This conversion of primitive to non-primitive - or we can say a data type conversion to class conversion
        //double --> Double
        //float --> Float
        //char --> Character
        //boolean ---> Boolean

        /**
         * Why above classes are called wrapper classes?
         * Under that they hold the primitive value but on top of that java has created respective classes.That's why these classes are wrapper classes
         * These wrapper classes we can use for the data conversion
         */

        //String to int:
        int i = Integer.parseInt(x);//100  //parseInt means parsing > conversion is also known as parsing //passeInt is a static method because we are accessing it by using class name //retuen type of parseInt is "int"
        System.out.println(i+20);

        /**
         * There is a catch
         * Whenever we are doing any conversion from string to int java will always check that is it a pure numeric value?
         */
//		String test = "100A"; //This is alpha numeric value so it will give you number format exception
//		int k = Integer.parseInt(test);//NumberFormatException: For input string: "100A"
//		System.out.println(k);
        //We can do some string manipulation then can convert to int

        //String to double:
        String s = "12.33";
        System.out.println(s+10); //12.3310
        double d = Double.parseDouble(s);//12.33
        System.out.println(d+10);//22.33

        //String to boolean:
        //I am reading the data in selenium form configuration file and i want to run my testcases in headless mode
        //And value is coming like below

        String headless = "true";

        if(Boolean.parseBoolean(headless)) {
            //here we can not use "headless" directly because it is not a boolean value. Its a string value
            //So we need to convert into boolean
            //Boolean.parseBoolean(headless) - this will become boolean "true" value


        }

        /**
         * Using wrapper class we can find the ranges of data type as well
         * Byte
         */
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //int to String: [Reverse]
        int u = 100;
        System.out.println(u+20); // it will give you 120 but we want 10020
        String u1 = String.valueOf(u);//"100" // There is method in String class using which we can convert int value to String . We can pass any data in valueOf method
        System.out.println(u1+20); //"10020"

        /**
         * Any use case
         * Maintaining variable in selenium script
         * in selenium sendKeys method only accept STRING we can not pass int
         * Selenium says you have to give me the string value
         * So we need to do the conversion at that time
         */

    }
}
