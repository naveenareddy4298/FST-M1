package JavaActivities;

public class Activity7 {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();

        System.out.println("Tyres: " + BicycleParts.tyres);
        System.out.println("Max Speed: " + BicycleParts.maxSpeed);

        bicycle.speedUp(20);
        bicycle.speedUp(15);
        bicycle.applyBrake(10);
    }
}
