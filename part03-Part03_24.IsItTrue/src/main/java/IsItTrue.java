
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Give a string: true
        // You got it right!

        // Sample output
        // Give a string: trueish
        // Try again!

        System.out.println("Give a string: ");
        String ip=scanner.nextLine();
        if(ip.equals("true")){
            System.out.println("You got it right!");
        } else{
            System.out.println("Try again!");
        }

    }
}
