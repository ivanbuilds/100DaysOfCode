package parkinglotmanager;

import java.util.Scanner;

public class ParkingLotManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String licensePlate = "";
        int hourlyCount = 0;
        int halfDayCount = 0;
        int fullDayCount = 0;
        double totalIncome = 0;
        double amountToPay;

        System.out.println("Welcome to the parking lot manager");

        while (!licensePlate.equalsIgnoreCase("FIN")) {
            System.out.println("\nEnter vehicle's license plate number");
            licensePlate = scanner.nextLine();
            
            if(!licensePlate.equalsIgnoreCase("FIN")) {
                System.out.println("Select parking type:");
                System.out.println("1. Hourly ($3 USD per hour)");
                System.out.println("2. Half-day (5% discount on $15)");
                System.out.println("3. Full-day (10% discount on $30)");
                System.out.print("Enter your choice: ");
                int parkingType = scanner.nextInt();

                if (parkingType == 1) {
                    System.out.println("Enter the number of hours: ");
                    int hours = scanner.nextInt();
                    scanner.nextLine();
                    amountToPay = hours * 3;
                    System.out.println("The total for your parking is: $" + amountToPay + "USD");
                    hourlyCount++;
                } else if (parkingType == 2) {
                    scanner.nextLine();
                    amountToPay = 15 - (15 * 0.05);
                    System.out.println("The total for your parking is: $" + amountToPay + "USD");
                    halfDayCount++;
                } else if (parkingType == 3) {
                    scanner.nextLine();
                    amountToPay = 30 - (30 * 0.10);
                    System.out.println("The total for your parking is: $" + amountToPay + "USD");
                    fullDayCount++;
                } else {
                    System.out.println("Invalid choice. Please select 1, 2 or 3.");
                    scanner.nextLine();
                    continue;
                }
                
                totalIncome += amountToPay;
                System.out.printf("Amount to pay for " + licensePlate + ": $" + amountToPay);
                
            }
              
        }
        
        System.out.println("End of the day report:");
        System.out.println("Total hourly parkings: " + hourlyCount);
        System.out.println("Total half-day parkings: " + halfDayCount);
        System.out.println("Total full-day parkings: " + fullDayCount);
        System.out.printf("Total income: $" + totalIncome);
    }

}
