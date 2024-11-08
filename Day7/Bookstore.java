package bookstore;

import java.util.Scanner;

public class Bookstore {

    public static void main(String[] args) {
        
        // Variables
        int bookQuantity;
        double purchaseAmount;
        double minBooksForPurchase = 3;
        //double minAmountForFreeShipping = 50.00;
        double shippingCost;
        
        Scanner scanner = new Scanner(System.in);
        
        // Quantity check
        System.out.println("Enter the quatity of books you want to buy: ");
        bookQuantity = scanner.nextInt();
        
        if (bookQuantity >= minBooksForPurchase) {
            System.out.println("You can proced with your purchase.");
        } else {
            System.out.println("You need to buy at least " + minBooksForPurchase + " books to complete the purchase.");
            return;
        }
        
        // Purchase amount
        System.out.println("Enter the total cost of the books: ");
        purchaseAmount = scanner.nextDouble();
        
        // Calculate shipping
        if (bookQuantity >= 20) {
            shippingCost = 0.0;
        } else {
            if (bookQuantity >= 10) {
                shippingCost = 5.00;
            } else {
                if (bookQuantity >= 5) {
                    shippingCost = 10.00;
                } else {
                    shippingCost = 15.00;
                }
            }
        }
        
        // Out
        System.out.println("Total cost of books: $" + purchaseAmount);
        System.out.println("Shipping cost: $" + shippingCost);
        
        double totalCost = purchaseAmount + shippingCost;
        System.out.println("Total amount due: $" + totalCost);
        
        if (shippingCost == 0.0) {
            System.out.println("Congratulations! You've qualified for free shipping");
        } else {
            System.out.println("Thank you for your purchase.");
        }
        
        System.out.println("Enjoy your books!");
    }
    
}
