/* Write a java program that uses any 5 methods of "String" class. */
import java.util.Scanner;

public class Exp32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 10;
        System.out.println("Enter a String: ");
        String a = sc.nextLine();

        System.out.println("Your String is: "+a);
        System.out.println("\nUpper Case: "+a.toUpperCase());
        System.out.println("Lower Case: "+a.toLowerCase());
        System.out.println("Length Of String:"+a.length());
        System.out.println("Character at index 0 is:"+a.charAt(0));
        
        String s=String.valueOf(b);    
        System.out.println("Value of Function:"+(s+10));


    }
}
