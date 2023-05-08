
//Write a program to enter a 3 digit number and display the sum of its digits.
import java.util.Scanner;

public class P32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        // Separate the digits and compute the sum
        int digit1 = num / 100;
        int digit2 = (num / 10) % 10;
        int digit3 = num % 10;
        int sum = digit1 + digit2 + digit3;

        // Display the sum of digits
        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
/*
 * In this program, we first accept a 3-digit number from the user using a
 * Scanner.
 * We then separate the digits of the number using integer division and the
 * modulo operator.
 * Finally, we compute the sum of the digits and display it.
 */