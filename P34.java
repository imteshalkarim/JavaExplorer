
//Write a program to enter a number and check if it is positive or negative using conditional/ternary operator.
import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        String result = (num >= 0) ? "Positive" : "Negative";

        System.out.println("The number is " + result);
    }
}
/*
 * In this program, we first prompt the user to enter a number using the Scanner
 * class. Then, we use the conditional/ternary operator to check if the number
 * is greater than or equal to 0. If it is, the result variable is set to
 * "Positive". Otherwise, it is set to "Negative". Finally, we output the result
 * using System.out.println().
 */