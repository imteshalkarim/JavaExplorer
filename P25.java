
//Write a program to enter a 4-digit number and display the sum of its first and last digit.
import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        // create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // ask the user to enter a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = input.nextInt();

        // extract the first digit of the number
        int firstDigit = number / 1000;

        // extract the last digit of the number
        int lastDigit = number % 10;

        // calculate the sum of the first and last digit
        int sum = firstDigit + lastDigit;

        // display the sum of the first and last digit
        System.out.println("Sum of first and last digit = " + sum);
    }
}
/*
 * Explanation:
 * 
 * 1. We first import the Scanner class from the java.util package to read input
 * from the user.
 * 2. We create a Scanner object named input.
 * 3. We prompt the user to enter a 4-digit number using the System.out.print()
 * statement.
 * 4. We use the nextInt() method of the Scanner class to read an integer input
 * from the user and store it in the variable number.
 * 5. We extract the first digit of the number by dividing it by 1000 and
 * storing the result in the variable firstDigit.
 * 6. We extract the last digit of the number by taking the remainder when the
 * number is divided by 10 and storing the result in the variable lastDigit.
 * 7. We calculate the sum of the first and last digit by adding firstDigit and
 * lastDigit and storing the result in the variable sum.
 * 8. We display the sum of the first and last digit using the
 * System.out.println() statement.
 */