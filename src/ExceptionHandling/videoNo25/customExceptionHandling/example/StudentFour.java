package ExceptionHandling.videoNo25.customExceptionHandling.example;

/**
 *
 * Added "return 85" inside the catch block
 * Add finally block with "return 100"
 * Now wha will be the o/p ? will it return 85 or 100?
 */
public class StudentFour {
    public static int getStudentMarks(String name) {
        System.out.println("getting marks for : " + name);

        if (name.equals("shubham")) {
            try {
                int i = 9 / 0;
            } catch (ArithmeticException e) {
                System.out.println("AE is coming");
                return 85;
            }
            finally {
                return 100;
            }
        } else if (name.equals("sapna")) {
            return 90;
        } else {
            System.out.println("student not found...");
            return -1;
        }

    }

    public static void main(String[] args) {
        int m1 = StudentFour.getStudentMarks("shubham");
        System.out.println(m1);
    }
}
/**
 * What is the result of m1? or m1 will return what? > 65 or 85
 * What is the property of "return"?
 * The moment we write "return" then it will return > it will not go to next line
 *
 * Exception is coming so we java will go inside the catch block
 * but we have the "finally block" as well so dosen't matter exception is there or not finally block will be executed
 * so it o/p > 100
 * We know that "return" should return immediatly but dosen't matter exception is coming or not java will always go to finally block
 * so "return 100" will replace "return 85"
 * so latest return from the function is 100
 *
 * o/p
 * getting marks for : shubham
 * AE is coming
 * 100
 *
 */