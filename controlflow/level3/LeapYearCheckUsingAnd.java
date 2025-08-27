package controlflow.level3;

import java.util.Scanner;

public class LeapYearCheckUsingAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian Calendar).");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }
}

