
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write your program here
        // Sample output
        // Give a number:
        // 3
        // You gave the number 3

        System.out.println("Give a number:");
        int a= Integer.valueOf(sc.nextLine());
        System.out.println("You gave the number "+a);

    }
}
