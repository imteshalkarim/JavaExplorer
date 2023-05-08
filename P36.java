
//Write a program to enter length, breadth and height of a cuboid and calculate its volume.
import java.util.Scanner;

public class P36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter length, breadth and height of cuboid
        System.out.print("Enter the length of cuboid: ");
        double length = input.nextDouble();

        System.out.print("Enter the breadth of cuboid: ");
        double breadth = input.nextDouble();

        System.out.print("Enter the height of cuboid: ");
        double height = input.nextDouble();

        // Calculate volume of cuboid
        double volume = length * breadth * height;

        // Display the volume of cuboid
        System.out.println("Volume of the cuboid = " + volume);
    }
}
/*
 * In this program, we use the Scanner class to take user input of the length,
 * breadth, and height of a cuboid. We then use these values to calculate the
 * volume of the cuboid, which is simply the product of the length, breadth, and
 * height. Finally, we display the calculated volume of the cuboid using the
 * println method.
 */