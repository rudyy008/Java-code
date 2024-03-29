//Write a Java program that takes a year from the user and prints whether it is a leap year or not.

import java.util.Scanner;

public class Exp11_leapyear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the year to check: ");
            int a = sc.nextInt();

            if(a % 100 == 0){
                if (a % 400 == 0) {
                    System.out.println("Its a leap Year");
                }
                else{
                    System.out.println("Its not a leap Year");
                }
            }
            else if (a % 4 == 0) {
                System.out.println("Its a leap Year");            
            }
            else{
                System.out.println("Its not a leap Year");
            }
        }
        
    }
}
