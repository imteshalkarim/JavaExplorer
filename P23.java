
//Write a program to enter side of a cube and display its surface area and volume.
import java.util.Scanner;

public class P23 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the cube: ");
        double side = input.nextDouble();

        double surfaceArea = 6 * side * side;
        double volume = side * side * side;

        System.out.println("Surface area of the cube: " + surfaceArea);
        System.out.println("Volume of the cube: " + volume);
    }
}
/*
 * This program first creates a Scanner object to read user input from the
 * console. It then prompts the user to enter the length of a side of the cube
 * and stores it in the side variable.
 * 
 * The program then calculates the surface area of the cube using the formula 6
 * * side^2 and stores it in the surfaceArea variable. It also calculates the
 * volume of the cube using the formula side^3 and stores it in the volume
 * variable.
 * 
 * Finally, the program displays the surface area and volume of the cube using
 * System.out.println() statements.
 */
