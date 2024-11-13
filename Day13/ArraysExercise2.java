package arraysexercise2;

import java.util.Scanner;

public class ArraysExercise2 {

    public static void main(String[] args) {
        
        int num[] = new int[10];
        Scanner keyboard = new Scanner(System.in);
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a number for index: " + i);
            num[i] = keyboard.nextInt();
        }
        
        // Search bigger
        int bigger = Integer.MIN_VALUE;
            for (int i = 0; i < 10; i++) {
                if(num[i] > bigger) {
                    bigger = num[i];
                }
            }
        
        // Search smaller
        int smaller = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i++) {
                if(num[i] < smaller) {
                    smaller = num[i];
                }
            }
            
        System.out.println("The bigger number is: " + bigger);
        System.out.println("The smaller number is: " + smaller);

    }
    
}
