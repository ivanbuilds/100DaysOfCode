package vectorsexamples;

import java.util.Scanner;

public class VectorsExamples {

    public static void main(String[] args) { 
        
        int num [] = new int [8];
        Scanner keyboard = new Scanner(System.in);
        
        
      /*num[0] = 14;
        num[1] = 34;
        num[2] = 21;
        num[3] = 13;
        num[4] = 63;
        num[5] = 60;
        num[6] = 90;
        num[7] = 22; */
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter the value for index: " + i);
            num[i] = keyboard.nextInt();
        }
        
        System.out.println("The entered values are: ");
        for (int i = 0; i < num.length; i++ ) {
            System.out.println("Index: " + i + ": " + num[i]);
        }
    }
    
}
