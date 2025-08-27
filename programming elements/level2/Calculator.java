package level2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first numebr: ");
        float number1 = scn.nextFloat();
        System.out.println("Enter second number: ");
        float number2 = scn.nextFloat();
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers" + number1 + " and " + number2 + " is: " + addition +" "+ subtraction + " " + multiplication + " and " +  division );

    }
    
}
