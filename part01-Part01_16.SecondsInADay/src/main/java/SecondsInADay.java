
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // 
        // 1
        // 86400

        System.out.println("How many days would you like to convert to seconds?");
        int a=Integer.valueOf(scanner.nextLine());
        int sec=a*24*60*60;
        System.out.println(sec);

    }
}
