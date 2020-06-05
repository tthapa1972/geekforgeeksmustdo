package practice.gfg.string;

import java.util.Arrays;

public class LargestWindowWithUniqueCharacter {

    /*
    Time Complexity: O(n + d) where n is length of the input string and d is number of characters in input string alphabet. For example, if string consists of lowercase English characters then value of d is 26.
Auxiliary Space: O(d)
    * */

    public int getLengthofLargestWindow(String str){

        int []LAST_CHAR = new int[256];

        Arrays.fill(LAST_CHAR, -1);

        int i = 0;

        int res = Integer.MIN_VALUE;

        for(int j = 0;j < str.length();j++){

            i = Math.max(i, LAST_CHAR[str.charAt(j)] + 1);

            res = Math.max(res, j - i + 1);

            LAST_CHAR[str.charAt(j)] = j;

        }

        return res;

    }
}
