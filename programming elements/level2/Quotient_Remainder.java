package level2;
import java.util.Scanner;
public class Quotient_Remainder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first number: ");
        int number1 = scn.nextInt();
        System.out.println("enter second number: ");
        int number2 = scn.nextInt();
        int quotient = number1/number2;
        int remainder = number1 % number2;

        System.out.println(" The Quotient is " + quotient + " and Reminder is "+ remainder+ " of two number" +number1+" and" + number2);
    }
}
