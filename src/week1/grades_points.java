package week1;

import java.util.Scanner;

public class grades_points {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int points = scanner.nextInt();

        if (points >= 0 && points <= 29) {
            System.out.println("Grade: failed");
        } else if (points >= 30 && points <= 34) {
            System.out.println("Grade: 1");
        } else if (points >= 35 && points <= 39) {
            System.out.println("Grade: 2");
        } else if (points >= 40 && points <= 44) {
            System.out.println("Grade: 3");
        } else if (points >= 45 && points <= 49) {
            System.out.println("Grade: 4");
        } else if (points >= 50 && points <= 60) {
            System.out.println("Grade: 5");
        } else {
            System.out.println(" Invalid points. Please enter a number between 0 and 60.");
        }

        scanner.close();
    }
}
