package practice.gfg.linkedlist;

public class ReverseLinkedListInGroup {

    public int[] reverseLinkedListInGroup(int []array, int K){

        Node root = new Node(array[0]);

        int n = array.length;

        for(int i=1;i < n;i++){
            root = root.insert(root, array[i]);

        }

        root = reverseLinkedListInGroup(root, K);

        Node current = root;

        int count = 0;

        while(current != null){
            array[count++] = current.value;
            current = current.next;
        }

        return array;

    }

    public Node reverseLinkedListInGroup(Node root, int K){

        Node current = root;
        Node next = null;
        Node prev = null;

        int count = 0;

        while (count < K && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if(next != null){
            root.next = reverseLinkedListInGroup(next, K);
        }

        return prev;
    }
}
