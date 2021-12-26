package brackets;

/**
 * Minimum Swaps for Bracket Balancing
 */

// Java Program to count swaps required to balance string
public class MinSwaps
{


    /**
     *We can initially go through the string and store the positions of ‘[‘ in a vector say ‘pos‘.
     * Initialize ‘p’ to 0. We shall use p to traverse the vector ‘pos’.
     * Similar to the naive approach, we maintain a count of encountered ‘[‘ brackets.
     * When we encounter a ‘[‘ we increase the count and increase ‘p’ by 1.
     * When we encounter a ‘]’ we decrease the count. If the count ever goes negative, this means we must start swapping.
     * The element pos[p] tells us the index of the next ‘[‘. We increase the sum by pos[p] – i, where i is the current index.
     * We can swap the elements in the current index and pos[p] and reset the count to 0 and increment p so that it pos[p] indicates to the next ‘[‘.
     */

    static long swapCount(String s)
    {
        char[] chars = s.toCharArray();

        // stores total number of Left and Right
        // brackets encountered
        int countLeft = 0, countRight = 0;
        // swap stores the number of swaps required
        //imbalance maintains the number of imbalance pair
        int swap = 0 , imbalance = 0;

        for (char aChar : chars) {
            if (aChar == '[') {
                // increment count of Left bracket
                countLeft++;
                if (imbalance > 0) {
                    // swaps count is last swap count + total
                    // number imbalanced brackets
                    swap += imbalance;
                    // imbalance decremented by 1 as it solved
                    // only one imbalance of Left and Right
                    imbalance--;
                }
            } else if (aChar == ']') {
                // increment count of Right bracket
                countRight++;
                // imbalance is reset to current difference
                // between Left and Right brackets
                imbalance = (countRight - countLeft);
            }
        }
        return swap;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "[]][][";
        System.out.println(swapCount(s) );

        s = "[[][]]";
        System.out.println(swapCount(s) );

    }
}

