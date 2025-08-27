package level2;
import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int opr1 = a +b * c;
        int opr2 = a * b + c;
        int opr3 = c + a / b;
        int opr4 = a % b + c;

        System.out.println(" The results of Int Operations are "+ opr1 + ", " + opr2 + "," + opr3 + " and " + opr4);
    }
}
