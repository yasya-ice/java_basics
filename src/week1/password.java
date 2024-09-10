package week1;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        String correctPassword = "qwerty";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Type the password: ");
            String enteredPassword = sc.nextLine();

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Right!\n \nThe secret is: fairies exist ");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        sc.close();
    }
}