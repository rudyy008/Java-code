//Write a java program to add two numbers using class and object.

import java.util.*;

class addition{
    int add(int x, int y){
        return (x+y);
    }
}
public class Exp16_Add {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st Number: ");
            int a =  sc.nextInt();
            System.out.print("Enter 2nd Number: ");
            int b = sc.nextInt();

            addition z = new addition();
            int c = z.add(a,b);
            System.out.print("Addition of two Numbers is: "+c);
        }
    }
}
