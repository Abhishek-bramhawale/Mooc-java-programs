
public class AdvancedAstrology {

     // Method to print spaces
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    // Method to print stars (and optionally spaces)
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    // Method to print a right-leaning triangle
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
            System.out.println(); // Line break after each row
        }
    }

    // Method to print a Christmas tree
    public static void christmasTree(int height) {
        // Print the tree body
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            System.out.println(); // Line break after each row
        }

        // Print the base
        for (int i = 0; i < 2; i++) { // Base is two rows high
            printSpaces(height - 2); // Centering the base
            printStars(3); // Base is three stars wide
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Right-leaning triangle (size = 4):");
        printTriangle(4);

        System.out.println("\nChristmas tree (height = 4):");
        christmasTree(4);

        System.out.println("\nChristmas tree (height = 10):");
        christmasTree(10);
    }
}
