import java.util.Scanner;
public class distance_conversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double km = scn.nextDouble();
        double mile = 1.6 * km;
        System.out.println("The total miles is "+ mile +" mile for the given "+  km +" km");
        scn.close();
    }
    
}
