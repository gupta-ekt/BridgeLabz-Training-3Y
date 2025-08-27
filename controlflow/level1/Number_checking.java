import java.util.Scanner;
public class Number_checking {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if(number > 0){
            System.out.println("number is positive");
        }
        else if(number < 0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }  
}
