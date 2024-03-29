/* Write a java program that uses any 5 methods of "Math" class. */

import java.util.Scanner;

public class Exp31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.println("(a,b) = ("+a+","+b+")");

        System.out.println("\nMaximum number of a and b is: " + Math.max(a, b));
        System.out.println("Square root of a is: " + Math.sqrt(a)); 
        System.out.println("exponential of a is: " +Math.exp(a));
        System.out.println("Sine value of a is: " +Math.sin(a));
        System.out.println("Power of a raise to 2 is: " + Math.pow(a,2));

    }
}
