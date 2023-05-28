
/*Write a program to accept two sides of a rectangle and display the length of its diagonals. */
import java.util.Scanner;

public class P41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the two sides of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();

        // Calculate the length of the diagonals using Pythagorean theorem: d = sqrt(l^2
        // + b^2)
        double diagonal1 = Math.sqrt(Math.pow(length, 2) + Math.pow(breadth, 2));
        double diagonal2 = Math.sqrt(Math.pow(length, 2) + Math.pow(breadth, 2));

        // Display the length of the diagonals
        System.out.println("The length of the diagonals of the rectangle are:");
        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 2: " + diagonal2);
    }
}
/*
 * In this program, we prompt the user to enter the length and breadth of the
 * rectangle using System.out.print() and read the input using
 * Scanner.nextDouble().
 * 
 * We then calculate the length of the diagonals using the Pythagorean theorem:
 * d = √(l^2 + b^2), where l is the length and b is the breadth. We use the
 * Math.pow() method to calculate the squares and Math.sqrt() method to
 * calculate the square root.
 * 
 * Finally, we display the length of the diagonals using System.out.println().
 */