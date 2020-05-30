package practice.gfg.array;

public class TrappingRainWater {

    /*
    Complexity Analysis:
Time Complexity: O(n2).
There are two nested loops traversing the array, So time Complexity is O(n2).
Space Complexity: O(1).
No extra space required.
    * */

    public int maxWater(int []array){

        int n = array.length;

        int result = 0;

        for (int i = 1;i < n;i++){

            int leftMax = array[i];

            for(int j = 0;j < i;j++){
                leftMax = Math.max(leftMax, array[j]);
            }

            int rightMax = array[i];

            for(int j = (i+1);j < n;j++)
            {
                rightMax = Math.max(rightMax, array[j]);
            }

            result += (Math.min(leftMax, rightMax) - array[i]);
        }

        return result;
    }

    /*
    Complexity Analysis:
Time Complexity: O(n).
Only one traversal of the array is needed, So time Complexity is O(n).
Space Complexity: O(n).
Two extra array is needed each of size n.
    * */

    public int maxWater1(int [] array){

        int n = array.length;

        int []left = new int[n];

        int []right = new int[n];

        int result = 0;

        left[0] = array[0];

        for(int i = 1;i < n;i++){
            left[i] = Math.max(array[i], left[i-1]);
        }

        right[n-1] = array[n-1];

        for(int i = (n-2);i >= 0;i--){
            right[i] = Math.max(array[i], right[i+1]);
        }

        for(int i = 0;i < n;i++){
            result += (Math.min(left[i], right[i]) - array[i]);
        }

        return result;
    }

    /*
    Complexity Analysis:
Time Complexity: O(n).
Only one traversal of the array is needed.
Auxiliary Space: O(1).
    * */

    public int maxWater2(int [] array){

        int n = array.length;

        int lo = 0;

        int ro = n - 1;

        int result = 0;

        int leftMax = 0;

        int rightMax = 0;

        while (lo <= ro){

            if(array[lo] < array[ro]){

                if(array[lo] > leftMax){
                    leftMax = array[lo];
                }else{

                    result += (leftMax - array[lo]);
                    lo++;
                }

            }else {

                if(array[ro] > rightMax){
                    rightMax = array[ro];
                }else{
                    result += (rightMax - array[ro]);
                    ro--;
                }
            }

        }

        return result;
    }

}
