//Write a Java Program to check whether the entered Number is Odd or Even.

import java.util.*;

public class Exp05_OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        if (a%2==0) {
            System.out.println("\n"+a+" is Even");
        }
        else{
            System.out.println("\n"+a+" is Odd");
        }
    }
}