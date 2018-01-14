MAIN CLASS
package javaexceptions;

public class JavaExceptions {

    public static void throwMyExceptions() throws MyExceptions{
        throw new MyExceptions();      
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            throwMyExceptions();
        } catch (MyExceptions e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }   
    }
}

CLASS MYEXCEPTIONS
package javaexceptions;

public class MyExceptions extends Exception{
    
    @Override
    public String toString(){
    return "My Exception toString method";
    }
    
    @Override
    public String getMessage(){
    return "My Exception getMessage method";
    }
}
