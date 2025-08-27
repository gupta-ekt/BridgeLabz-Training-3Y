package level2;
import java.util.Scanner;
public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value for base of triangle: ");
        double base = scn.nextDouble();
        System.out.println("Enter value for height of triangle: ");
        double height = scn.nextDouble();
        double area_cm = 0.5 * base * height;
        double area_inches = area_cm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + area_inches + " and sq cm is: " + area_cm);
        
    }
    

}
