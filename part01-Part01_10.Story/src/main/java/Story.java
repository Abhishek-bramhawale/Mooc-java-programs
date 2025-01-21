
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first. \n What is the main character called?");
        String name=sc.nextLine();
        System.out.println("What is their job?");
        String job=sc.nextLine();
        System.out.println("Here is the story: \n Once upon a time there was "+name+", who was "+job+".\n On the way to work, "+name+" reflected on life.\n  Perhaps "+name+" will not be "+job+" forever.");



        // I will tell you a story, but I need some information first.
        // What is the main character called?
        // Bob
        // 
        // a builder
        // Here is the story:
        // Once upon a time there was Bob, who was a builder.
        // On the way to work, Bob reflected on life.
        // Perhaps Bob will not be a builder forever.

    }
}
