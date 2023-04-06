//Write a program named p05_sum2 to display the sum, product of three given numbers and also display the difference in between the two results.
import java.util.Scanner;

public class p05_sum2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        // Calculate the sum and product of the numbers
        double sum = num1 + num2 + num3;
        double product = num1 * num2 * num3;
        
        // Calculate the difference between the sum and product
        double difference = sum - product;
        
        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        input.close();
    }
    
}
/*In this program, we use the Scanner class to read input from the user, and then we calculate the sum and product of the three numbers using basic arithmetic operations.
Finally, we calculate the difference between the sum and product, and display all three results using System.out.println(). */