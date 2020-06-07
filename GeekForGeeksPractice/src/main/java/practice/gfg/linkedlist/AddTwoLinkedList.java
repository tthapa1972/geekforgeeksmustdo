package practice.gfg.linkedlist;

public class AddTwoLinkedList {

    public int[] addTwoLists(int []list1, int []list2){

        Node  root1 = new Node(list1[0]);

        Node root2 = new Node(list2[0]);

        int n1 = list1.length;

        int n2 = list2.length;

        for(int i = 1;i < n1;i++){
            root1 = root1.insert(root1, list1[i]);
        }

        for(int i = 1;i < n2;i++){
            root2 = root2.insert(root2, list2[i]);
        }

        Node result =  addTwoLists(root1, root2);

        int []res = new int[getLengthOfList(result)];

        int count = 0;

        while (result != null){
            res[count++] = result.value;
            result = result.next;
        }

        return res;
    }

    public int getLengthOfList(Node node){

        Node temp = node;

        int count = 0;

        while (temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public Node addTwoLists(Node list1, Node list2){

        Node result = null;
        Node prev = null;
        Node temp = null;

        int sum = 0;
        int carry = 0;

        while (list1 != null || list2 != null){

            sum = carry + (list1 != null ? list1.value : 0) + (list2 != null ? list2.value : 0);

            carry = (sum >= 10) ? 1 : 0;

            sum = sum % 10;

            temp = new Node(sum);

            if(result == null){
                result = temp;
            }else{
                prev.next = temp;
            }

            prev = temp;

            if(list1 != null){
                list1 = list1.next;
            }

            if(list2 != null){
                list2 = list2.next;
            }

        }

        if(carry > 0){
            temp.next = new Node(carry);
        }

        return result;
    }

}
