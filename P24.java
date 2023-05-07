
//Write a program to accept principal, rate of interest and time period. Calculate and display simple interest.
import java.util.Scanner;

public class P24 {

    public static void main(String[] args) {
        // create scanner object to read input
        Scanner input = new Scanner(System.in);

        // read input values
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = input.nextDouble();

        // calculate simple interest
        double interest = (principal * rate * time) / 100;

        // display the result
        System.out.println("The simple interest is: " + interest);
    }
}
/*
 * In this program, we first import the Scanner class from the java.util
 * package, which allows us to read input from the user. Then we create a
 * Scanner object named input.
 * 
 * We then prompt the user to enter the values of principal, rate and time using
 * System.out.print() statements and read the input using the nextDouble()
 * method of the Scanner object.
 * 
 * Next, we calculate the simple interest using the formula (principal * rate *
 * time) / 100 and store the result in the variable interest.
 * 
 * Finally, we display the result using a System.out.println() statement.
 */