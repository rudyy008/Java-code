//Write a java program that reads two floating point numbers and tests whether they are the same upto 3 decimal pplaces.

import java.util.*;
public class Exp09_Floating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        float a = sc.nextFloat();
        System.out.println("Enter 2nd Number: ");
        float b = sc.nextFloat();
        if (a==b) {
            System.out.println("Both Numbers are same");
        }
        else{
            System.out.println("Both number are not same");
        }
    }
}
