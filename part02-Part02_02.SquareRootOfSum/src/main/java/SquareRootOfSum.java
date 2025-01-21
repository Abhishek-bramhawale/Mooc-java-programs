
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());

        int b=Integer.parseInt(scanner.nextLine());
        int c=a+b;
        double d=Math.sqrt(c);
        System.out.println(d);


    }
}
