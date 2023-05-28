
/*Write a program to accept time in hours and convert it to hours, minutes and seconds format. */
import java.util.Scanner;

public class P38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the time in hours
        System.out.print("Enter the time in hours: ");
        int hours = input.nextInt();

        // Convert hours to minutes and seconds
        int minutes = hours * 60;
        int seconds = hours * 3600;

        // Display the converted time
        System.out.println("The time in hours, minutes, and seconds format is:");
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
/*
 * In this program, we first prompt the user to enter the time in hours using
 * System.out.print() and read the input using Scanner.nextInt().
 * 
 * We then calculate the equivalent time in minutes by multiplying the hours by
 * 60, since there are 60 minutes in an hour. Similarly, we calculate the
 * equivalent time in seconds by multiplying the hours by 3600, since there are
 * 3600 seconds in an hour (60 minutes * 60 seconds).
 * 
 * Finally, we display the converted time in hours, minutes, and seconds using
 * System.out.println() statements.
 */