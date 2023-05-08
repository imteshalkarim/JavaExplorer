
//Write a program to enter principal, rate of interest and number of years to calculate and display the compound interest.
import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        // Enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        // Enter the number of years
        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();

        // Calculate the compound interest
        double amount = principal * Math.pow(1 + (rate / 100), years);
        double compoundInterest = amount - principal;

        // Display the compound interest
        System.out.println("The compound interest is: " + compoundInterest);
    }
}
/*
 * Explanation:
 * 
 * We first import the Scanner class to take user input from the console.
 * We then prompt the user to enter the principal, rate of interest and number
 * of years.
 * Using the formula A = P(1 + R/100)^t, we calculate the amount and the
 * compound interest.
 * The compound interest is the difference between the amount and the principal.
 * Finally, we display the compound interest.
 * Note: We use the Math.pow() method to calculate the power of (1 + R/100) to
 * the number of years.
 */