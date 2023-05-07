
/*Write a program to enter the values of coefficients of a quadratic equation ax^2+bx+c=0
Find the roots of the equation and siaplay them.*/
import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
/*
 * Here's how the program works:
 * 
 * The program prompts the user to enter the values of the coefficients a, b,
 * and c.
 * The program calculates the discriminant of the quadratic equation using the
 * formula b^2 - 4ac.
 * If the discriminant is greater than 0, the program calculates the two roots
 * of the quadratic equation using the formula (-b ± √discriminant) / 2a and
 * displays them.
 * If the discriminant is equal to 0, the program calculates the single root of
 * the quadratic equation using the formula -b / 2a and displays it.
 * If the discriminant is less than 0, the program displays a message indicating
 * that the equation has no real roots.
 */