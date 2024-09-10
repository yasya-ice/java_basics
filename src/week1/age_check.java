package week1;

import java.util.Scanner;

public class age_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 120) {
            System.out.println("OK ");
        } else if (age <= 0) {
            System.out.println("Impossible! ");
        }
    }
}
