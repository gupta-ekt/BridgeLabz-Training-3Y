import java.util.Scanner;
public class user_fee {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fee = scn.nextInt();
        int fee_discount = scn.nextInt();
        double discount_amount = (fee_discount/100.0)* fee;
        double fee_payment = fee - discount_amount;
        System.out.println(" The discount amount is INR "+ discount_amount + " and final discounted fee is INR "+ fee_payment);
        scn.close();
    }
    
}
