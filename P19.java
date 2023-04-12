
//Write a program to enter temperature in fahrenheit and convert it to celsius.
import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept temperature in Fahrenheit from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert temperature from Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);

        input.close();
    }
}
/*
 * The program prompts the user to enter the temperature in Fahrenheit, converts
 * it to Celsius using the formula (F - 32) * 5/9, and then displays the
 * temperature in Celsius.
 */