
//Write a program to enter quantity sold and price per unit. Display the sales price after giving 2% discount.
import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the quantity and price
        System.out.print("Enter quantity sold: ");
        int quantity = input.nextInt();
        System.out.print("Enter price per unit: ");
        double price = input.nextDouble();

        // Calculate the total price before discount
        double totalPrice = quantity * price;

        // Calculate the discount amount
        double discount = totalPrice * 0.02;

        // Calculate the sales price after discount
        double salesPrice = totalPrice - discount;

        // Display the sales price after discount
        System.out.println("Sales price after discount = " + salesPrice);
        input.close();
    }
}
/*
 * In this program, we first import the Scanner class from the java.util package
 * to read input from the user. Then, we ask the user to enter the quantity and
 * price of the product sold using System.out.print() and input.nextInt() and
 * input.nextDouble() respectively.
 * 
 * Next, we calculate the total price before discount by multiplying the
 * quantity and price. We then calculate the discount amount by multiplying the
 * total price by 0.02 (which represents the 2% discount rate).
 * 
 * Finally, we calculate the sales price after discount by subtracting the
 * discount amount from the total price, and display it to the user using
 * System.out.printf(). The %.2f format specifier is used to display the result
 * to two decimal places.
 */