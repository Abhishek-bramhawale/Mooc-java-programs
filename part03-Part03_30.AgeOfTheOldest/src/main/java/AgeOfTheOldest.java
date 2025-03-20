
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lily,1
        // hanna,5
        // gabriel,10
        // Age of the oldest: 10

       

     int maxage=0;
     while(true){
         String ip=scanner.nextLine();
         if(ip.equals("")){
             break;
         }
         
         String arr[]=ip.split(",");
         int age=Integer.parseInt(arr[1]);
         
         if(age>maxage){
             maxage=age;
         }
         
         
     }         System.out.println("Age of the oldest: "+maxage);



    }
}
