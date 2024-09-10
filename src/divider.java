import java.util.Scanner;

public class divider  {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        double division = (double) firstNumber / secondNumber;

        System.out.println("Division: " + firstNumber + "/" + secondNumber + "=" + division);
    }
}