package JavaActivities;
import java.util.*;

public class Activity10 {
	public static void main(String[] args) {

        // Create HashSet
        HashSet<String> hs = new HashSet<>();

        // Add 6 objects
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Grapes");
        hs.add("Mango");
        hs.add("Pineapple");

        // Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // Remove an element
        hs.remove("Grapes");

        // Try to remove an element not present
        boolean removed = hs.remove("Kiwi");
        System.out.println("Was Kiwi removed? " + removed);

        // Check if an item exists
        System.out.println("Contains Mango? " + hs.contains("Mango"));

        // Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}
