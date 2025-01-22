
import java.util.Scanner;

public class AverageOfNumbers {

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
        // Average of the numbers: 8.5

        double avg = 0;
        double sum = 0;
        double no = 0;
        while (true) {
            System.out.println("Give a number:");
            int a = scanner.nextInt();
            if (a == 0) {
                break;
            } else {
                no = no + 1;
                sum = a + sum;
            }

        }
        avg = sum / no;
        System.out.println("Average of the numbers: " + avg);

    }
}
