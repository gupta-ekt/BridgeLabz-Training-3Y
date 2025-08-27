package arrays.level1;
import java.util.Scanner;
public class Multi_Dimensional_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows you want: ");
        int rows = scn.nextInt();
        System.out.println("enter the number of columns you want: ");
        int cols = scn.nextInt();
        int[][] array = new int[rows][cols];

        System.out.println("enter the elemnts of array-");
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; i++){
                array[i][j] = scn.nextInt();
            }    
        }
        int[] array2 = new int[rows * cols];
        int index =0;
        for(int i=0; i<=rows; i++){
            for(int j=0; j<=cols; j++){
                array2[index] = array[i][j];
                index++; 
            }
        }
        System.out.println("1D Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }        
    }
    
}
