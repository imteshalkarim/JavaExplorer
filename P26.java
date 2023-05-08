
//Write a program to enter area of a circle and display its radius, diameter and circumference.
import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter area of the circle: ");
        double area = input.nextDouble();

        // Calculate the radius using the formula r = sqrt(area / pi)
        double radius = Math.sqrt(area / Math.PI);

        // Calculate the diameter using the formula d = 2 * r
        double diameter = 2 * radius;

        // Calculate the circumference using the formula c = 2 * pi * r
        double circumference = 2 * Math.PI * radius;

        // Display the results
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
    }
}
/*
 * Here's an explanation of the program:
 * 
 * The import java.util.Scanner; statement imports the Scanner class from the
 * java.util package, which allows us to read input from the user.
 * The public class P26 { ... } statement defines a class called P26, which
 * contains the main method.
 * Inside the main method, we create a new Scanner object called input to read
 * input from the user.
 * We prompt the user to enter the area of the circle using
 * System.out.print("Enter area of the circle: "); and read the input using
 * double area = input.nextDouble();.
 * We calculate the radius of the circle using the formula r = sqrt(area / pi)
 * and store it in a double variable called radius.
 * We calculate the diameter of the circle using the formula d = 2 * r and store
 * it in a double variable called diameter.
 * We calculate the circumference of the circle using the formula c = 2 * pi * r
 * and store it in a double variable called circumference.
 * Finally, we display the results to the user using System.out.println(...);.
 */