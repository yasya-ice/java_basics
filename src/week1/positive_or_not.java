package week1;

import java.util.Scanner;

public class positive_or_not {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("The number is positive.");
        } if (number ==0) {
            System.out.println("This is neither positive nor negative.");
        } else {
            System.out.println("The number is not positive.");
        }
        scanner.close();
    }
}