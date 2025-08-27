package arrays.level1;
import java.util.Scanner;
public class Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double[] Array = new double[10];
        double Sum = 0.0;
        int Index = 0;

        while(true){
            System.out.println("enter a negative number or 0 to break the loop: ");
            double num = scn.nextDouble();
            if(num <=0){
                break;
            }
            if(Index == 10){
                break;
            }

            Array[Index] = num;
            Index++;
        }
        System.out.println("elements of array are:");
        for(int i =0; i<Array.length; i++){
            System.out.println(Array[i]+" ");
            Sum = Sum + Array[i];
            
        }
        System.out.println("Total sum of array values are- " + Sum);
    }
}
