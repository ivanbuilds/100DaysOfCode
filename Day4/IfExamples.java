package ifexamples;

import java.util.Scanner;

public class IfExamples {

    public static void main(String[] args) {
        
        int age;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter age");
        age = keyboard.nextInt();
        
        if (age >= 18) {
            System.out.println("You are older than 18. Congratulations!");
        }
        
        System.out.println("End");
        
    }
    
}
