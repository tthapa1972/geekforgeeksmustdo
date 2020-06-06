package practice.gfg.linkedlist;

public class ReverseLinkedList {

    public int [] reverseLinkedList(int []array){

        int n = array.length;

        Node head = new Node(array[0]);

        for(int i = 1;i < n;i++){
            head = head.insert(head, array[i]);
        }

        head = reverse(head);

        int count = 0;

        while (head != null){
            array[count++] = head.value;
            head = head.next;
        }

        return array;
    }

    public Node reverse(Node head){

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}
