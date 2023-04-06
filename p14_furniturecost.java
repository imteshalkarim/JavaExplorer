//Write a program named p14_furniturecost which accepts the cost of 1 table and 1 chair and display the cost of 16 tables and 12 chairs.
public class p14_furniturecost {
    public static void main(String[] args) {
        // cost of 1 table and 1 chair
        int tableCost = 1500;
        int chairCost = 500;

        // calculate cost of 16 tables and 12 chairs
        int totalTableCost = 16 * tableCost;
        int totalChairCost = 12 * chairCost;
        int totalCost = totalTableCost + totalChairCost;

        // display the total cost
        System.out.println("The cost of 16 tables and 12 chairs is: " + totalCost);
    }
}
/*In this program, we declare two variables to hold the cost of 1 table and 1 chair.
Then, we use these values to calculate the total cost of 16 tables and 12 chairs by multiplying the cost per item by the number of items, and adding the results together.
Finally, we display the total cost using System.out.println(). */