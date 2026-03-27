package SuperKeyword;

public class TestCar {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        System.out.println(bmw.min_speed);
        // BMW's min_speed will be printed because preference will always be given to child class property
        //If we comment out the "BMW's" min_speed then BMW will inherit the Parent class(Car) class "min_speed" and then CAR's min_speed will get printed

        System.out.println("------------------------");
        bmw.displaySpeed();

        System.out.println("------------------------");
        bmw.speed();
        //Which method will be called ?
        //Preference will always be given to child class method
        //But we also want to use Parent class "speed" method as well then we can use SUPER keyword

    }
}
