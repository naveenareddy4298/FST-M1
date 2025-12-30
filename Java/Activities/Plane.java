package JavaActivities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	  private List<String> passengers;
	    private int maxPassengers;
	    private Date lastTimeTookOf;
	    private Date lastTimeLanded;

	    // Constructor
	    public Plane(int maxPassengers) {
	        this.maxPassengers = maxPassengers;
	        this.passengers = new ArrayList<>();
	    }

	    // Method to onboard passenger
	    public boolean onboardPassenger(String name) {
	        if (passengers.size() < maxPassengers) {
	            passengers.add(name);
	            return true;
	        }
	        return false;
	    }

	    // Method to take off
	    public void takeOff() {
	        lastTimeTookOf = new Date();
	        System.out.println("Plane took off at: " + lastTimeTookOf);
	    }

	    // Method to land
	    public void land() {
	        lastTimeLanded = new Date();
	        System.out.println("Plane landed at: " + lastTimeLanded);
	    }

	    // Getters
	    public List<String> getPassengers() {
	        return passengers;
	    }

	    public int getMaxPassengers() {
	        return maxPassengers;
	    }

	    public Date getLastTimeTookOf() {
	        return lastTimeTookOf;
	    }

	    public Date getLastTimeLanded() {
	        return lastTimeLanded;
	    }
}
