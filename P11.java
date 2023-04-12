//Write a program to display the average runs of a cricket player. The player has scored 400 runs in 5 innings, 396 in 6 innings and 700 runs in 8 innings. 
public class P11 {
    public static void main(String[] args) {
        // Initialize variables
        int runs1 = 400;
        int innings1 = 5;
        int runs2 = 396;
        int innings2 = 6;
        int runs3 = 700;
        int innings3 = 8;

        // Calculate total runs and total innings
        int totalRuns = runs1 + runs2 + runs3;
        int totalInnings = innings1 + innings2 + innings3;

        // Calculate and display average runs
        double averageRuns = (double) totalRuns / totalInnings;
        System.out.println("The average runs of the cricket player is: " + averageRuns);
    }
}
/*
 * This program first initializes variables to store the runs and innings played
 * by the cricket player in three different matches. It then calculates the
 * total runs and total innings played by the player by adding up the individual
 * runs and innings variables.
 * 
 * Finally, the program calculates the average runs scored by dividing the total
 * runs by the total innings, and displays the result using the
 * System.out.println() function.
 */