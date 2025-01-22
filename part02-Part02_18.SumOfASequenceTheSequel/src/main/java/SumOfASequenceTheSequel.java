
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First number? 3
        // Last number? 5
        // The sum is 12

        int sum=0;

        System.out.println("First number?");
        int start=scanner.nextInt();

        System.out.println("Last number?");
        int last=scanner.nextInt();

        for(int i=start;i<=last;i++){
            sum=i+sum;
        }
        System.out.println("The sum is "+sum);

    }
}
