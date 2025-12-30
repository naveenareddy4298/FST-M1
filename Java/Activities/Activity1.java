package JavaActivities;

public class Activity1 {
	public static void main(String[] args) {

        Car car = new Car();
        car.color = "Red";
        car.transmission = "Automatic";
        car.make = 2024;

      
        car.displayCharacteristics();
        car.accelarate();
        car.brake();
    }

}
