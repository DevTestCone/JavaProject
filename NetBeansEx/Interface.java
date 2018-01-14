MAIN CLASS
package javainterface;

public class JavaInterface {

    public static void main(String[] args) {
        IntefaceClass nums = new NormalClass();
        
        nums.test(0, 0);
    }  
}

CLASS INTERFACECLASS
package javainterface;

public interface IntefaceClass {  
    void test(int a, int b); 
}

CLASS NORMALCLASS
package javainterface;

public class NormalClass implements IntefaceClass {

    @Override
    public void test(int a, int b) {
        System.out.println("a : " + a + " " + "b: " + b);
    }

}
