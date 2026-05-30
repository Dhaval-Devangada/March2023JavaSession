package ExceptionHandling.videoNo25.customExceptionHandling.example;

/**
 * Added "return 85" inside the catch block
 */
public class StudentTwo {
    public static int getStudentMarks(String name) {
        System.out.println("getting marks for : " + name);

        if (name.equals("shubham")) {
            try {
                int i = 9 / 0;
            } catch (ArithmeticException e) {
                System.out.println("AE is coming");
                return 85;
            }
            return 100;
        } else if (name.equals("sapna")) {
            return 90;
        } else {
            System.out.println("student not found...");
            return -1;
        }

    }

    public static void main(String[] args) {
        int m1 = StudentTwo.getStudentMarks("shubham");
        System.out.println(m1);
    }
}
/**
 * What is the result of m1? or m1 will return what? > 85 or 100
 * What is the property of "return"?
 * The moment we write "return" then it will return > it will not go to next line
 *
 * o/p
 * getting marks for : shubham
 * AE is coming
 * 85
 *
 */