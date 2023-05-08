
//Write a program to enter distance in km and display it in metres and cm.
import java.util.Scanner;

public class P29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();

        // converting km to m
        double m = km * 1000;
        System.out.println("Distance in meters: " + m);

        // converting km to cm
        double cm = m * 100;
        System.out.println("Distance in cm: " + cm);

        sc.close();
    }
}
/*
 * In this program, we use the Scanner class to get input from the user. Then we
 * prompt the user to enter the distance in kilometers and store it in a
 * variable km.
 * 
 * We convert the distance in kilometers to meters by multiplying it by 1000 and
 * store the result in a variable m. We then print the distance in meters using
 * System.out.println().
 * 
 * Similarly, we convert the distance in kilometers to centimeters by
 * multiplying it by 100 and store the result in a variable cm. We then print
 * the distance in centimeters using System.out.println().
 * 
 * Finally, we close the scanner object to free up the resources.
 */