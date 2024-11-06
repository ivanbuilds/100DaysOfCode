package theaterclassex;

import java.util.Scanner;

public class TheaterClassEx {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Variables
        String className = "Beginner Theater Class";
        String assignedTime = "";
        double baseFee = 50.0;
        double finalFee;
        int age;
        int hours;
        
        
        // Input
        System.out.println("Enter the student's age: ");
        age = keyboard.nextInt();
        
        System.out.println("Enter the number of hours for the class: ");
        hours = keyboard.nextInt();
        
        
        // Class time
        if (age <= 6) {
            System.out.println("Sorry, students under 6 years old cannot join.");
            return;
        } else {
            if (age >= 7 && age <= 12) {
                assignedTime = "10:00 AM";   
            } else {
                if (age >= 13 && age <= 19) {
                    assignedTime = "1:00 PM";
                } else {
                    if (age >= 20)
                        assignedTime = "4:00 PM";
                }
            }
        }
        
        
        // Fee
        finalFee = baseFee * hours;
        
        
        // Output
        System.out.println("Class name: " + className);
        System.out.println("Age Group: " + age);
        System.out.println("Assigned Time: " + assignedTime);
        System.out.println("Class Fee for " + hours + " hours: $" + finalFee);
    }
    
}
