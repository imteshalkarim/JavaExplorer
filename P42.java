
/*In an election two candidates A and B contested. A got 60% of the votes. Write a program to accept the total number of votes and display the number of votes scored by each candidate.  */
import java.util.Scanner;

public class P42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the total number of votes
        System.out.print("Enter the total number of votes: ");
        int totalVotes = input.nextInt();

        // Calculate the number of votes scored by candidate A (60% of total votes)
        int votesForA = (int) (totalVotes * 0.6);

        // Calculate the number of votes scored by candidate B (remaining votes)
        int votesForB = totalVotes - votesForA;

        // Display the number of votes scored by each candidate
        System.out.println("Votes for Candidate A: " + votesForA);
        System.out.println("Votes for Candidate B: " + votesForB);
    }
}
/*
 * In this program, we prompt the user to enter the total number of votes using
 * System.out.print() and read the input using Scanner.nextInt().
 * 
 * We then calculate the number of votes scored by candidate A, which is 60% of
 * the total votes. To do this, we multiply the total votes by 0.6 and cast the
 * result to an integer.
 * 
 * Next, we calculate the number of votes scored by candidate B by subtracting
 * the votes scored by candidate A from the total votes.
 * 
 * Finally, we display the number of votes scored by each candidate using
 * System.out.println().
 */