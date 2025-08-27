package arrays.level1;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input! Enter a positive number.");
            return; // exit program if input is invalid
        }

        // Step 2: Initialize variables
        int maxFactor = 10;               // initial capacity of factors array
        int[] factors = new int[maxFactor]; // array to store factors
        int index = 0;                    // keeps track of how many factors are stored

        // Step 3: Find factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {  // if i divides num evenly, it's a factor
                // Step 4: Check if array is full
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2; // double the capacity
                    int[] temp = new int[maxFactor]; // create new bigger array
                    // copy old elements into temp
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    // now replace factors array with new bigger array
                    factors = temp;
                }

                // Step 5: Store factor in array
                factors[index] = i;
                index++;
            }
        }

        // Step 6: Display stored factors
        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
