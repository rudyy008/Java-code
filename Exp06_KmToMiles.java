//Write a Java Program to convert Distance from KM to Miles or Vice Versa.

import java.util.Scanner;

public class Exp06_KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the conversion type:-");
        System.out.println("1. Km To Mile \n2. Mile to Km");
        int choice = sc.nextInt();
        if (choice==1) {
            System.out.println("Enter distance in Km: ");
            double km = sc.nextDouble();
            double miles = km*0.621371;
            System.out.println(String.format("Distance in Miles: %.2f",miles));
            
        }
        else{
            System.out.println("Enter distance in Miles: ");
            double miles = sc.nextDouble();
            double km = miles/0.621371;
            System.out.println(String.format("Distance in Km: %.2f",km));
        }
    }
}
