
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here

        // Give the first number:
        // 8
        // Give the second number:
        // 3
        // Give the  number:
        // 3
        // The sum of the numbers is 14

        
        System.out.println("Give the first number:");
        int a=Integer.valueOf(sc.nextInt());
        System.out.println("Give the second number:");
        int b=Integer.valueOf(sc.nextInt());
        System.out.println("Give the third number:");
        int d=Integer.valueOf(sc.nextInt());
        int c=a+b+d;
        System.out.println("The sum of the numbers is "+c);

    }
}
