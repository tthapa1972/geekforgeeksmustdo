package practice.gfg;

/*
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Constraints:
1 <= T <= 100
3 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
2
4
1 5 3 2
3
3 2 7
Output:
2
-1

Explanation:
Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
* */

public class CountTheTriplets {

    public int countWays(int[] arr, int n) {

        int maxValue = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (maxValue < ele) {
                maxValue = ele;
            }
        }

        int freq[] = new int[maxValue + 1];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int count = 0;

        //case 1: all three are zero
        count += freq[0] * (freq[0] - 1) * (freq[0] - 2) / 6;

        //case 2: 2 are x and one is 0
        for (int i = 1; i <= maxValue; i++) {
            count += freq[0] * freq[i] * (freq[i] - 1) / 2;
        }

        //case 3: 2 are x and one is 2 * x
        for (int i = 1; 2 * i <= maxValue; i++) {
            count += freq[i] * (freq[i] - 1) / 2 * freq[2 * i];
        }

        //case 3: one is x , another is y and third one  is x + y
        for (int i = 1; i <= maxValue; i++) {
            for(int j = (i + 1);(i + j) <= maxValue;j++) {
                count += (freq[i] * freq[j] * freq[i + j]);
            }
        }

        return count <= 0? -1 : count;
    }
}
