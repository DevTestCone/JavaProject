package gacintromethodsandvarargs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nemanja Djorovic
 */
public class GACIntroMethodsAndVarargs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> intList = Lists.toList(new Integer[]{1, 2, 3});
        List<String> stringList = Lists.toList(new String[]{"one", "two", "three"});

        // Vararg
        List<Integer> intListVararg = Lists.toListVararg(1, 2, 3);
        List<String> stringListVararg = Lists.toListVararg("one", "two", "three");

        // Whenever a vararg is declared, one may either pass a list of arguments to be implicitly
        // packed into an array, or explicitly pass the array directly. Thus, the preceding method
        // may be invoked as follows:
        List<Integer> ints = new ArrayList<>();
        Lists.addAll(ints, 1, 2);
        Lists.addAll(ints, new Integer[]{3, 4});
        assert ints.toString().equals("[1, 2, 3, 4]");
        // Since varargs always create an array, they
        // should be used only when the argument does not have a generic type
        
        // In the preceding examples, the type parameter to the generic method is inferred, but it
        // may also be given explicitly, as in the following examples:
        List<Integer> intX = Lists.<Integer>toListVararg();
        List<Object> objX = Lists.<Object>toListVararg(1, "two");
        // It infers that the argument to toList is an empty array of an arbitrary generic type rather than
        // an empty array of integers, and this triggers the unchecked warning described earlier.
    }
}
//****************************************CLASS LISTS ***********************************************************************************

package gacintromethodsandvarargs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nemanja Djorovic
 */
public class Lists {

    // The static method toList accepts an array of type AnyType[] returns a list of type List<AnyType>
    // This is indicated by writing <AnyType> at the beginning
    // of the method signature, which declares AnyType as a new type variable. A method which
    // declares a type variable in this way is called a generic method. The scope of the type
    // variable AnyType is local to the method itself; 
    // it may appear in the method signature and the
    // method body, but not outside the method.
    public static <AnyType> List<AnyType> toList(AnyType[] arr) {
        List<AnyType> list = new ArrayList</*AnyType*/>();
        for (AnyType anytype : list) {
            list.add(anytype);
        }
        return list;
    }

    // The vararg feature permits a special,
    // more convenient syntax for the case in which the last argument of a method is an
    // array. To use this feature, we replace AnyType[] with AnyType… in the method declaration:
    public static <AnyType> List<AnyType> toListVararg(AnyType... arr) {
        List<AnyType> list = new ArrayList</*AnyType*/>();
        for (AnyType anytype : list) {
            list.add(anytype);
        }
        return list;
    }
    
    // Any number of arguments may precede a last vararg argument.
    // Here is a method that accepts a list and adds all the additional arguments to the end of the list
    public static <AnyType> void addAll(List<AnyType> arr, AnyType... nArr){
        for (AnyType at : nArr) {
            arr.add(at);
        }
    
    } 
    
    
}
