
//Write a program to input a year and check if it is a leap year or not using ternary operator.
import java.util.Scanner;

public class P35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "is" : "is not";

        System.out.println(year + " " + leapYear + " a leap year.");
    }
}
/*
 * In this program, we first import the Scanner class to get user input. Then,
 * we prompt the user to enter a year using System.out.print() and read in the
 * input using input.nextInt().
 * 
 * Next, we use a ternary operator to check if the year is a leap year. The
 * ternary operator is a shorthand way of writing an if-else statement. The
 * expression before the ? is the condition we want to check. If the condition
 * is true, the value before the : is returned. Otherwise, the value after the :
 * is returned.
 * 
 * In this case, the condition we are checking is whether the year is divisible
 * by 4 but not by 100, or if it is divisible by 400. If this condition is true,
 * we set the leapYear string to "is". Otherwise, we set it to "is not".
 * 
 * Finally, we use System.out.println() to display the result to the user. The
 * output will be in the format "year is/is not a leap year."
 */