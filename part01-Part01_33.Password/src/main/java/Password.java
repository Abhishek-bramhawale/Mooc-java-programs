
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 

        // 
        // Caput Draconis
        // Welcome!

        // Password?
        // Wattlebird
        // Off with you!

        System.out.println("Password?");
        String pass=scan.nextLine();
        if(pass.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
