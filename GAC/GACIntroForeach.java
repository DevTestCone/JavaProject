/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gacintroforeach;

import java.util.*;

/**
 * @author Nemanja Djorovic
 */
public class GACIntroForeach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> intsX = Arrays.asList(1, 2, 3);
        int sumX = 0;
        for (int num : intsX) {
            sumX += num;
        }
        assert sumX == 6;

        // It is equivalent to the following:
        List<Integer> intsY = Arrays.asList(1, 2, 3);
        int sumY = 0;
        for (Iterator<Integer> iterator = intsY.iterator(); iterator.hasNext();) {
            sumY += iterator.next();
        }

        assert sumY == 6;

        // The foreach loop may also be applied to an array 
        int[] x = {1, 2, 3};
        int sumArrayX = sumArray(x);
        assert sumArrayX == 6;

        int y = removeNegative(Arrays.asList(1, 2, 3));
        assert y == 2 ;

    }

    public static int sumArray(int[] a) {
        int s = 0;
        for (int n : a) {
            s += n;
        }
        return s;
    }

    public static int removeNegative(List<Integer> num) {
        Integer next = 0;
        for (Iterator<Integer> iterator = num.iterator(); iterator.hasNext();) {
            if (iterator.next() < 0) {
                iterator.remove();
            } else {
                next = iterator.next();
            }
            return next;
        }
        return next;
    }
}
