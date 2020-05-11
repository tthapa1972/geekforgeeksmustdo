package practice.gfg;

/*
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
1 ≤ T ≤ 110
1 ≤ N ≤ 106
-107 ≤ A[i] <= 107

Example:
Input
2
5
1 2 3 -2 5
4
-1 -2 -3 -4
Output
9
-1
* */

public class KadanesAlgorithm {

    public int maxSubArraySumMethod1(int a[]) {

        int n = a.length;

        int max_ending_here = 0;

        int max_so_far = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max_ending_here += a[i];
            if (max_ending_here > max_so_far) {
                max_so_far = max_ending_here;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }

        return max_so_far;
    }

    public int maxSubArraySumMethod2(int a[]) {

        int n = a.length;

        int max_ending_here = 0;

        int max_so_far = 0;

        for (int i = 0; i < n; i++) {

            max_ending_here += a[i];

            if (max_ending_here < 0) {
                max_ending_here = 0;
            } else {
                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                }
            }
        }

        return max_so_far;
    }

    public int maxSubArraySumMethod3(int a[]) {

        int n = a.length;

        int max_ending_here = a[0];

        int max_so_far = a[0];

        for (int i = 1; i < n; i++) {

            max_ending_here = Math.max(max_ending_here + a[i], a[i]);
            max_so_far = Math.max(max_ending_here, max_so_far);

        }

        return max_so_far;
    }

    public int[] maxSubArraySumMethod4(int a[]) {

        int n = a.length;

        int max_ending_here = 0;

        int max_so_far = Integer.MIN_VALUE;

        int start = 0, end = 0, s = 0;

        int []result = new int[3];

        for(int i = 0;i < n;i++){
            max_ending_here += a[i];

            if(max_ending_here > max_so_far){
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if(max_ending_here < 0){
                max_ending_here = 0;
                s = i + 1;
            }
        }

        result[0] = start;
        result[1] = end;
        result[2] = max_so_far;

        return result;
    }
}
