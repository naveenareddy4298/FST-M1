package JavaActivities;

public class Activity12 {
	 public static void main(String[] args) {

	        // Lambda expression without body
	        Addable ad1 = (num1, num2) -> num1 + num2;

	        // Lambda expression with body
	        Addable ad2 = (num1, num2) -> {
	            return num1 + num2;
	        };

	        // Test the lambdas
	        System.out.println("Result from ad1: " + ad1.add(10, 20));
	        System.out.println("Result from ad2: " + ad2.add(30, 40));
	    }
}


