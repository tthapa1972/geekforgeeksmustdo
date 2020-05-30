package practice.gfg.array;

public class CeilWithBinarySearch {

    public static int findCeil(int []array, int low, int high, int x){

        if(array[low] >= x){
            return low;
        }

        if(array[high] < x){
            return -1;
        }

        int mid = (low + high) / 2;

        if(array[mid] == x){
            return x;
        } else if(array[mid] < x){
            if(mid + 1 <= high && array[mid + 1] >= x){
                return mid + 1;
            }else {
                return findCeil(array, mid + 1, high, x);
            }
        } else{
            if(mid - 1 >= low && array[mid - 1] < x){
                return mid;
            }else{
                return findCeil(array, low, mid - 1, x);
            }
        }
    }
}
