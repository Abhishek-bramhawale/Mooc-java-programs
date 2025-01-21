
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // points	grade
        // < 0	impossible!
        // 0-49	failed
        // 50-59	1
        // 60-69	2
        // 70-79	3
        // 80-89	4
        // 90-100	5
        // > 100	incredible!

        // Give points [0-100]:
        // 37
        // Grade: failed

        System.out.println("Give points [0-100]:");
        int point=Integer.parseInt(scan.nextLine());
        if(point<0) {
            System.out.println("impossible!");
        } else if(point>=0&&point<=49) {
            System.out.println("failed");
        } else if(point>=50&&point<=59){
            System.out.println("1");
        } else if(point>=60&&point<=69){
            System.out.println("2");
        } else if(point>=70&&point<=79){
            System.out.println("3");
        } else if(point>=80&&point<=89){
            System.out.println("4");
        } else if(point>=90&&point<=100){
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }

    }
}
