
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        // Where to? 8
        // Where from? 5
        // 5
        // 6
        // 7
        // 8

        System.out.println("Where to?");
        int a = scanner.nextInt();
        System.out.println("Where from?");
        int b = scanner.nextInt();

        for (int i = b; i <= a; i++) {
            System.out.println(i);
        }
    }
}
