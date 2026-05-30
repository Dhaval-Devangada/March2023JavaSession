package ExceptionHandling.videoNo25.customExceptionHandling.example;

/**
 * Added "return 65" inside the try block
 * Added "return 85" inside the catch block
 */
public class StudentThree {
    public static int getStudentMarks(String name) {
        System.out.println("getting marks for : " + name);

        if (name.equals("shubham")) {
            try {
                int i = 9 / 0;
                return 65;
            } catch (ArithmeticException e) {
                System.out.println("AE is coming");
                return 85;
            }
       //     return 100; // This will become unreachable code
        } else if (name.equals("sapna")) {
            return 90;
        } else {
            System.out.println("student not found...");
            return -1;
        }

    }

    public static void main(String[] args) {
        int m1 = StudentThree.getStudentMarks("shubham");
        System.out.println(m1);
    }
}
/**
 * What is the result of m1? or m1 will return what? > 65 or 85
 * What is the property of "return"?
 * The moment we write "return" then it will return > it will not go to next line
 *
 * Exception is coming so we java will go inside the catch block
 * o/p
 * getting marks for : shubham
 * AE is coming
 * 85
 *
 */