package practice.gfg.linkedlist;

public class RotateLinkedListByK {

    public int[] rotateLinkedListByK(int []array, int K){

        Node root = new Node();

        root = root.constructLinkedList(array, root);

        Node pointer = root;

        Node end = root;

        int n = array.length;

        if(n < K){
            return null;
        }

        for(int i = 1;i < K;i++){
            pointer = pointer.next;
        }

        while (end.next != null){
            end = end.next;
        }

        end.next = root;

        root = pointer.next;

        pointer.next = null;

        Node temp = root;

        int count = 0;

        while (temp != null){
            array[count++] = temp.value;
            temp = temp.next;
        }

        return array;

    }
}
