/* Write a java program that uses any 5 methods of "StringBuffer" class. */

import java.util.Scanner;

public class Exp33 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a String: ");
         String a = sc.nextLine();
         
         StringBuffer sb=new StringBuffer(a);
         sb.append(" hello");
         System.out.println("\nAppend Hello in String: "+ sb);

         StringBuffer sb1=new StringBuffer(a);
         sb1.insert(1, 44);
         System.out.println("Insert 44 at index 1: "+ sb1);
        
         StringBuffer sb2=new StringBuffer(a);
         sb2.replace(1,3,"lol");
         System.out.println("Replace with lol: "+ sb2);

         StringBuffer sb3=new StringBuffer(a);
         sb3.delete(1, 2);
         System.out.println("Delete Function at index 1 to 2: "+ sb3);

         StringBuffer sb4=new StringBuffer(a);
         sb4.reverse();
         System.out.println("Reversed String: "+ sb4);
    }
    
}
