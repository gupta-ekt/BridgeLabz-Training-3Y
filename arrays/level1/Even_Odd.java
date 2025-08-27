package arrays.level1;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("enter the values of array");
        for(int i =0; i<array.length; i++){
            array[i] = scn.nextInt();
        }
        for(int i =0; i<array.length; i++){
            if(array[i] > 0){
                if(array[i] %2 ==0){
                    System.out.println("number"+array[i]+" is even");
                }
                else{
                    System.out.println("number" + array[i] +" is odd");
                }
            }
            else if(array[i] == 0){
                System.out.println("zero");
            }
            else {
                System.out.println("number"+ array[i] + " is negative");
            }
        }
        for(int i=0; i<array.length; i++){
            if(array[i] > array[array.length -1]){
                System.out.println("element" + array[i] +" is greater than "+ array[array.length-1]);
            }
            else{
                System.out.println("element" + array[i] + " is smaller than " + array[array.length-1]);
            }
        }
    }
    
}
