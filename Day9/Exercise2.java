package exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        
        int limit;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the limit:");
        limit = keyboard.nextInt();
        
        for (int i = 0; i < limit; i++) {
            System.out.println(i + 1);
        }
    }
    
}
