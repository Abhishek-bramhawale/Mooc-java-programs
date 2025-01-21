
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 
        // 5
        // Give the second number:
        // 3
        // 5

        System.out.println("Give the first number:");
        int a=Integer.parseInt(scan.nextLine());

        System.out.println("Give the second number:");
        int b=Integer.parseInt(scan.nextLine());

        if(a>b) {
            System.out.println("Greater number is: "+a);
        } else if(b>a){
            System.out.println("Greater number is: "+b);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
