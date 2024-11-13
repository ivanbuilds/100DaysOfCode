package arraysexercise1;

import java.util.Scanner;

public class ArraysExercise1 {

    public static void main(String[] args) {
        
        String names[] = new String [12];
        Scanner keyboard = new Scanner(System.in);
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name you want to save at index: " + i);
            names[i] = keyboard.nextLine();
        }
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("Index " + i + " : " + names[i]);
        }
        
    }
    
}
