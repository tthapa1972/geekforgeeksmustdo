package practice.gfg.array;

public class ReverseArrayInGroup {

    public int[] sortInGroup(int []array, int K){

        int n = array.length;

        for(int i = 0;i < n;i+=K){

            int left = i;

            int right = Math.min(i+K-1, n - 1);
            int temp;

            while(left < right){
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        return array;
    }
}
