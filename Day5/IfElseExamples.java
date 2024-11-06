package ifelseexamples;

import java.util.Scanner;

public class IfElseExamples {

    public static void main(String[] args) {
        int age;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter age");
        age = keyboard.nextInt();
        
        if (age >= 18) {
            System.out.println("You are 18 or older. Congratulations!");
        }
        
        else {
            System.out.println("You can't access.");
        }
        
        System.out.println("Program has ended.");
    }
    
}
