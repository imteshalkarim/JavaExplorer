
//Write a program to accept a character and display its ascii value.
import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0); // read a character from user input

        int ascii = (int) ch; // casting char to int

        System.out.println("The ASCII value of " + ch + " is " + ascii);
        input.close();
    }

}
/*
 * Explanation:
 * 
 * We import java.util.Scanner class to read user input.
 * We create a Scanner object named input.
 * We prompt the user to enter a character using System.out.print() method.
 * We read the input character using input.next().charAt(0) method and store it
 * in the variable ch.
 * We convert the character ch to its corresponding ASCII value using (int) ch
 * casting.
 * We print the ASCII value of the entered character using System.out.println()
 * method.
 * ASCII stands for American Standard Code for Information Interchange.
 * It is a character encoding standard that assigns unique numeric codes to
 * letters, digits, punctuation marks, and other characters.
 * Each character is assigned a 7-bit or 8-bit binary number, which represents
 * its unique code.
 */