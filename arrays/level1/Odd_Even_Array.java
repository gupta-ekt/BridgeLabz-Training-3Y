package arrays.level1;
import java.util.Scanner;
public class Odd_Even_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        if(number<1){
            System.out.println("the number given by user is not natural number");
            System.exit(number);
        }
        int[] odd = new int[number/2+1]; 
        int[] even = new int[number/2+1];

        int indexodd = 0;
        int indexeven = 0;
        for(int i =1; i<=number; i++){
            if(i /2 ==0){
                even[indexeven] = i;
                indexeven++;
            }
            else{
                odd[indexodd] = i;
                indexodd++; 
            }
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < indexeven; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < indexodd; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }
    
}
