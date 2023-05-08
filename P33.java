
//Write a program to accept a number and check if it is even or odd by using conditional/ternary operator.
import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if the number is even or odd using a conditional/ternary operator
        String result = (num % 2 == 0) ? "even" : "odd";

        // Display the result
        System.out.println(num + " is " + result);
    }
}
/*
 * In this program, we first import the Scanner class from the java.util package
 * to accept user input. We then prompt the user to enter a number and store it
 * in the num variable.
 * 
 * Next, we use a conditional/ternary operator to check if the number is even or
 * odd. If the number is even (i.e., the remainder when the number is divided by
 * 2 is 0), we set the result variable to "even". Otherwise, we set it to "odd".
 * 
 * Finally, we display the result using System.out.println(). If the number is
 * even, the output will be something like 4 is even. If the number is odd, the
 * output will be something like 7 is odd.
 */