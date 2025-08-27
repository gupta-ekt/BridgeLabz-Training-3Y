package level2;
import java.util.Scanner;
public class Square_side {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the perimeter of square");
        int perimeter = scn.nextInt();
        int side = perimeter / 4;

        System.out.println(" The length of the side is " + side + " whose perimeter is " + perimeter);
    }
    
}
