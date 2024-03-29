/*Write a java program to find the factorial of a number entered by the user. */

import java.util.Scanner;

public class Exp23 {
    public static void main(String[] args) {
        int i,fact=1,number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to find Factorial: ");
            number = sc.nextInt();
            for(i=1;i<=number;i++)
            {    
            fact=fact*i;    
            }
        }
        System.out.println("Factorial of "+number+" is: "+fact);    
    }
}
