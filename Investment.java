import java.util.Scanner;

public class Investment{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Type Initial Investment");
        System.out.println("Initial Investment: ");
        double initialInvestmentAmount = input.nextInt();
        System.out.println("Initial Interest Rate: ");
        double initialInterestRate = input.nextInt();
        int investmentTime = 5;

        double interest = (initialInvestmentAmount * initialInterestRate) / 100;


        System.out.println("\n====================\n");

        System.out.println("Year \t Interest \t Value");

        for (int i=1; i <= investmentTime; i++) {
            initialInvestmentAmount += interest;
            System.out.printf("%d \t %s \t %s \n", i,interest,initialInvestmentAmount);

            interest = (initialInvestmentAmount * initialInterestRate) / 100;
        }
    }
}
