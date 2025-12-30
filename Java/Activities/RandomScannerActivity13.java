package JavaActivities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity13 {

    public static void main(String[] args) {

        // Create required objects
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        // Accept number inputs from console
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }

        // Generate random index
        int randomIndex = indexGen.nextInt(list.size());

        // Print value at random index
        System.out.println("Random index: " + randomIndex);
        System.out.println("Value at random index: " + list.get(randomIndex));

        scan.close();
    }
}