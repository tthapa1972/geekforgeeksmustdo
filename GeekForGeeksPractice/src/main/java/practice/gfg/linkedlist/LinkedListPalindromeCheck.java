package practice.gfg.linkedlist;

public class LinkedListPalindromeCheck {


    public boolean isPalindrome(int []list){

        Node root = new Node(list[0]);

        int n = list.length;

        for(int i = 1;i < n;i++){
            root.insert(root, list[i]);
        }

        return isPalindrome(root);


    }

    public boolean isPalindrome(Node root){

        Node fast = root;
        Node slow = root;

        Node second_half = null;

        Node midNode = null;
        Node prev_of_slow = root;

        boolean res = true;

        if(root != null && root.next != null){

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                prev_of_slow = slow;
                slow = slow.next;
            }

            if(fast != null){
                midNode = slow;
                slow = slow.next;
            }

            second_half = slow;
            prev_of_slow.next = null;
            second_half = reverse(second_half);

            res = compareLists(root, second_half);

            second_half = reverse(second_half);

            if(midNode != null){
                prev_of_slow.next = midNode;
                midNode.next = second_half;
            }else {
                prev_of_slow.next = second_half;
            }

        }

        return res;
    }

    public boolean compareLists(Node list1, Node list2){

        Node temp1 = list1;
        Node temp2 = list2;

        while(temp1 != null && temp2 != null){
            if(temp1.value == temp2.value){
                temp1 = temp1.next;
                temp2 = temp2.next;
            }else {
                return false;
            }
        }

        if(temp1 == null && temp2==null){
            return true;
        }

        return false;
    }

    public Node reverse(Node slow){

        Node current = slow;
        Node prev = null;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}
