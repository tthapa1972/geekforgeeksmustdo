package practice.gfg.array;

public class KthSmallestElement {

    /*
    Time complexity of this solution is O(n + kLogn).
    * */

    public int findKthSmallestElement(int []array,int K) {

        int n = array.length;

        MinHeap minHeap = new MinHeap(n);

        for(int i = 0;i < n;i++){
            minHeap.insert(array[i]);
        }

        minHeap.minHeap();

        for(int i = 1;i < K;i++){
            minHeap.remove();
        }

        return minHeap.remove();
    }

}

class MinHeap{
    int []heap;
    int size;
    int maxSize;

    private static final int FRONT = 1;

    public MinHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[maxSize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    public int parent(int pos){
        return (pos / 2);
    }

    public int left(int pos){
        return (2 * pos);
    }

    public int right(int pos){
        return (2 * pos + 1);
    }

    public boolean isLeaf(int pos){

        if(pos >= (size/2) && pos <= size){
            return true;
        }

        return false;
    }

    public void swap(int left, int right){

        int temp = heap[left];
        heap[left] = heap[right];
        heap[right] = temp;
    }

    public void minHeapify(int pos){

        if(!isLeaf(pos)){
            if (heap[pos] > heap[left(pos)] || heap[pos] > heap[right(pos)]){

                if(heap[left(pos)] < heap[right(pos)]){
                    swap(pos, left(pos));
                    minHeapify(left(pos));
                }else{
                    swap(pos, right(pos));
                    minHeapify(right(pos));
                }
            }
        }

    }

    public void insert(int ele){

        if(size >= maxSize){
            return;
        }

        heap[++size] = ele;

        int current = size;

        while(heap[current] < heap[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int remove(){
        int popped = heap[FRONT];
        heap[FRONT] = heap[size--];
        minHeapify(FRONT);
        return popped;
    }

    public void minHeap(){
        for(int i=(size/2);i>=1;i--){
            minHeapify(i);
        }
    }
}
