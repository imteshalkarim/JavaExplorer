//Write a program named p16_square_last_digit to accept a number and display the square of the last digit.
import java.util.Scanner;

public class p16_square_last_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int lastDigit = num % 10;
        int square = lastDigit * lastDigit;

        System.out.println("The square of the last digit is: " + square);

        input.close();
    }
}
/*Explanation:

We first import the java.util.Scanner class to take input from the user.

We create a Scanner object to take input from the user.

We display a message asking the user to enter a number.

We take the input from the user and store it in the num variable.

We find the last digit of the number by taking its modulo with 10 and store it in the lastDigit variable.

We calculate the square of the last digit by multiplying it with itself and store it in the square variable.

We display the result to the user by printing the value of square.

We close the Scanner object to prevent any memory leaks. */