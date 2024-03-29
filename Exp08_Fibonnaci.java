//Write a Java Program to Print the Fibonacci Sequence of upto n Terms.

import java.util.Scanner;

public class Exp08_Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upto How many terms: ");
        int a = sc.nextInt();
        int n1 = 0, n2 = 1;
        int count = 0;
        if (a <= 0) {
            System.out.println("Please enter a postive integer.");
            
        }
        else if (a == 1) {
            System.out.println("Fibonacci sequence upto"+a+"is: ");
            System.out.println(n1);    
        }
        else{
            System.out.println("Fibonacci Sequence: ");
            while (a > count) {
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.println(n1);;
                count += 1;
                
            }
        }
        
    }
}
