
//Write a program to accept length and breadth of a rectangular floor and find the total cost of flooring at Rs. 25 per unit.
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of floor: ");
        double length = input.nextDouble();

        System.out.print("Enter breadth of floor: ");
        double breadth = input.nextDouble();

        double area = length * breadth;
        double cost = area * 25;

        System.out.println("Total flooring cost = Rs." + cost);
        input.close();
    }
}
/*
 * Explanation:
 * 
 * We first import the Scanner class from the java.util package to get user
 * input.
 * We create a Scanner object called input.
 * We ask the user to enter the length and breadth of the floor using the
 * System.out.print() function and store the values in the length and breadth
 * variables using the input.nextDouble() function.
 * We calculate the area of the floor by multiplying the length and breadth
 * variables.
 * We calculate the total cost of flooring by multiplying the area variable with
 * the cost per unit (which is Rs. 25).
 * We display the result using the System.out.println() function.
 * This program calculates the total cost of flooring for a rectangular floor
 * with the given dimensions, assuming a cost of Rs. 25 per unit of area.
 */