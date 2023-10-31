/*Write a program that will read a positive integer from the user and will print out the 3N+1 sequence starting from that integer. The program should also count and print out the number of terms in the sequence.

Given a positive integer, N, define the ’3N+1’ sequence starting from N as follows: If N is an even number, then divide N by two; but if N is odd, then multiply N by 3 and add 1. Continue to generate numbers in this way until N becomes equal to 1.
*/
import java.util.Scanner;

public class Sequences{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Positive Number: ");
        int positiveNumber = input.nextInt();

        while(positiveNumber < 1){
            System.out.println("Please Enter a Positive Number: ");
            positiveNumber = input.nextInt();
        }

        int counter = 0;

        while(positiveNumber != 1){

            if(positiveNumber % 2 == 0){
                positiveNumber = positiveNumber / 2;
            } else{
                positiveNumber = 3 * positiveNumber + 1;
            }
            System.out.print(positiveNumber + " ");

            counter += 1;
        }

        System.out.println("\nThere were " + counter + " term in the sequences.");
    }
}
