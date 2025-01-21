
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here
        // 
        // 8
        // Give the second number:
        // 3
        // 

        System.out.println("Give the first number:");
        int a=Integer.valueOf(sc.nextInt());
        System.out.println("Give the second number:");
        int b=Integer.valueOf(sc.nextInt());
        int c=a+b;
        System.out.println("The sum of the numbers is "+c);



    }
}
