
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here

        // 
        // 3.14
        // 3.14

        System.out.println("Give a number:");
        double a=Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number "+a);

    }
}
