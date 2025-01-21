
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write your program here
        // 
        // TRUE
        // true

        System.out.println("Write something:");
        boolean a=Boolean.valueOf(sc.nextLine());
        System.out.println("True or false? "+a);

    }
}
