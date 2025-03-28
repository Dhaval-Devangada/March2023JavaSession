package javasessions;

public class ObjectExercises {


    String name;
    int marks;
    char grade;


    public static void main(String[] args) {

        ObjectExercises obj1 = new ObjectExercises();
        obj1.name = "Dhaval";
        obj1.marks = 100;
        obj1.grade = 'A';


        ObjectExercises obj2 = new ObjectExercises();
        obj2.name = "Virat";
        obj2.marks = 90;
        obj2.grade = 'B';

        ObjectExercises obj3 = new ObjectExercises();
        obj3.name = "Pandya";
        obj3.marks = 80;
        obj3.grade = 'C';

        ObjectExercises obj4 = new ObjectExercises();
        obj4.name = "Surya";
        obj4.marks = 70;
        obj4.grade = 'D';

        System.out.println(obj1.name + " " + obj1.marks + " " + obj1.grade); //Dhaval
        System.out.println(obj2.name + " " + obj2.marks + " " + obj2.grade); //Virat
        System.out.println(obj3.name + " " + obj3.marks + " " + obj3.grade); //Pandya
        System.out.println(obj4.name + " " + obj4.marks + " " + obj4.grade); //Surya

        System.out.println("-------------------------------------------------");

        obj1 = obj2;

        System.out.println(obj1.name + " " + obj1.marks + " " + obj1.grade); // Virat
        System.out.println(obj2.name + " " + obj2.marks + " " + obj2.grade); // Virat
        System.out.println(obj3.name + " " + obj3.marks + " " + obj3.grade); // Pandya
        System.out.println(obj4.name + " " + obj4.marks + " " + obj4.grade); // Surya

        System.out.println("-------------------------------------------------");

        obj2 = obj3;

        System.out.println(obj1.name + " " + obj1.marks + " " + obj1.grade); //Virat
        System.out.println(obj2.name + " " + obj2.marks + " " + obj2.grade); //Pandya
        System.out.println(obj3.name + " " + obj3.marks + " " + obj3.grade); //Pandya
        System.out.println(obj4.name + " " + obj4.marks + " " + obj4.grade); //Surya

        System.out.println("-------------------------------------------------");

        obj3 = obj4;

        System.out.println(obj1.name + " " + obj1.marks + " " + obj1.grade); //Virat
        System.out.println(obj2.name + " " + obj2.marks + " " + obj2.grade); //Pandya
        System.out.println(obj3.name + " " + obj3.marks + " " + obj3.grade); //Surya
        System.out.println(obj4.name + " " + obj4.marks + " " + obj4.grade); //Surya

        System.out.println("-------------------------------------------------");

        obj4 = obj1;

        System.out.println(obj1.name + " " + obj1.marks + " " + obj1.grade); // Virat
        System.out.println(obj2.name + " " + obj2.marks + " " + obj2.grade); // Pandya
        System.out.println(obj3.name + " " + obj3.marks + " " + obj3.grade); // Surya
        System.out.println(obj4.name + " " + obj4.marks + " " + obj4.grade); //Virat
    }
}
