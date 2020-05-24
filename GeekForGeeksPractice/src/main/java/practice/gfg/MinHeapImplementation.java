package practice.gfg;

public class MinHeapImplementation {

    int []heap;
    int size;
    int maxSize;

    private static final int FRONT = 1;

    public MinHeapImplementation(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[maxSize];
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

        if(isLeaf(pos)){
            return;
        }

        if((heap[pos] > heap[left(pos)]) || (heap[pos] > heap[right(pos)])){

            if(heap[right(pos)] > heap[left(pos)]){
                swap(pos, left(pos));
                minHeapify(left(pos));
            }else{
                swap(pos, right(pos));
                minHeapify(right(pos));
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

    public void minHeap(){

        for(int i = (size/2);i >= 0;i--){
            minHeapify(i);
        }
    }

    public int remove(){
        int eleRemove = heap[FRONT];
        heap[FRONT] = size--;
        minHeapify(FRONT);
        return eleRemove;
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heap[i]
                    + " LEFT CHILD : " + heap[left(i)]
                    + " RIGHT CHILD :" + heap[right(i)]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("The Min Heap is ");
        MinHeapImplementation minHeap = new MinHeapImplementation(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.minHeap();

        minHeap.print();
        System.out.println("The Min val is " + minHeap.remove());
    }

}
