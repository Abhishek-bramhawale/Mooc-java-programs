
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            int input=scanner.nextInt();
            if(input==-1){
                break;
            }
            list.add(input);
        }
        int sum=0;
        for(int x:list)
        {
            sum=sum+x;
        }
        int listsize=list.size();
        double avg=(double)sum/listsize;
        
        System.out.println("Average: "+avg);
        // System.out.println("sum: "+sum);
        // System.out.println("size: "+listsize);
        
    }
}
