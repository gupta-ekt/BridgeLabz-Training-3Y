package controlflow.level3;

import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        
        int total = physics + chemistry + maths;
        double average = total / 3.0;

        
        System.out.println("\nAverage Marks: " + average);

        
        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent");
        } else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Very Good");
        } else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Good");
        } else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Satisfactory");
        } else if (average >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Needs Improvement");
        } else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Fail – Repeat Needed");
        }

        sc.close();
    }
}
