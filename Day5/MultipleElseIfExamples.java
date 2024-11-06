package multipleelseifexamples;

import java.util.Scanner;

public class MultipleElseIfExamples {

    public static void main(String[] args) {

        int age;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your age:");
        age = keyboard.nextInt();
        
        if (age > 18) {
            System.out.println("You are older than 18.");
            
            
            if (age > 40) {
                System.out.println("You belong to Generation X.");
            } else {
                System.out.println("You are likely a Millennial or Gen Z");
            }
            
           
        } else {
            
            if (age == 18) {
                System.out.println("You are exactly 18.");
            } else {
            System.out.println("You shouldn't be here.");
            }
        }
        
        System.out.println("Program has ended.");
    }
}
   