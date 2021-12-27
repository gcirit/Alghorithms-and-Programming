package sortTraverse;

/**
 * Find the repeating and the missing
 */

public class SortAndFetch {

    static void printTwoElements(int arr[], int size)
    {
        /**
         * Create a temp array temp[] of size n with all initial values as 0.
         * Traverse the input array arr[], and do following for each arr[i]
         * if(temp[arr[i]] == 0) temp[arr[i]] = 1;
         * if(temp[arr[i]] == 1) output “arr[i]” //repeating
         */
        int i;
        System.out.print("The repeating element is ");

        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }

        /**
         * Traverse the array.
         * While traversing, use the absolute value of every element as an index and make the value at this index as negative to mark it visited.
         * If something is already marked negative then this is the repeating element.
         * To find missing, traverse the array again and look for a positive value.
         */
        System.out.print("And the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
    }
}
