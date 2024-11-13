package matricesexamples;

import java.util.Scanner;

public class MatricesExamples {

    public static void main(String[] args) {
        
        int matriz[][] = new int[3][4];
        Scanner keyboard = new Scanner(System.in);
        
        for (int r = 0; r < matriz.length; r++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.println("Enter the value for row: " + r + " column: " + c);
                matriz[r][c] = keyboard.nextInt();
            }
        }
        
        System.out.println("The entered values are:");
        for (int r = 0; r < matriz.length; r++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.println("Row: " + r + " Column: " + c + " Value: " + matriz[r][c]);
            }
        }
        
    }
    
}
