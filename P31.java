
//Write a program to enter a 3 digit number and display it in reverse.
import java.util.Scanner;

public class P31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = input.nextInt();

        int digit1 = num % 10;
        num /= 10;
        int digit2 = num % 10;
        num /= 10;
        int digit3 = num % 10;

        System.out.print("The reverse of the number is: ");
        System.out.println(digit1 * 100 + digit2 * 10 + digit3);
    }
}
/*
 * In this program, we first accept a three-digit number from the user using the
 * Scanner class.
 * Then, we use the modulo operator and integer division to extract the digits
 * of the number.
 * Finally, we calculate the reverse of the number by multiplying the digits
 * with appropriate powers of 10 and adding them.
 */