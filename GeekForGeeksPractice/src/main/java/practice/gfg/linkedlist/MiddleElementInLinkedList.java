package practice.gfg.linkedlist;

public class MiddleElementInLinkedList {

    public int middleElementInLinkedList(int []array){

        Node root = new Node(array[0]);

        int n = array.length;

        if(n == 0){
            return 0;
        }

        for(int i = 1;i < n;i++){
            root = root.insert(root, array[i]);
        }

        Node slow = root;

        Node fast = root;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.value;

    }

}


