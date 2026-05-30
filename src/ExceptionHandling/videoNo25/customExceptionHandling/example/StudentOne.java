package ExceptionHandling.videoNo25.customExceptionHandling.example;

public class StudentOne {
    public static int getStudentMarks(String name) {
        System.out.println("getting marks for : " + name);

        if (name.equals("shubham")) {
            try {
                int i = 9 / 0;
            } catch (ArithmeticException e) {
                System.out.println("AE is coming");
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
        int m1 = StudentOne.getStudentMarks("shubham");
        System.out.println(m1);
    }
}
/**
 * What is the result of m1? or m1 will return what?
 * getting marks for : shubham
 * AE is coming
 * 100
 *
 */