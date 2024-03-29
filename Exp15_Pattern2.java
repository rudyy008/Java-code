/*
Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
The pattern like :
	1
	2 3
	4 5 6
	7 8 9 10
*/

import java.util.Scanner;

public class Exp15_Pattern2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int a = sc.nextInt();
            int b = 1;
            for (int i = 0;i <= a;i++){
                for (int j = 0;j < i;j++){
                    System.out.print(b + " ");
                    b++;
                }
                System.out.print("\n");
            }
        }
    }
}
