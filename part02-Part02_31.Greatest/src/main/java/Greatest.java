
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int a=Math.max(number2, Math.max(number1, number3));
        return a;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
