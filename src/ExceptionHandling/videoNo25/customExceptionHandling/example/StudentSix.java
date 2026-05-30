package ExceptionHandling.videoNo25.customExceptionHandling.example;

/**
 * We are adding System.exit(0); in try block because in this program exception is not coming
 * so java will return 45 or 100? or it will not return anything
 */
public class StudentSix {
    public static int getStudentMarks(String name) {
        System.out.println("getting marks for : " + name);

        if (name.equals("shubham")) {
            try {
                int i = 9 / 3;
                System.exit(0); // 0 status means shutdown the jvm
                /**
                 * System means JVM system > JVM system please exit [0] means shut down everything
                 * So before returning JVM is getting shutdown
                 * so to prevent finally block we can use "System.exit(0)"
                 * So JVM can not reach to the finally block
                 */
                return 45;
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
        int m1 = StudentSix.getStudentMarks("shubham");
        System.out.println(m1);
    }
}
/**
 * o/p
 * getting marks for : shubham
 */