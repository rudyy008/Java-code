//Write a Java Program to find the Greatest Number of the 3 entered Numbers.

import  java.util.*;
public class Exp03_Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Element:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number:");
        int c = sc.nextInt();
        if (a>b) {
            if (a>c) {
                System.out.println("\n"+a+" is Greatest");
            }
            else{
                System.out.println("\n"+c+" is Greatest");
            }
        }
        else{
            if (b>c) {
                System.out.println("\n"+b+" is Greatest");
            }
            else{
                System.out.println("\n"+c+" is Greatest");
            }
        } 
    }         
}

        
    
