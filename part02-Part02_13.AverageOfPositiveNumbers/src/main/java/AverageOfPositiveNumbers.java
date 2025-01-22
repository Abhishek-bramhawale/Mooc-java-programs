
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double avg = 0;
        double no = 0;

        while (true) {
            int a = scanner.nextInt();
            if (a == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (a > 0) {
                sum = a + sum;
                no = no + 1;
            }
        }
        avg = sum / no;
        System.out.println(avg);

    }
}
