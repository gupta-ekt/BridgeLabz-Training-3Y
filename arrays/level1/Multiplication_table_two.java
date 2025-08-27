package arrays.level1;

import java.util.Scanner;

public class Multiplication_table_two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number you want to print the table of: ");
        int number = scn.nextInt();
        int[] array = new int[10];
        for(int i=6; i<=array.length; i++){
            array[i-1] = number * i;  
        }
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + array[i - 1]);
        }
    }
    
}
