/*
Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
    The pattern is as follows :
    1
    22
    333
    4444
*/

import java.util.Scanner;

public class Exp14_Pattern1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int a = sc.nextInt();
            for (int i = 0;i <= a;i++){
                for (int j = 0;j < i;j++){
                    System.out.print(i + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
