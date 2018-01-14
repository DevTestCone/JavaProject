package collectionmethod;
import java.util.*;

public class CollectionMethod {

    public static void main(String[] args) {
        // ===================================================================
        String thing[] = {"avocado", "cucumber", "pumpkin", "tomato", "vanila", "melon"};
        List<String> listOfThings = Arrays.asList(thing);

        //SORT
        Collections.sort(listOfThings);
        System.out.printf("%s\n", listOfThings);

        Collections.sort(listOfThings, Collections.reverseOrder());
        System.out.printf("%s\n", listOfThings);

        //===================================================================
        Character charArray[] = {'a', 'c', 'd', 'w', 'h'};
        List<Character> listOfChar = Arrays.asList(charArray);

        System.out.println("List is: ");
        output(listOfChar);

        //REVERSE 
        Collections.reverse(listOfChar);
        System.out.println("Reverse: ");
        output(listOfChar);

        //COPY
        Character newCharArray[] = new Character[5];
        List<Character> copyListOfChar = Arrays.asList(newCharArray);

        Collections.copy(copyListOfChar, listOfChar); // First where to copy Second what to copy
        System.out.println("Copy of list: ");
        output(copyListOfChar);

        //=====================================================================
        //FILL
        Collections.fill(listOfChar, 'x');
        System.out.println("List is fill: ");
        output(listOfChar);
    }
//OUTPUT METHOD

    private static void output(List<Character> e) {

        e.forEach((character) -> {
            System.out.printf("%s ", character);
        });
        System.out.println("");
    }

}
