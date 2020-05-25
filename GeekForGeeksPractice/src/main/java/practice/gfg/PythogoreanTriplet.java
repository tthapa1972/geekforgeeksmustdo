package practice.gfg;

import java.util.Arrays;

public class PythogoreanTriplet {

    /*
    Time complexity of this method is O(n2).
    * */

    public boolean isPythogoreanTriplet(int []array){

        int n = array.length;

        for(int i = 0;i < n;i++){
            array[i] = array[i] * array[i];
        }

        Arrays.sort(array);

        for(int i = (n - 1);i >= 2;i--){

            int left = 0;
            int right = i - 1;

            while(left < right){
                if(array[left] + array[right] == array[i]){
                    return true;
                }else if(array[left] + array[right] < array[i]){
                    left++;
                }else {
                    right--;
                }
            }
        }

        return false;

    }


}
