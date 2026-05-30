package SuperKeyword;

public class Car extends Vehicle{
   // int min_speed = 100;

    public void speed(){
        System.out.println("car speed");
    }

    public Car(){
        this(90); //calling the current class const
        System.out.println("CAR-default Constructor");
    }
    public Car(int i ){
        System.out.println("CAR class parameterized Constructor..."+ i);
    }
}
