/**
 * Find the repeating and the missing
 */
package sortTraverse;

import java.util.*;
public class MapFetch {

    public static void main(String[] args)
    {

        /**
         * This method involves creating a Hashtable with the help of Map.
         * In this, the elements are mapped to their natural index.
         * In this process, if an element is mapped twice, then it is the repeating element.
         * And if an element’s mapping is not there, then it is the missing element.
         */

        int[] arr = { 4, 3, 6, 2, 1, 1 };

        Map<Integer, Boolean> numberMap
                = new HashMap<>();

        int max = arr.length;

        for (Integer i : arr) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            }
            else {
                System.out.println("Repeating = " + i);
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                System.out.println("Missing = " + i);
            }
        }
    }
}
