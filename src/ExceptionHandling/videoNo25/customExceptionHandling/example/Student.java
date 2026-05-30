package ExceptionHandling.videoNo25.customExceptionHandling.example;

/**
 * Give me name and I will give you the marks
 * This is normal program without adding try-catch block
 */
public class Student {
    public static int getStudentMarks(String name) {
        System.out.println("getting marks for : " + name);

        if (name.equals("shubham")) {
            return 100;
        } else if (name.equals("sapna")) {
            return 90;
        } else {
            System.out.println("student not found...");
            return -1;
        }

    }
}