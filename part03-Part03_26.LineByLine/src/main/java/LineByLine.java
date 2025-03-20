
import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // once upon a time
        // once
        // upon
        // a
        // time
        // a little program
        // a
        // little
        // program

        boolean a = true;
        while (a) {

            String ip = scanner.nextLine();
            String[] arr = ip.split(" ");
            for (String x : arr) {
                System.out.println(x);
                if (ip.isEmpty()) {
                    a = false;
                }
            }
        }

    }
}
