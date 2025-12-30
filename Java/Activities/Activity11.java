package JavaActivities;

import java.util.*;

public class Activity11 {
    public static void main(String[] args) {

    
        Map<Integer, String> colours = new HashMap<>();

        
        colours.put(1, "red");
        colours.put(2, "blue");
        colours.put(3, "green");
        colours.put(4, "yellow");
        colours.put(5, "purple");

      
        System.out.println("Colours Map: " + colours);

       
        colours.remove(4); 

       
        System.out.println("Contains green? " + colours.containsValue("green"));

    
        System.out.println("Size of the Map: " + colours.size());
    }
}
