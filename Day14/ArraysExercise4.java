package arraysexercise4;

import java.util.Scanner;

public class ArraysExercise4 {

    public static void main(String[] args) {
        
        double salary[] = new double[12];
        Scanner keyboard = new Scanner(System.in);
        
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Enter the salary for the month: " + (i + 1));
            salary[i] = keyboard.nextDouble();
        }
        
        double annualSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            annualSalary = annualSalary + salary[i];
        }
        
        double averageSalary;
        averageSalary = annualSalary / salary.length;
        
        System.out.println("Annual salary: " + annualSalary + " USD");
        System.out.println("Average monthly salary: " + averageSalary + " USD");
    }
    
}
