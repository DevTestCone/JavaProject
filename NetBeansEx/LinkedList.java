package linkedlist;

import java.util.*;

public class LinkedList {

    public static void main(String[] args) {
        // TODO code application logic here
        String things[] = {"apples", "berries", "tomato", "pumpkin", "potatoes","beans", "peas"};
        List<String> thingsList = new java.util.LinkedList<>();
        thingsList.addAll(Arrays.asList(things));
//       
        String moreThings[] = {"stallion", "bat", "sloth", "hyena", "whale"};
        List<String> moreThingsList = new java.util.LinkedList<>();
        moreThingsList.addAll(Arrays.asList(moreThings));

        thingsList.addAll(moreThingsList); // list connected
        moreThingsList = null; // delate list 

        printMe(thingsList); // print list 
        removeStuff(thingsList, 2, 5); //stuff are deleted from the list from number x to number y
        printMe(thingsList); // print list
        reverseMe(thingsList); //  print list form the end to the beginning
    }

    //     PRINT ME METHOD
    private static void printMe(List<String> thingsList) {
        thingsList.forEach((string) -> {
            System.out.printf("%s ", string);
        });
        System.out.println();
    }

    //    REMOVE STUFF FROM LIST    
    private static void removeStuff(List<String> thingsList, int start, int end) {
        thingsList.subList(start, end).clear();
    }

    //    REVERSE
    private static void reverseMe(List<String> thingsList) {
        ListIterator<String> iterator = thingsList.listIterator(thingsList.size());
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
        System.out.println();
    }

}
