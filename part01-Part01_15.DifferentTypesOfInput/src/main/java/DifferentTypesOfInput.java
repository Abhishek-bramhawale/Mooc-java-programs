
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        // 
        // bye-bye
        // 
        // 11
        // 
        // 4.2
        // 
        // true
        // You gave the string bye-bye
        // You gave the integer 11
        // You gave the double 4.2
        // You gave the boolean true

        System.out.println("Give a string:");
        String a=scan.nextLine();
        System.out.println("Give an integer:");
        int b=Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double c=Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean d=Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+a);
        System.out.println("You gave the integer "+b);
        System.out.println("You gave the double "+c);
        System.out.println("You gave the boolean "+d);





    }
}
