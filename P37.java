
//Write a program to accept area and length of a rectangular field. Calculate cost of fencing it at Rs.15 per metre.
import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {
        // create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the area of the rectangular field
        System.out.print("Enter the area of the rectangular field: ");
        double area = input.nextDouble();

        // prompt the user to enter the length of the rectangular field
        System.out.print("Enter the length of the rectangular field: ");
        double length = input.nextDouble();

        // calculate the breadth of the rectangular field
        double breadth = area / length;

        // calculate the perimeter of the rectangular field
        double perimeter = 2 * (length + breadth);

        // calculate the cost of fencing the rectangular field
        double cost = perimeter * 15;

        // display the result
        System.out.println("The cost of fencing the rectangular field is Rs. " + cost);
    }
}
/*
 * In this program, we first import the java.util.Scanner class to read input
 * from the user. We then prompt the user to enter the area and length of the
 * rectangular field using the System.out.print() method and the
 * Scanner.nextDouble() method.
 * 
 * We calculate the breadth of the rectangular field by dividing the area by the
 * length. We then calculate the perimeter of the rectangular field using the
 * formula 2 * (length + breadth).
 * 
 * Finally, we calculate the cost of fencing the rectangular field by
 * multiplying the perimeter by the cost per metre (which is Rs. 15 in this
 * case). We display the result using the System.out.println() method.
 */