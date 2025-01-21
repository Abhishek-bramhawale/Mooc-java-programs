
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 

        // 
        // 12
        // 

        // How old are you?
        // 32
        // 

        System.out.println("How old are you?");
        int age=Integer.parseInt(scan.nextLine());
        if(age<18){
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }
    }
}
