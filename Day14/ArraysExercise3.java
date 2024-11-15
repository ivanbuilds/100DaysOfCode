package arraysexercise3;

import java.util.Scanner;

public class ArraysExercise3 {

    public static void main(String[] args) {
        
        
        int num [] = new int[15];
        Scanner keyboard = new Scanner(System.in);
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Enter the number for index: " + i);
            num[i] = keyboard.nextInt();
        }
        
        int count3 = 0;
        
        for (int i = 0; i < 15; i++) {
            if (num[i] == 3 || num[i]==-3) {
                count3++; 
            }
        }
        
        System.out.println("The number 3 appears " + count3 + " times.");
        
    }
    
}
