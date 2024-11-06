package ternaryoperator;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        
        double average;
        String finalCondition;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Enter the student average:");
        average = keyboard.nextDouble();
        
        finalCondition = average >= 6 ? "Passed" : "Failed";
        
        System.out.println("The student final condition is: " + finalCondition);
    }
    
}
