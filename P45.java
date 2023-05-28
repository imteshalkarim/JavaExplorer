
/*Write a program to store the name of two students and their respective heights. Display the name of the tallest student. */
import java.util.Scanner;

public class P45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the name and height of the first student
        System.out.print("Enter the name of the first student: ");
        String student1Name = input.nextLine();
        System.out.print("Enter the height of " + student1Name + " (in centimeters): ");
        double student1Height = input.nextDouble();

        // Prompt the user to enter the name and height of the second student
        System.out.print("Enter the name of the second student: ");
        input.nextLine(); // Consume the newline character
        String student2Name = input.nextLine();
        System.out.print("Enter the height of " + student2Name + " (in centimeters): ");
        double student2Height = input.nextDouble();

        // Compare the heights and determine the name of the tallest student
        String tallestStudentName;
        if (student1Height > student2Height) {
            tallestStudentName = student1Name;
        } else if (student2Height > student1Height) {
            tallestStudentName = student2Name;
        } else {
            tallestStudentName = "Both students have the same height";
        }

        // Display the name of the tallest student
        System.out.println("The tallest student is: " + tallestStudentName);
    }
}
/*
 * In this program, we use the Scanner class to read the input from the user. We
 * prompt the user to enter the name and height of the first student using
 * System.out.print() and Scanner.nextLine() and store the values in
 * student1Name and student1Height variables.
 * 
 * Similarly, we prompt the user to enter the name and height of the second
 * student and store the values in student2Name and student2Height variables.
 * 
 * We then compare the heights of the two students using an if statement. If the
 * height of the first student is greater than the height of the second student,
 * we assign student1Name to tallestStudentName. If the height of the second
 * student is greater, we assign student2Name to tallestStudentName. If both
 * students have the same height, we assign a message indicating that to
 * tallestStudentName.
 * 
 * Finally, we display the name of the tallest student using
 * System.out.println().
 */