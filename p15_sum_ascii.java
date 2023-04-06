//Write a program named p15_sum_ascii to accept two characters and print the sum of their ascii values.
import java.util.Scanner;

public class p15_sum_ascii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first character
        System.out.print("Enter the first character: ");
        char ch1 = input.next().charAt(0);

        // Prompt the user to enter the second character
        System.out.print("Enter the second character: ");
        char ch2 = input.next().charAt(0);

        // Calculate the sum of the ASCII values of the characters
        int sum = ch1 + ch2;

        // Display the sum of the ASCII values of the characters
        System.out.println("The sum of the ASCII values of " + ch1 + " and " + ch2 + " is " + sum);

        input.close();
    }
}
/*Here's how the program works:

It prompts the user to enter the first character.
It prompts the user to enter the second character.
It calculates the sum of the ASCII values of the characters using the + operator.
It displays the sum of the ASCII values of the characters using the println() method. */