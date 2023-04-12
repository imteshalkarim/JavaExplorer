//Write a program named to store numbers in two variables a and b. Exchange their values without using a third variable and then display their values.
public class P06 {
    public static void main(String[] args) {
        // Initialize variables a and b
        int a = 10;
        int b = 20;

        // Display the initial values of a and b
        System.out.println("Before exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Exchange the values of a and b without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Display the final values of a and b
        System.out.println("After exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
 * In this program, we first initialize two variables a and b with values 10 and
 * 20, respectively. Then we display the initial values of a and b using
 * System.out.println().
 * 
 * Next, we exchange the values of a and b without using a third variable. This
 * is done by first adding a and b to get the sum, then subtracting b from the
 * sum to get the value of a, and finally subtracting a from the sum to get the
 * value of b.
 * 
 * Finally, we display the final values of a and b using System.out.println().
 */