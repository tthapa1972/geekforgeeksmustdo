package practice.gfg.array;

public class ArrayZigZagFashion {

    public int [] zigzagFashion(int []array){

        int n = array.length;

        boolean flag = true;

        for(int i = 0;i <= n-2;i++){

            if(flag){
                if(array[i+1] < array[i]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            } else{
                if(array[i+1] > array[i]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }

            flag = !flag;
        }

        return array;
    }
}
