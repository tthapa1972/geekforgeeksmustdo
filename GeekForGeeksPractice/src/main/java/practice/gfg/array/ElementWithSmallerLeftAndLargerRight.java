package practice.gfg.array;

public class ElementWithSmallerLeftAndLargerRight {

    /*
    Time Complexity: O(n)
Auxiliary Space: O(n)
    * */

    public int findElement(int []array){

        int n = array.length;

        int []leftMax = new int[n];

        leftMax[0] = Integer.MIN_VALUE;

        for(int i = 1;i < n;i++){
            leftMax[i] = Math.max(leftMax[i-1], array[i-1]);
        }

        int rightMin = Integer.MAX_VALUE;

        for(int i = n-1;i >= 0;i--){
            if(leftMax[i] < array[i] && rightMin > array[i]){
                return i;
            }

            rightMin = Math.min(array[i], rightMin);
        }

        return -1;
    }
}
