//Write a program to store numbers in two variables a and b. Exchange the value of a and b by taking the help of a third variable and display the values of a and b
public class exchange1 {
    public static void main(String[] args) {
      // Initialize variables a and b with values.
      int a = 10;
      int b = 20;
  
      // Print the initial values of a and b.
      System.out.println("Before swapping:");
      System.out.println("a = " + a);
      System.out.println("b = " + b);
  
      // Swap the values of a and b using a temporary variable.
      int temp = a;
      a = b;
      b = temp;
  
      // Print the final values of a and b after swapping.
      System.out.println("After swapping:");
      System.out.println("a = " + a);
      System.out.println("b = " + b);
    }
  }
  /*In this program, we first declare two integer variables a and b and initialize them with values 10 and 20, respectively. Then, we print the initial values of a and b using the System.out.println() method.

Next, we declare a third integer variable called temp and assign it the value of a. We then assign the value of b to a, and finally assign the value of temp (which is the original value of a) to b. This effectively exchanges the values of a and b.

Finally, we print the final values of a and b using the System.out.println() method. */