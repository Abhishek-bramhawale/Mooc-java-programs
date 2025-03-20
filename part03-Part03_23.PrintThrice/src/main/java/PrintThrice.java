
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Give a word: cake
        // cakecakecake

        System.out.println("Give a word: ");
        String ip=scanner.nextLine();
        System.out.println(ip+ip+ip);

        // Write your program here

    }
}
