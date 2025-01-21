
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Shall we carry on?
        // yes
        // Shall we carry on?
        // ye
        // Shall we carry on?
        // y
        // Shall we carry on?
        // no

        boolean b = true;
        while (b) {
            System.out.println("Shall we carry on?");
            String a = scanner.nextLine();
            if (a.equals("no") || a.equals("NO")) {
                b = false;
            }
        }
    }

}