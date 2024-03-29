//Write a Java program to display the multiplication table of a given integer. 


import java.util.Scanner;

public class Exp13_MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number for which you want the Multiplicaton Table: ");
            int a = sc.nextInt();
            System.out.println("\n");
            for (int i=0;i<=10;i++){
                int b=a*i;
                System.out.println(a +" X "+ i +" = " + b);
            }
        }

    }
}

