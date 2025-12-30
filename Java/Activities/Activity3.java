package JavaActivities;

public class Activity3 {
	 public static void main(String[] args) {

	        
	        double ageInSeconds = 1000000000;

	        double earthYearSeconds = 31557600;

	        double earthYears = ageInSeconds / earthYearSeconds;

	        System.out.printf("Age on Earth: %.2f years%n", earthYears);
	        System.out.printf("Age on Mercury: %.2f years%n", earthYears / 0.2408467);
	        System.out.printf("Age on Venus: %.2f years%n", earthYears / 0.61519726);
	        System.out.printf("Age on Mars: %.2f years%n", earthYears / 1.8808158);
	        System.out.printf("Age on Jupiter: %.2f years%n", earthYears / 11.862615);
	        System.out.printf("Age on Saturn: %.2f years%n", earthYears / 29.447498);
	        System.out.printf("Age on Uranus: %.2f years%n", earthYears / 84.016846);
	        System.out.printf("Age on Neptune: %.2f years%n", earthYears / 164.79132);
	    }
}
