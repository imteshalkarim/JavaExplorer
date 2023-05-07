
/*Write a program to enter basic salary of an employee. Calculate and display the following:
DA = 25% of basic salary
HRA = 15% of basic salary
PF = 8.33% of basic salary
Net pay = basic salary + DA + HRA
Gross pay = Net pay - PF
*/
import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accepting basic salary from user
        System.out.print("Enter the basic salary of employee: ");
        double basicSalary = sc.nextDouble();

        // Calculating DA, HRA, PF, Net pay and Gross pay
        double DA = 0.25 * basicSalary;
        double HRA = 0.15 * basicSalary;
        double PF = 0.0833 * basicSalary;
        double netPay = basicSalary + DA + HRA;
        double grossPay = netPay - PF;

        // Displaying the calculated values
        System.out.println("DA = " + DA);
        System.out.println("HRA = " + HRA);
        System.out.println("PF = " + PF);
        System.out.println("Net pay = " + netPay);
        System.out.println("Gross pay = " + grossPay);

        sc.close();
    }
}
/*
 * Here, we first import the Scanner class to take user input. Then, we accept
 * the basic salary of the employee from the user using the nextDouble() method
 * of the Scanner class.
 * 
 * After that, we calculate the DA, HRA, PF, net pay and gross pay as per the
 * given formulas. Finally, we display the calculated values using the println()
 * method.
 * 
 * We also close the Scanner object using the close() method at the end of the
 * program to prevent any memory leaks.
 */