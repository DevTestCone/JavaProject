package manualexceptionthrowing;

public class ManualExceptionThrowing {

      static int divide(int a, int b){
        if(b==0){
            return 0;
        } else 
        if(a>10||b>10){
            throw new ArithmeticException("Larger than 10");
        } else {
            return a+b;
        }
    }
    public static void main(String[] args)  { 
        try {
         System.out.println(divide(14,1));
        } catch(ArithmeticException ex){
            System.out.print("Cause :: ");
            System.out.print(ex.getCause());
            System.out.println("\nClass :: "+ex.getClass());
            System.out.println("Message :: "+ex.getMessage()); 
        }
    }
