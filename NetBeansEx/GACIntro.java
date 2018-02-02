/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gacintro;

import java.util.*;

/**
 *
 * @author Nemanja Djorovic
 */
public class GACIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Generics 
        List<Integer> intsX = Arrays.asList(1, 2, 3);
        int sX = 0;
        for (int n : intsX) {  //
            sX += n;            //   sX = intsX.stream().map((n) -> n).reduce(sX, Integer::sum);  
        }                           //
        assert sX == 6;

        // Before generics
        List intsY = Arrays.asList(
                new Integer[]{
                    new Integer(1), new Integer(2), new Integer(3)
                }
        );
        int sY = 0;
        for (Iterator it = intsY.iterator(); it.hasNext();) {
            int n = ((Integer) it.next()).intValue();
            sY += n;
        }
        assert sY == 6;

        // Before generics with array
        int[] intsZ = new int[]{1, 2, 3};
        int sZ = 0;
        for (int i = 0; i < intsZ.length; i++) {
            sZ += intsZ[i];
        }
        assert sZ == 6;

//        *************************************************************************************************
        // Generics 
        List<String> wordsX = new ArrayList<>();
        wordsX.add("Hello ");
        wordsX.add("World");
        String addedWordsX = wordsX.get(0) + wordsX.get(1);
        assert addedWordsX.equals("Hello World");

        // Before generics       
        List wordsY = new ArrayList();
        wordsY.add("Hello ");
        wordsY.add("World");
        String addedWordsY = ((String) wordsY.get(0) + (String) wordsY.get(1));
        assert addedWordsY.equals("Hello World");

        // Before generics with array
        String[] wordsZ = new String[]{"Hello ", "World"};
        String addedWordsZ = "";
        for (int i = 0; i < wordsZ.length; i++) {
            addedWordsZ += wordsZ[i];
        }
        assert addedWordsZ.equals("Hello World");

//         *************************************************************************************************
        //If an expression e of type int appears where a value of type Integer is expected,
        //boxing converts it to new Integer(e) (however, it may cache frequently occurring values).
        //If an expression e of type Integer appears where a value of type int is expected,
        //unboxing converts it to the expression e.intValue().
        List<Integer> intsXX = new ArrayList<Integer>();
        intsXX.add(1);
        int nXX = intsXX.get(0);
        assert nXX == 1;

        // is equivalent to the sequence:
        List<Integer> intsYY = new ArrayList<Integer>();
        intsYY.add(Integer.valueOf(1));
        int nYY = intsYY.get(0).intValue();
        assert nYY == 1;

        // The call Integer.valueOf(1) is similar in effect to the expression new Integer(1), but
        // may cache some values for improved performance.
        int sumInt = sum(Arrays.asList(1, 5, 4, 6, 7, 8));
        assert sumInt == 31;
        
        assert sumInteger(Arrays.asList(1, 5, 4, 6, 7, 8)).equals(31);
        
    }

    // Why does the argument have type List<Integer> and not List<int>? Because type
    // parameters must always be bound to reference types, not primitive types. Why does
    // the result have type int and not Integer? Because result types may be either primitive
    // or reference types, and it is more efficient to use the former than the latter. Unboxing
    // occurs when each Integer in the list ints is bound to the variable n of type int.
    public static int sum(List<Integer> ints) {
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        return s;
    }

    // We could rewrite the method, replacing each occurrence of int with Integer:
    public static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) {
            s += n;
        }
        return s;
    }

}
