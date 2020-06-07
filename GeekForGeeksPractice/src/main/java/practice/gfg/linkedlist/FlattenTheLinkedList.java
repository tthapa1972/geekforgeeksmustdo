package practice.gfg.linkedlist;

public class FlattenTheLinkedList {

    static class Node{
        int key;
        Node right, down;

        public Node(){

        }

        public Node(int key){
            this.key = key;
            this.down = this.right = null;
        }
    }



    public Node insert(Node head, int ele){

        Node new_Node = new Node(ele);

        new_Node.down = head;

        head = new_Node;

        return head;
    }

    public Node merge(Node a, Node b){

        if(a == null){
            return b;
        }

        if(b == null){
            return a;
        }

        Node result;

        if(a.key < b.key){
            result = a;
            result.down = merge(a.down, b);
        }else {
            result = b;
            result.down = merge(a, b.down);
        }

        result.right = null;

        return result;
    }

    public Node flatten(Node head){

        if(head == null || head.right == null){
            return head;
        }

        head.right = flatten(head.right);

        head = merge(head, head.right);

        return head;

    }

    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.key + " ");
            temp = temp.down;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        FlattenTheLinkedList L = new FlattenTheLinkedList();

        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        Node head = new Node(30);

        head = L.insert(head, 8);
        head = L.insert(head, 7);
        head = L.insert(head, 5);

        head.right = L.insert(head.right, 20);
        head.right = L.insert(head.right, 10);

        head.right.right = L.insert(head.right.right, 50);
        head.right.right = L.insert(head.right.right, 22);
        head.right.right = L.insert(head.right.right, 19);

        head.right.right.right = L.insert(head.right.right.right, 45);
        head.right.right.right = L.insert(head.right.right.right, 40);
        head.right.right.right = L.insert(head.right.right.right, 35);
        head.right.right.right = L.insert(head.right.right.right, 20);

        // flatten the list
        head = L.flatten(head);

        L.printList(head);
    }
}
