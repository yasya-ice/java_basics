package week2;
import java.util.*;

public class sum_of_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Until what? ");
        int n = sc.nextInt();

        int sum = 0;
        int counter = 1;

        while (counter <= n) {
            sum += counter;
            counter++;
        }

        System.out.println("Sum is " + sum);
    }
}
