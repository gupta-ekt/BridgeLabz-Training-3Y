package level2;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();

        double opr1 = a +b * c;
        double opr2 = a * b + c;
        double opr3 = c + a / b;
        double opr4 = a % b + c;

        System.out.println(" The results of Int Operations are "+ opr1 + ", " + opr2 + "," + opr3 + " and " + opr4);
    }
    
}
