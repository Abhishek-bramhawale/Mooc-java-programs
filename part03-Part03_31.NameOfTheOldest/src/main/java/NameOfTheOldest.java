
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lily,1
        // hanna,5
        // gabriel,10

        // Name of the oldest: gabriel

        int maxage = 0;
        String name = "";

        while (true) {
            String ip = scanner.nextLine();

            if (ip.equals("")) {
                break;
            }
            String arr[] = ip.split(",");

            int age = Integer.parseInt(arr[1]);
            if (age > maxage) {
                maxage = age;
                name = arr[0];
            }

        }
        System.out.println("Name of the oldest: " + name);

    }
}
