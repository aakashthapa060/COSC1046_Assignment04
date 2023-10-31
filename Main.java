import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Lines: ");
        int numberOfLines = input.nextInt();

        for(int i = 1; i <= numberOfLines; i++){
            for (int j = 1; j <= numberOfLines - i; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(i + " ");
            }

            
            System.out.print("\n");
        }
    }
}


// public class Main {
//     public static void printPyramid(int rows) {
//         for (int i = 1; i <= rows; i++) {
//             // Print spaces before the numbers
//             for (int j = 1; j <= rows - i; j++) {
//                 System.out.print("  ");
//             }

//             // Print ascending numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.printf("%2d ", j);
//             }

//             // Print descending numbers
//             for (int j = i - 1; j >= 1; j--) {
//                 System.out.printf("%2d ", j);
//             }

//             System.out.println(); // Move to the next line
//         }
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         while (true) {
//             System.out.print("Enter an integer from 1 to 15: ");
//             if (input.hasNextInt()) {
//                 int n = input.nextInt();
//                 if (n >= 1 && n <= 15) {
//                     printPyramid(n);
//                     break;
//                 } else {
//                     System.out.println("Please enter an integer between 1 and 15.");
//                 }
//             } else {
//                 System.out.println("Invalid input. Please enter a valid integer.");
//                 input.nextLine(); // Consume the invalid input
//             }
//         }

//         input.close();
//     }
// }
