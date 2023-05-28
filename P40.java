
/*
 * Write a program to accept temperature in Celsius and display it in Fahrenheit
 */
import java.util.Scanner;

public class P40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using the formula: F = (C * 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the temperature in Fahrenheit
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}
/*
 * In this program, we prompt the user to enter the temperature in Celsius using
 * System.out.print() and read the input using Scanner.nextDouble().
 * 
 * We then convert the temperature from Celsius to Fahrenheit using the formula:
 * F = (C * 9/5) + 32. We multiply the Celsius temperature by 9/5 and add 32 to
 * get the equivalent Fahrenheit temperature.
 * 
 * Finally, we display the temperature in Fahrenheit using System.out.println().
 */