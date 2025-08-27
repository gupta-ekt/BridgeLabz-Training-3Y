package arrays.level1;
import java.util.Scanner;
public class Mean_height_football {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        
        for(int i=0; i <heights.length; i++){
            heights[i] = scn.nextDouble();
            sum = sum + heights[i];
        }
        double mean = sum/11;
        System.out.println("the mean height is: "+ mean); 
        


    }
    
}
