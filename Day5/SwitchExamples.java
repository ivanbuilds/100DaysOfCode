package switchexamples;

import java.util.Scanner;

public class SwitchExamples {

    public static void main(String[] args) {
        
        int day;
        String dayName;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Enter a number from 1 to 7:");
        day = keyboard.nextInt();
        
        switch(day){
            case 1: dayName = "Monday";
                break;
            case 2: dayName = "Tuesday";
                break;
            case 3: dayName = "Wednesday";
                break;
            case 4: dayName = "Thursday";
                break;
            case 5: dayName = "Friday";
                break;
            case 6: dayName = "Saturday";
                break;
            case 7: dayName = "Sunday";
                break;
            default: dayName = "Incorrect input, please enter a number from 1 to 7.";
        }
        
        System.out.println("The day of the week is: " + dayName);
        
    }
    
}
