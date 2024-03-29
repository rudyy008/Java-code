/*Write a java program to find sum of digits in a given number */

import java.util.Scanner;

public class Exp24 {
    public static void main(String[] args) {
        long number, sum;  
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");  
            number=sc.nextLong();
        }  
        for(sum=0; number!=0; number=number/10)  
        {
            sum = sum + number % 10;  
        }
        System.out.println("Sum of digits: "+sum);  
    }
}
