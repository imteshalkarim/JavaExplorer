
//Write a program to enter sales value of a sales man and display his commission earnt when the rate of commission is 2%.
import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        // create scanner object to read input
        Scanner sc = new Scanner(System.in);

        // prompt user to enter sales value
        System.out.print("Enter sales value: ");
        double sales = sc.nextDouble();

        // calculate commission (2% of sales)
        double commission = sales * 0.02;

        // display commission
        System.out.println("Commission: " + commission);

        // close scanner object
        sc.close();
    }
}
/*
 * In this program, we use a Scanner object to read the sales value input by the
 * user. We then calculate the commission as 2% of the sales value, and display
 * it using System.out.println(). Finally, we close the Scanner object to free
 * up system resources.
 * 
 * Note that in this program, we assume that the rate of commission is fixed at
 * 2%. If the rate of commission changes, you will need to modify the code
 * accordingly.
 */