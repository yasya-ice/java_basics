package week2;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Type numbers: ");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                System.out.println(" Thank you and see you later! ");
                break;
            }
        }
        sc.close();
    }
}
