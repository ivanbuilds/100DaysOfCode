package exercise5;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        String word;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the text you want to print or type 'Out' to exit:");
        word = keyboard.nextLine();

        while (!word.equalsIgnoreCase("Out")) {
            System.out.println("The text is: " + word);

            System.out.println("Enter the text you want to print");
            word = keyboard.nextLine();
        }
        
        System.out.println("Thanks for using our program");
    }

}
