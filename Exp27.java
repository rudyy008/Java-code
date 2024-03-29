//Write a java program using throw keyword to throw custom exception.

public class Exp27 {
    public static void check(int age){
        if (age<18) {
            throw new ArithmeticException("Person is not eligible to Vote");

        }
        else{
            System.out.println("Person eligible to Vote");
        }
    }
    public static void main(String[] args) {
        check(45);
        check(15);
    }
}
