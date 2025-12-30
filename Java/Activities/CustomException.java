package JavaActivities;

public class CustomException extends Exception {
	   private String message;

	    // Constructor
	    public CustomException(String message) {
	        this.message = message;
	    }

	    // Override getMessage()
	    @Override
	    public String getMessage() {
	        return message;
	    }
}
