
import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            
            // Terminate the loop if an empty line is entered
            if (input.isEmpty()) {
                break;
            }

            // Split the input string and print the first word
            String[] words = input.split(" ");
            System.out.println(words[0]);
        }

        scanner.close();
    }
}