
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Give a number:
        // 5
        // Give a number:
        // 22
        // Give a number:
        // 9
        // Give a number:
        // -2
        // Give a number:
        // 0
        // Sum of the numbers: 34

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int a = scanner.nextInt();
            if (a == 0) {
                break;
            } else {
                sum = a + sum;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}