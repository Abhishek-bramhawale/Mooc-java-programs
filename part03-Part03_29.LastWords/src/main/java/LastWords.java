
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // one two three four
        // four
        // this is a very important message
        // message
        
        boolean a=true;
        
        while(a){

        String ip=scanner.nextLine();
        String[] arr=ip.split(" ");
        
        if(ip.equals("")){
            a=false;
        }
         
       
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
            System.out.println(arr[arr.length-1]);
                break;
            }
            
        }
        }



    }
}
