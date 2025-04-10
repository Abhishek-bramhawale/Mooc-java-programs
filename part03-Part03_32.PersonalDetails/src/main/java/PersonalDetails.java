
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // sebastian,2017
        // lucas,2017
        // lily,2017
        // hanna,2014
        // gabriel,2009

        // Longest name: sebastian
        // Average of the birth years: 2014.8

        String longname = "";
        int sum = 0;
        double avg = 0;
        int count = 0;

        while (true) {
            String ip = scanner.nextLine();
            if (ip.equals("")) {
                break;
            }
            String arr[] = ip.split(",");

            String name = arr[0];
            int age = Integer.parseInt(arr[1]);

            if (name.length() > longname.length()) {
                longname = name;
            }

            sum = sum + age;
            count++;

        }
        avg = (double) sum / count;
        System.out.println(longname);
        System.out.println(avg);

    }
}
