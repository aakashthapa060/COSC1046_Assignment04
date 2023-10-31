
import java.util.Scanner;

public class Sequences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for positive number
        System.out.println("Enter a Positive Number: ");
        int positiveNumber = input.nextInt();

        // validating if user inputs positive number else ask again
        while (positiveNumber < 1) {
            System.out.println("Please Enter a Positive Number: ");
            positiveNumber = input.nextInt();
        }

        // Initlizing counter to zero
        int counter = 0;

        /* Validating if positive number is 1 */
        while (positiveNumber != 1) {

            /*
             * If positive number is even we divide that number with 2 else if its odd we
             * multiply 3 with the positive number and add until it is equvalent to 1
             */
            if (positiveNumber % 2 == 0) {
                positiveNumber = positiveNumber / 2;
            } else {
                positiveNumber = 3 * positiveNumber + 1;
            }
            System.out.print(positiveNumber + " ");
            // We increment the value of counter each time the loop runs
            counter += 1;
        }

        System.out.println("\nThere were " + counter + " term in the sequences.");
    }
}
