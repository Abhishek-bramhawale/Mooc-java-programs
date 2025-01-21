
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Give a number:
        // 5
        // 25
        // Give a number:
        // 4
        // 16
        // Give a number:
        // -3
        // Unsuitable number
        // Give a number:
        // 1
        // 1
        // Give a number:
        // 0

        System.out.println("Give a number:");
        int a = scanner.nextInt();

        while (a != 0) {

            if (a < 0) {
                System.out.println("Unsuitable number");
                System.out.println("Give a number:");
                a = scanner.nextInt();
            } else {
                System.out.println(a * a);
                System.out.println("Give a number:");
                a = scanner.nextInt();
            }
        }

    }
}
