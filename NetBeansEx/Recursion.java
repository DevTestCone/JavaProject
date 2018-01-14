package recursion;

public class Recursion {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fact(6));
    }
    //FACTORIAL
   public static long fact(long num){
    
        if (num<=1) {
            return 1;
        }else{
           return num * fact(num-1); 
        }
        
        // More elegante
        // return (num <= 1) ? 1 : num * fact(num - 1);
    }
}
