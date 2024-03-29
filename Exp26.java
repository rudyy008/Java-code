//Write a java program using try-catch block to handle java.lang.ArrayIndexOutOfBoundsException

public class Exp26 {
    public static void main(String[] args) {
        try{
        int arr[] = {1,2,3,4};
        System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
    }    
}
