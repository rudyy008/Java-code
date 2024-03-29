/* Write a java program to do autoboxing and unboxing using wrapper class. */

public class Exp30 {
    public static void main(String[] args) {
        int a = 69;
        System.out.println("Primitive Value is: "+ a);
        Integer i = Integer.valueOf(a);
        System.out.println("Object Value after autoboxing is: "+ i);

        int b = i.intValue();
        System.out.println("Primitive Value after Unboxing: "+ b);
    }
    
}

