
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Last number? 7
        // The sum is 28
        int sum = 0;

        System.out.println("Last number?");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            sum = i + sum;
        }
        System.out.println("The sum is " + sum);

    }
}
