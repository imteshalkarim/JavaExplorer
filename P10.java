//Write a program to calculate the area and circumference of a circle and print them whose radius is given.
public class P10 {
    public static void main(String[] args) {
        // Initialize the radius of the circle
        double radius = 5.0;

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Calculate the circumference of the circle
        double circumference = 2 * Math.PI * radius;

        // Display the area and circumference of the circle
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
/*
 * In this program, we first initialize a variable radius with a value of 5.0.
 * 
 * Next, we calculate the area of the circle using the formula π * r^2, where r
 * is the radius, and store the result in a variable named area. We use the
 * constant Math.PI to represent the value of π.
 * 
 * Similarly, we calculate the circumference of the circle using the formula
 * 2πr, and store the result in a variable named circumference.
 * 
 * Finally, we display the area and circumference of the circle using
 * System.out.println().
 */