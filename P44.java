/*Write a program in java to display the following:
 * 1. Perimeter of a circle whose length is 45 and breadth is 30.
 * 2. Area and circumference of a circle whose diameter is 21.
 */
public class P44 {
    public static void main(String[] args) {
        // Perimeter of a circle with length 45 and breadth 30
        int length = 45;
        int breadth = 30;
        int perimeter = 2 * (length + breadth);

        System.out.println("Perimeter of the circle with length 45 and breadth 30: " + perimeter);

        // Area and circumference of a circle with diameter 21
        double diameter = 21;
        double radius = diameter / 2;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of the circle with diameter 21: " + area);
        System.out.println("Circumference of the circle with diameter 21: " + circumference);
    }
}
/*
 * In this program, we first calculate the perimeter of a circle with length 45
 * and breadth 30. To find the perimeter, we use the formula 2 * (length +
 * breadth).
 * 
 * Next, we calculate the area and circumference of a circle with a diameter of
 * 21. To find the area, we use the formula Math.PI * radius * radius, where
 * radius is half of the diameter. To find the circumference, we use the formula
 * 2 * Math.PI * radius.
 * 
 * Finally, we display the results using System.out.println().
 */