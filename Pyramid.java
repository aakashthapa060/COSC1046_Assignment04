import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for a input
        System.out.println("Enter the number of Lines: ");
        int numberOfLines = input.nextInt();

        // Validating if user enters a less than 16
        while (numberOfLines > 15) {
            System.out.println("Enter the number of Lines less than 15: ");

            numberOfLines = input.nextInt();
        }

        for (int i = 1; i <= numberOfLines; i++) {

            // This loop prints spaces before the numbers to align them properly.
            for (int j = 1; j <= numberOfLines - i; ++j) {
                System.out.print("   ");
            }
            /*
             * This loop starts with i and decrements by 1 until it reaches 1.
             * It prints the numbers in descending order.
             */
            for (int j = i; j >= 1; --j) {
                System.out.printf("%2d ", j);
            }
            /*
             * Thisloop starts with 2 and increments by 1 until it reaches i. It prints the
             * numbers in ascending order.
             */
            for (int j = 2; j <= i; ++j) {
                System.out.printf("%2d ", j);
            }
            // println("\n") is used to create new line
            System.out.println("\n");
        }

    }
}
