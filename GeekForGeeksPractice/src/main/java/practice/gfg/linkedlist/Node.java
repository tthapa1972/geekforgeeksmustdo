package practice.gfg.linkedlist;

public class Node {

    int  value;
    Node next;

    public Node(){
    }

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public Node insert(Node root, int ele){

        if(root == null){
            root = new Node(ele);
            return root;
        }

        Node temp = root;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(ele);

        return root;

    }

    public Node constructLinkedList(int []array, Node root){

        root = new Node(array[0]);

        int n = array.length;

        for(int i = 1;i < n;i++){
            root = insert(root, array[i]);
        }

        return root;
    }

}
