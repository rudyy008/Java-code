//Write a Java Program to perform Arithmetic Operations such as +,-,/,* on 2 entered Numbers.

import java.util.*;

public class Exp02_Arithmatic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("\nEnter 2nd Number:");
        int b = sc.nextInt();
        int sum = a+b;
        int dif = a-b;
        int pro = a*b;
        int div = a/b;
        System.out.println("\nSum: "+ sum);
        System.out.println("Difference: "+ dif);
        System.out.println("Product: "+ pro);
        System.out.println("Division: "+ div);
    }
}
