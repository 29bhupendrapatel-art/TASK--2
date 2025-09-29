package CodeSoftProject;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            // Validation: Marks should not exceed 100 or be negative
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered. Please enter between 0 and 100.");
                return; // exit program
            }

            totalMarks += marks[i];
        }

        // Calculate average percentage
        double average = (double) totalMarks / n;

        // Grade calculation
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 35) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks = " + totalMarks);
        System.out.printf("Average Percentage = %.2f%%\n", average);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
