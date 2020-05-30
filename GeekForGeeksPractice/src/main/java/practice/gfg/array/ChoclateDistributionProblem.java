package practice.gfg.array;

import java.util.Arrays;

public class ChoclateDistributionProblem {

    /*
    Time Complexity : O(n Log n) as we apply sorting before subarray search.
    * */

    public int findMimimumDifference(int []array, int n, int m){

        if(n == 0 || m == 0){
            return 0;
        }

        if(m > n){
            return -1;
        }

        Arrays.sort(array);

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0;i+m-1 < n;i++){
            int diff = array[i+m-1] - array[i];

            if(diff < minDiff){
                minDiff = diff;
            }

        }

        return minDiff;

    }

}
