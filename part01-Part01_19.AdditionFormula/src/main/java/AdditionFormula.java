
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write your program here

        // Give the first number:
        // 5
        // Give the second number:
        // 4
        // 5 + 4 = 9

        
        System.out.println("Give the first number:");
        int a=Integer.valueOf(sc.nextInt());
        System.out.println("Give the second number:");
        int b=Integer.valueOf(sc.nextInt());
        int c=a+b;
        System.out.println(a+" + "+b+" = "+c);

    }
}
