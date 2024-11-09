package whileexamples;

import java.util.Scanner;

public class WhileExamples {

    public static void main(String[] args) {
        
        // counter cotrolled loop
        /*int counter = 0;
        
        while (counter < 10) {
            System.out.println("I'm in the iteration N° " + counter);
            counter++;
        }*/
        
        // Sentinel controlled loop
        boolean flag = true;
        Scanner keyboard = new Scanner(System.in);
        String response;
        
        while (flag == true) {
            System.out.println("The current flag value is: " + flag);
            System.out.println("Do you want to change the flag value to false? Type 'yes' to continue: " + flag);
            
            response = keyboard.next();
            
            if (response.equalsIgnoreCase("yes")) {
                flag = false;
                System.out.println("Flag value updated to: " + flag);
            }
        }
        
        System.out.println("Loop ended as flag is now: " + flag);
    }
    
}
