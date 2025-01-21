
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Give a year: 2011
        // The year is not a leap year.
        System.out.println("Give a year: ");
        int a = Integer.parseInt(scan.nextLine());

        if (a % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (a % 100 == 00 && a % 400 != 0) {
            System.out.println("The year is not a leap year.");

        } else {
            System.out.println("The year is a leap year.");
        }

    }
}
