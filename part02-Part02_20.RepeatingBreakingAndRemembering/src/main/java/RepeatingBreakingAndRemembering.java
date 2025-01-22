
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        // Give numbers:
        // 5
        // 2
        // 4
        // -1
        // Thx! Bye!
        int sum = 0;
        int no = 0;
        // double avg = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            System.out.println("Give numbers:");
            int a = scanner.nextInt();

            if (a == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum = sum + a;
            no = no + 1;

            if (a % 2 == 0) {
                even = even + 1;
            } else if (a % 2 != 0) {
                odd = odd + 1;
            }
           
            
           

        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + no);

        double avg=(double)sum/no;

        System.out.println("Average: " + avg);

        System.out.println("Even: " + even);

        System.out.println("Odd: " + odd);

    }
}
