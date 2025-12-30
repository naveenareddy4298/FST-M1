package JavaActivities;

public class Activity6 {
	public static void main(String[] args) {

        Plane plane = new Plane(2);

        plane.onboardPassenger("Alice");
        plane.onboardPassenger("Bob");

        plane.takeOff();
        plane.land();

        System.out.println("Passengers: " + plane.getPassengers());
    }
}
