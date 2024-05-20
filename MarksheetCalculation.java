import java.util.Scanner;



// Hassan 
// Roll no: 2k23/CSEE/31 (Pre-engineering)
// Usama Qazi
// Roll no: 2k23/CSEE/55 (Pre-engineering)
public class MarksheetCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Enter the number of subjects:");
        int numberOfSubjects = scanner.nextInt();

        String[] studentNames = new String[numberOfStudents];
        double[][] studentMarks = new double[numberOfStudents][numberOfSubjects];
        double[] totalMarks = new double[numberOfStudents];
        double[] averageMarks = new double[numberOfStudents];
        char[] studentGrades = new char[numberOfStudents];

        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            studentNames[i] = scanner.nextLine();

            double sum = 0.0;
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.println("Enter marks for subject " + (j + 1) + ":");
                studentMarks[i][j] = scanner.nextDouble();
                sum += studentMarks[i][j];
            }
            scanner.nextLine(); // Consume newline

            totalMarks[i] = sum;
            averageMarks[i] = sum / numberOfSubjects;
            studentGrades[i] = calculateGrade(averageMarks[i]);
        }

        System.out.println("\nStudent Marksheet:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Name: " + studentNames[i]);
            System.out.println("Total Marks: " + totalMarks[i]);
            System.out.println("Average Marks: " + averageMarks[i]);
            System.out.println("Grade: " + studentGrades[i]);
            System.out.println("------------------------");
        }

        scanner.close();
    }

    private static char calculateGrade(double averageMarks) {
        if (averageMarks >= 90) {
            return 'A';
        } else if (averageMarks >= 80) {
            return 'B';
        } else if (averageMarks >= 70) {
            return 'C';
        } else if (averageMarks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
