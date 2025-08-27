package level2;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter distance in feet : ");
        int distance_feet = scn.nextInt();
        int distance_yard = 3 * distance_feet;
        int distance_mile = 1760 * distance_yard;
        System.out.println(" The distance in yards is " + distance_yard + " while the distance in miles is " + distance_mile);
    }
}
