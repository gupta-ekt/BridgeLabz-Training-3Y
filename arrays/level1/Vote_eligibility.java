package arrays.level1;
import java.util.Scanner;
public class Vote_eligibility {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] students = new int[10];

        System.out.println("enter the ages:");
        for(int i =0; i<students.length; i++){
            students[i] = scn.nextInt();
        }
        for(int i = 0; i<students.length; i++){
            if(students[i] >= 18){
                System.out.println("student can vote");
            }
            else if(students[i] < 0){
                System.out.println("invalid age");
            }
            else{
                System.out.println("student can not vote");
            }
        }
    } 
}
