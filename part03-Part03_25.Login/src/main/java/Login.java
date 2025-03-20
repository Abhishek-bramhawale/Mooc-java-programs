
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter username: alex
        // Enter password: sunshine
        // You have successfully logged in!

        // Sample output
        // Enter username: emma
        // Enter password: haskell
        // You have successfully logged in!

        // Sample output
        // Enter username: alex
        // Enter password: thunderstorm
        // Incorrect username or password!

        System.out.println("Enter username: ");
        String user=scanner.nextLine();
        System.out.println("Enter password: ");
        String pass=scanner.nextLine();

        if(user.equals("alex")&&pass.equals("sunshine")||user.equals("emma")&&pass.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else{
            System.out.println("Incorrect username or password!");
        }


    }
}
