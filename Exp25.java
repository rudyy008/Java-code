/* Write a java program using try-catch block to handle java.lang.ArithmeticException. */

public class Exp25 {  
        public static void main(String[] args) {  
            try  
            {  
            int a=50;
            System.out.println(a/0); 

            }  
                // handling the exception by using Exception class      
            catch(Exception e)  
            {  
                System.out.println(e);  
            }  
        }  
          
      
}
