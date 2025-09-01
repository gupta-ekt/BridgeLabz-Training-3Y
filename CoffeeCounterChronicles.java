// The Coffee Counter Chronicles ☕
 
// Ravi runs a café. Each customer orders different coffee types with quantities. Write a program
// that:
// Asks for coffee type (switch)
// Calculates total bill (price * quantity)
// Adds GST using arithmetic operators
// Use while to continue for the next customer and break when "exit" is typed

import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GST = 0.05;

        System.out.println("Welcome to Ravi's Cafe");
        System.out.println("Menu:");
        System.out.println("1. Espresso - 100");
        System.out.println("2. Cappuccino - 150");
        System.out.println("3. Latte - 200");
        System.out.println("Type 'exit' to stop.");

        while (true) {
            System.out.print("Enter coffee type (espresso/cappuccino/latte or exit): ");
            String coffeeType = sc.next().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Thank you! Café closed for the day ");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int price = 0;

            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                case "latte":
                    price = 200;
                    break;
                default:
                    System.out.println("Invalid coffee type.");
                    continue;
            }

            int total = price * quantity;
            double gst = total * GST;
            double finalBill = total + gst;

            System.out.println("Bill for " + quantity + " " + coffeeType  + "is: " + total);
            System.out.printf("GST:" + gst);
            System.out.printf("Total Amount Payable: " + finalBill);
        }

        sc.close();
    }
}
