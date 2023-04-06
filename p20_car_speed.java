//Write a program named p20_car_speed to enter distance covered and time taken by a car and calculate its speed.
import java.util.Scanner;

public class p20_car_speed {
    public static void main(String[] args) {
        // create scanner object to read input from user
        Scanner sc = new Scanner(System.in);
        
        // read the distance and time taken from the user
        System.out.print("Enter the distance covered (in km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter the time taken (in hours): ");
        double time = sc.nextDouble();
        
        // calculate the speed of the car
        double speed = distance / time;
        
        // display the speed of the car
        System.out.println("The speed of the car is " + speed + " km/h");
        
        // close the scanner object
        sc.close();
    }
}
/*In this program, we first import the java.util.Scanner class to read input from the user. We then create a Scanner object called sc. Next, we prompt the user to enter the distance covered by the car in kilometers and the time taken by the car in hours using the System.out.print method and read the input values using the nextDouble method of the Scanner class.

We then calculate the speed of the car by dividing the distance covered by the time taken and store it in the speed variable. Finally, we display the speed of the car using the System.out.println method and close the Scanner object. */