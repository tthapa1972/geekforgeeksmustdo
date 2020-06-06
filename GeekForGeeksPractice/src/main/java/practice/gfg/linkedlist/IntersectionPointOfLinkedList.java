package practice.gfg.linkedlist;

public class IntersectionPointOfLinkedList {

    public int intersectionPointOfLinkedList(int[] list1, int[] list2) {

        Node root1 = new Node(list1[0]);

        Node root2 = new Node(list2[0]);

        int n1 = list1.length;

        int n2 = list2.length;

        for(int i = 1;i < n1;i++){
            root1 = root1.insert(root1, list1[i]);
        }

        for(int i = 1;i < n2;i++){
            root2 = root2.insert(root2, list2[i]);
        }

        return intersectionPointOfLinkedList(root1, root2);

    }

    public int intersectionPointOfLinkedList(Node root1, Node root2) {

        int c1 = lengthOfLinkedList(root1);

        int c2 = lengthOfLinkedList(root2);

        if (c1 > c2) {
            return intersectionPointOfLinkedList(root1, root2, c1, c2);
        }else {
            return intersectionPointOfLinkedList(root2, root1, c2, c1);
        }

    }

    public int intersectionPointOfLinkedList(Node root1, Node root2, int c1, int c2) {

        int diff = c1 - c2;

        Node temp = root1;

        for (int i = 0; i < diff; i++) {
            temp = temp.next;
        }

        while (temp != null && root2 != null) {
            if (temp.value == root2.value) {
                return temp.value;
            }

            temp = temp.next;
            root2 = root2.next;
        }

        return -1;
    }

    public int lengthOfLinkedList(Node root) {

        int length = 0;

        Node temp = root;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        return length;
    }
}
