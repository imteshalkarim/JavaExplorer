
/*Write a program to enter base and perpendicular of a right angled triangle. Display its hypotenuse and area. */
import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base and perpendicular of the right-angled
        // triangle
        System.out.print("Enter the base of the right-angled triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter the perpendicular of the right-angled triangle: ");
        double perpendicular = input.nextDouble();

        // Calculate the hypotenuse using Pythagorean theorem: c = sqrt(a^2 + b^2)
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2));

        // Calculate the area of the triangle: area = (1/2) * base * perpendicular
        double area = 0.5 * base * perpendicular;

        // Display the hypotenuse and area of the triangle
        System.out.println("The hypotenuse of the right-angled triangle is: " + hypotenuse);
        System.out.println("The area of the right-angled triangle is: " + area);
    }
}
/*
 * In this program, we prompt the user to enter the base and perpendicular of
 * the right-angled triangle using System.out.print() and read the input using
 * Scanner.nextDouble().
 * 
 * We then calculate the hypotenuse of the triangle using the Pythagorean
 * theorem: c = √(a^2 + b^2), where a is the base and b is the perpendicular. We
 * use the Math.pow() method to calculate the squares and Math.sqrt() method to
 * calculate the square root.
 * 
 * Next, we calculate the area of the triangle using the formula: area = (1/2) *
 * base * perpendicular.
 * 
 * Finally, we display the hypotenuse and area of the triangle using
 * System.out.println().
 */