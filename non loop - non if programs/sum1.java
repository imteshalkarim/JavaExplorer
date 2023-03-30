//Write a program named sum1 to print the sum and average of three given numbers
public class sum1 {
    public static void main(String[] args) {
      int num1 = 10;
      int num2 = 20;
      int num3 = 30;
  
      // Calculate the sum of the three numbers.
      int sum = num1 + num2 + num3;
  
      // Calculate the average of the three numbers.
      double average = sum / 3.0;
  
      // Display the sum and average to the user.
      System.out.println("The sum of the three numbers is: " + sum);
      System.out.println("The average of the three numbers is: " + average);
    }
  }
  /* In this program, we declare three variables num1, num2, and num3 to store the three given numbers.
Then, we calculate the sum of the three numbers by adding them together and store the result in a variable called sum.
We also calculate the average of the three numbers by dividing the sum by 3.0 (instead of 3) to ensure that the result is a decimal value.
Finally, we use the System.out.println() method to display the sum and average to the user. */