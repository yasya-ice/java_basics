package week1;

import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the radius
        System.out.print("Type the radius: ");
        double radius = scanner.nextDouble();

        // Calculate the week1.circumference using the formula
        double circumference = 2 * Math.PI * radius;

        // Output the result
        System.out.println("Circumference of the circle: " + circumference);

        // Close the scanner
        scanner.close();
    }
}

