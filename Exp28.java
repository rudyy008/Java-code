//Write a java program using throws keyword to handle custom exception.

public class Exp28 {
    public static void check(int age) throws ArithmeticException{
        if (age<18) {
            throw new ArithmeticException("Person is not eligible to Vote");

        }
        else{
            System.out.println("Person eligible to Vote");
        }
    }
    public static void main(String[] args) {
        try{
            check(15);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        check(45);
    }
}
