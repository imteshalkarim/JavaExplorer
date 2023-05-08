
//Write a program to enter a 3 digit number and display its digits in separate lines.
import java.util.Scanner;

public class P30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        int digit1 = num / 100; // extract first digit
        int digit2 = (num % 100) / 10; // extract second digit
        int digit3 = num % 10; // extract third digit

        System.out.println("The digits are:");
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);

        sc.close();
    }
}
/*
 * Here's how the program works:
 * 
 * The program first prompts the user to enter a three-digit number.
 * It reads the user input using a Scanner.
 * It extracts each digit of the number using integer division and modulus
 * operations.
 * It then displays the digits in separate lines using System.out.println()
 * statements.
 * Finally, it closes the Scanner object to release the resources.
 */