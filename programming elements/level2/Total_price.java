package level2;
import java.util.Scanner;
public class Total_price {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter unit price of item: ");
        int unit_price = scn.nextInt();
        System.out.println("enter total quantity: ");
        int quantity = scn.nextInt();
        int Total_price = unit_price * quantity;

        System.out.println("The total purchase price is INR if the quantity is " + quantity+ " and unit price is "+ unit_price + " is INR " + Total_price );
    }
    
}
