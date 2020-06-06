package practice.gfg.linkedlist;

public class DetectLoopInLinkedList {

    public boolean detectLoop(int []array){

        Node root = new Node(array[0]);

        int n = array.length;

        for(int i = 1;i < n;i++){
            root = root.insert(root, array[i]);
        }

        Node slow = root;
        Node fast = root;

        while (slow != null && fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(fast.value == slow.value){
                return true;
            }
        }

        return false;
    }

    public void detectAndBreakLoop(int []array){

        Node root = new Node(array[0]);

        int n = array.length;

        for(int i = 1;i < n;i++){
            root = root.insert(root, array[i]);
        }

        Node slow = root;
        Node fast = root;

        while(slow != null && fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }

        }


        if(slow == fast) {
            slow = root;

            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }

            fast.next = null;
        }
    }
}
