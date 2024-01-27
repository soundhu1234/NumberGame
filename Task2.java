import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            
            int totalMarks = 0;
            
            System.out.println("Enter marks (out of 100) for each subject:");
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                totalMarks += scanner.nextInt();
            }
            
            double averagePercentage = (double) totalMarks / numSubjects;
            
            System.out.println("\nTotal Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage);
            
            char grade = getGrade(averagePercentage);
            System.out.println("Grade: " + grade);
        }
    }

    public static char getGrade(double averagePercentage) {
        if (averagePercentage >= 90) return 'A';
        if (averagePercentage >= 80) return 'B';
        if (averagePercentage >= 70) return 'C';
        if (averagePercentage >= 60) return 'D';
        return 'F';
    }
}
