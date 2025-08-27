public class fee_discount {
    public static void main(String[] args) {
        int fee = 125000;
        int fee_discount = 10;
        double discount_amount = (fee_discount/100.0)* fee;
        double fee_payment = fee - discount_amount;
        System.out.println(" The discount amount is INR "+ discount_amount + " and final discounted fee is INR "+ fee_payment);
    }
    
}
