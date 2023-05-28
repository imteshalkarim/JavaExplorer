
/*Write a program to enter time in minutes and display it in hours and minutes. */
import java.util.Scanner;

public class P43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the time in minutes
        System.out.print("Enter the time in minutes: ");
        int minutes = input.nextInt();

        // Calculate the hours and minutes
        int hours = minutes / 60; // Divide minutes by 60 to get the number of hours
        int remainingMinutes = minutes % 60; // Get the remaining minutes after calculating the hours

        // Display the time in hours and minutes
        System.out.println("Time: " + hours + " hours " + remainingMinutes + " minutes");
    }
}
/*
 * In this program, we prompt the user to enter the time in minutes using
 * System.out.print() and read the input using Scanner.nextInt().
 * 
 * We then calculate the hours by dividing the minutes by 60. Since 1 hour is
 * equal to 60 minutes, dividing the minutes by 60 gives us the number of hours.
 * 
 * Next, we calculate the remaining minutes by finding the remainder when
 * dividing the minutes by 60. This gives us the minutes that are left after
 * calculating the hours.
 * 
 * Finally, we display the time in hours and minutes using System.out.println().
 */