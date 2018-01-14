MAIN CLASS
package javaabstract;

public class JavaAbstract {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Person student = new Student();
        
        student.run();
    }
}

CLASS PERSON
package javaabstract;

public abstract class Person {

    abstract void run();    
}

CLASS STUDENT
package javaabstract;

public class Student extends Person{

    @Override
    void run() {
        System.out.println("Student is running");
    }
}
