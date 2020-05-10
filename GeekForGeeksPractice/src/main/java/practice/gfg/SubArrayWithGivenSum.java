package practice.gfg;

/*Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

Explanation :
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15
* */

public class SubArrayWithGivenSum {

    /*
 Complexity Analysis:
Time Complexity: O(n^2) in worst case.
Nested loop is used to traverse the array so the time complexity is O(n^2)
Space Complexity: O(1).
As constant extra space is required.
This method is good when all the array elements are positive
    * */

    public int[] findSubArrayWithGivenSumMethod1(int []array, int K){

        int i,j, current_sum = 0;

        int n = array.length;

        int []result = new int[]{0, 0};

        for(i=0;i < n;i++){
            current_sum = array[i];

            for(j = i + 1;j < n;j++){

                current_sum += array[j];

                if(current_sum == K){
                    result[0] = i;
                    result[1] = j;
                }

                if(current_sum > K){
                    break;
                }
            }
        }

        return  result;

    }

}
