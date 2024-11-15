package matricesexercise;

import java.util.Scanner;

public class MatricesExercise {

    public static void main(String[] args) {
        
        double grades[][] = new double[4][3];
        double averages[] = new double[4];
        
        Scanner keyboard = new Scanner(System.in);
        
        for (int r = 0; r < grades.length; r++) {
            System.out.println("Enter the 3 grades for the student: " + (r + 1) + ":");
            for (int c = 0; c < grades[0].length; c++) {
                grades[r][c] = keyboard.nextDouble();
            }
        }
        
        double total;
        
        for (int r = 0; r < grades.length; r++) {
            total = 0;
            for (int c = 0; c < grades[0].length; c++) {
                total = total + grades[r][c];
            }
            averages[r] = total / grades[0].length;
        }
        System.out.println("******************************************");
        
        for (int r = 0; r < grades.length; r++) {
            System.out.println("The grades for the student " + (r + 1) + " are: ");
            for (int c = 0; c < grades[0].length; c++) {
                System.out.println((c + 1) + " test: " + grades[r][c]);
            }
            System.out.println("The average is: " + averages[r]);
            System.out.println("******************************************");
        }
    }
    
}
