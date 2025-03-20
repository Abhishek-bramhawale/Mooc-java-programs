
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sample output
        // Do you have a favorite flavor
        // have
        // favorite
        // flavor
        // was it a cat?

        boolean a = true;

        while (true) {

            String ip = scanner.nextLine();
            if (ip.isEmpty()) {
                break;
            }
            String[] arr = ip.split(" ");

            for (String x : arr) {
                if (x.contains("av")) {
                    System.out.println(x);
                }

            }
        }

    }
}
