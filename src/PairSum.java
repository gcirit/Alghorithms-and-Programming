/**
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 */

import java.util.HashSet;

/**
 * This problem can be solved efficiently by using the technique of hashing.
 * Use a hash_map to check for the current array value x(let), if there exists a value target_sum-x which on adding to the former gives target_sum.
 * This can be done in constant time. Let’s look at the following example.
 *
 * arr[] = {0, -1, 2, -3, 1}
 * sum = -2
 * Now start traversing:
 * Step 1: For ‘0’ there is no valid number ‘-2’ so store ‘0’ in hash_map.
 * Step 2: For ‘-1’ there is no valid number ‘-1’ so store ‘-1’ in hash_map.
 * Step 3: For ‘2’ there is no valid number ‘-4’ so store ‘2’ in hash_map.
 * Step 4: For ‘-3’ there is no valid number ‘1’ so store ‘-3’ in hash_map.
 * Step 5: For ‘1’ there is a valid number ‘-3’ so answer is 1, -3
 */

class PairSum {
    static void printPairs(int[] arr, int sum)
    {
        HashSet<Integer> s = new HashSet<>();
        for (int j : arr) {
            int temp = sum - j;

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + j
                                + ", " + temp + ")");
            }
            s.add(j);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] A = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printPairs(A, n);
    }
}
