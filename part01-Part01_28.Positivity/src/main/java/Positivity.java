
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here

        // Sample output
        // Give a number:
        // 5
        // The number is positive.

        // Give a number:
        // -2
        //

        System.out.println("Give a number:");
        int a = Integer.parseInt(sc.nextLine());
        if (a > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
