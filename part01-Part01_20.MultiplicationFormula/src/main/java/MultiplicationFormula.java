
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here



        System.out.println("Give the first number:");
        int a=Integer.valueOf(sc.nextInt());
        System.out.println("Give the second number:");
        int b=Integer.valueOf(sc.nextInt());
        int c=a*b;
        System.out.println(a+" * "+b+" = "+c);

    }
}
