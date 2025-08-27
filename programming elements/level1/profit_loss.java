public class profit_loss {
    public static void main(String[] args) {
        int cost_price = 129;
        int selling_price = 191;
        int profit = selling_price - cost_price;
        int loss = cost_price - selling_price;
        double pro_percent = profit / (double)cost_price * 100;
        double loss_percent = loss / (double)cost_price* 100;

        System.out.println("The Cost Price is INR:"+ cost_price +" and Selling Price is INR" + selling_price);
        System.out.println("The Profit is INR "+ profit+" and the Profit Percentage is: " + pro_percent);
        System.out.println("The Loss is INR "+ loss +" and the loss Percentage is: " + loss_percent);
    }
    
}
