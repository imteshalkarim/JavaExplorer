//Write a program to evaluate the following expression where the value of a and b are given. a^2 + b^2-4/2ab
public class P08 {
    public static void main(String[] args) {
        // Initialize variables for a and b
        int a = 3;
        int b = 4;

        // Evaluate the expression
        double result = (Math.pow(a, 2) + Math.pow(b, 2) - 4) / (2 * a * b);

        // Display the result
        System.out.println("Result: " + result);
    }
}
/*
 * In this program, we first initialize two variables a and b with values 3 and
 * 4, respectively.
 * 
 * Next, we evaluate the expression (a^2 + b^2 - 4)/(2ab) using the Math.pow()
 * method to calculate a^2 and b^2, and then calculate the numerator and
 * denominator of the expression separately. We divide the numerator by the
 * denominator to obtain the final result.
 * 
 * Finally, we display the result using System.out.println().
 */