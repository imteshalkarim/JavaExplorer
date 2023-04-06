//Write a program named p07_percent1 to store roll number, marks in three subjects of a student and display the roll, total and percentage of marks obtained by the student.
public class p07_percent1 {
    public static void main(String[] args) {
        // Initialize variables for roll number and marks in three subjects
        int rollNo = 1234;
        int sub1Marks = 80;
        int sub2Marks = 75;
        int sub3Marks = 90;
        
        // Calculate total marks and percentage
        int totalMarks = sub1Marks + sub2Marks + sub3Marks;
        double percentage = (totalMarks / 3.0);
        
        // Display the roll number, total marks, and percentage
        System.out.println("Roll number: " + rollNo);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
/*In this program, we first initialize four variables rollNo, sub1Marks, sub2Marks, and sub3Marks with values 1234, 80, 75, and 90, respectively.

Next, we calculate the totalMarks by adding the marks obtained in the three subjects. We also calculate the percentage by dividing the totalMarks by 3.0 and multiplying by 100.

Finally, we display the rollNo, totalMarks, and percentage using System.out.println(). */