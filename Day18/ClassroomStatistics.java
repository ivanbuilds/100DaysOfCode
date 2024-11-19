package classroomstatistics;

import java.util.Scanner;

public class ClassroomStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        
        String[] studentNames = new String[numStudents];
        double[][] grades = new double[numStudents][3];
        double[] averages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name for student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
            System.out.println("Enter 3 grades for " + studentNames[i] + ":");
            for (int j = 0; j < 3; j++) {
                grades[i][j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }

        double highestGrade = Double.MIN_VALUE;
        String topStudent = "";
        double classTotal = 0;

        for (int i = 0; i < numStudents; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += grades[i][j];
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                    topStudent = studentNames[i];
                }
            }
            averages[i] = total / 3;
            classTotal += averages[i];
        }

        double classAverage = classTotal / numStudents;

        System.out.println("\nClassroom Statistics:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student: " + studentNames[i] + " | Grades: ");
            for (int j = 0; j < 3; j++) {
                System.out.print((int)grades[i][j] + (j < 2 ? ", " : ""));
            }
            System.out.printf(" | Average: " + averages[i]);
        }

        System.out.println("\nThe highest grade in the class is " + (int)highestGrade + ", achieved by " + topStudent + ".");
        System.out.printf("\nThe overall class average is:" + classAverage);

        scanner.close();
    }
    
}
