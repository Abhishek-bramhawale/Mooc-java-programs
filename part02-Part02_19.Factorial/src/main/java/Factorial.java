
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Give a number: 3
        // Factorial: 6

        int fact=1;


        System.out.println("Give a number: ");
        int last=scanner.nextInt();

        for(int i=1;i<=last;i++){
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);

    }
}
