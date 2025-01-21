
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Give a number:
        // 5
        // Give a number:
        // 22
        // Give a number:
        // 9
        // Give a number:
        // -2
        // Give a number:
        // 0
        // Number of numbers: 4

        int no=0;

        while(true){
            System.out.println("Give a number:");
            int a=scanner.nextInt();
            if(a==0){
                break;
            } else {
                no=no+1;
            }
            
        }
        System.out.println("Number of numbers: "+no);

    }
}
