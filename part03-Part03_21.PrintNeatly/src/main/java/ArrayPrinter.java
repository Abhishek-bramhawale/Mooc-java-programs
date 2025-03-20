
public class ArrayPrinter {
    public static void main(String[] args) {
        // You can test your method here
        int[] array = { 5, 1, 3, 4, 2 };
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int index = 0;
        // Write some code in here
        for (int x : array) {
            index++;

            System.out.print(x);
            if (index < array.length)
                System.out.print(" ,");

        }
    }
}
