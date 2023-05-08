
//Write a program to enter 3 sides of a triangle and display its area and perimeter.
import java.util.Scanner;

public class P27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of first side: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of second side: ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of third side: ");
        double side3 = input.nextDouble();

        // Calculate the perimeter
        double perimeter = side1 + side2 + side3;
        System.out.println("The perimeter of the triangle is: " + perimeter);

        // Calculate the semi-perimeter
        double s = perimeter / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is: " + area);
    }
}
/*
 * In this program, we first import the Scanner class from the java.util package
 * to read input from the user. Then we prompt the user to enter the lengths of
 * the three sides of the triangle using System.out.print and
 * input.nextDouble().
 * 
 * We then calculate the perimeter of the triangle by adding the lengths of the
 * three sides, and output it using System.out.println.
 * 
 * Next, we calculate the semi-perimeter s by dividing the perimeter by 2. We
 * use this value to calculate the area of the triangle using Heron's formula,
 * and output it using System.out.println.
 */