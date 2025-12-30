package JavaActivities;

import java.util.ArrayList;
public class Activity9 {
	 public static void main(String[] args) {

	        // Create ArrayList of String
	        ArrayList<String> myList = new ArrayList<>();

	        // Add 5 names
	        myList.add("Alice");
	        myList.add("Bob");
	        myList.add("Charlie");
	        myList.add("David");
	        myList.add("Eva");

	        // Print all names using for loop
	        System.out.println("All names:");
	        for (int i = 0; i < myList.size(); i++) {
	            System.out.println(myList.get(i));
	        }

	        // Get the 3rd name (index 2)
	        System.out.println("3rd name: " + myList.get(2));

	        // Check if a name exists
	        System.out.println("Contains Bob? " + myList.contains("Bob"));

	        // Print size of the list
	        System.out.println("Number of names: " + myList.size());

	        // Remove a name and print size again
	        myList.remove("David");
	        System.out.println("Size after removal: " + myList.size());
	    }
}
