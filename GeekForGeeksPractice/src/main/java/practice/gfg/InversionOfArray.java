package practice.gfg;

import java.util.Arrays;

public class InversionOfArray {

    /*
    Complexity Analysis:
Time Complexity: O(n^2), Two nested loops are needed to traverse the array from start to end so the Time complexity is O(n^2)
Space Compelxity:O(1), No extra space is required.
    * */

    public int noOfInversion(int []array, int n){

        int noOfInversion = 0;

        for(int i = 0;i < (n-1);i++){
            for(int j = (i+1);j < n;j++){
                if(array[i] > array[j]){
                    noOfInversion++;
                }
            }
        }

        return noOfInversion;
    }


    /*
    Complexity Analysis:
Time Complexity: O(n log n), The algorithm used is divide and conquer, So in each level one full array traversal is needed and there are log n levels so the time complexity is O(n log n).
Space Compelxity:O(1), No extra space is required.
    * */

    public int noOfInversion1(int []array, int n){

        return(mergeSortAndCount(array, 0, array.length - 1));

    }

    public int mergeSortAndCount(int []array, int l, int r){
        int count = 0;

        if(l < r){
            int mid = (l + r)/2;

            count += mergeSortAndCount(array, l, mid);

            count += mergeSortAndCount(array, mid + 1, r);

            count += mergeAndCount(array, l, mid, r);
        }

        return count;
    }

    public int mergeAndCount(int []array, int l, int m, int r){

        int []X = Arrays.copyOfRange(array, l, m+1);

        int []Y = Arrays.copyOfRange(array, m+1, r+1);

        int k = l;

        int i = 0;

        int j = 0;

        int swap = 0;

        while(i < X.length && j < Y.length){
            if(X[i] <= Y[j]){
                array[k++] = X[i++];
            }else {
                array[k++] = Y[j++];
                swap += (m+1) - (l + i);
            }
        }

        while (i < X.length){
            array[k++] = X[i++];
        }

        while (j < Y.length){
            array[k++] = Y[j++];
        }

        return swap;
    }

    /*
    Complexity Analysis:

Time Complexity: O(n Log n).
Insertion in an AVL insert takes O(log n) time and n elements are inserted in the tree so time complexity is O(n log n).
Space Complexity: O(n).
To create a AVL tree with max n nodes O(n) extra space is required.
    * */

    public int noOfInversion2(int []array, int n){
        Node root = null;

        Result result = new Result(0);

        for(int i = 0;i < n;i++){
            root = insert(root, array[i], result);
        }

        return result.result;
    }

    public int size(Node node){
        if(node == null){
            return 0;
        }

        return node.size;
    }

    public int height(Node node){
        if(node == null){
            return 0;
        }

        return node.height;
    }

    public int findBalance(Node node){
        if(node == null){
            return 0;
        }

        return (height(node.left) - height(node.right));
    }

    public Node rightRotate(Node node){
        Node x = node.left;
        Node T2 = x.right;

        x.right = node;
        node.left = T2;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        node.size = size(node.left) + size(node.right) + 1;
        x.size = size(x.left) + size(x.right) + 1;

        return x;
    }

    public Node leftRotate(Node node){
        Node y = node.right;
        Node T2 = y.left;

        y.left = node;
        node.right = T2;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        node.size = size(node.left) + size(node.right) + 1;
        y.size = size(y.left) + size(y.right) + 1;

        return y;
    }

    public Node insert(Node node, int ele, Result result){

        if(node == null){
            node = new Node(ele);
        }else if(ele < node.key){
            node.left = insert(node.left, ele, result);
            result.result = result.result + size(node.right) + 1;
        }else if(ele > node.key){
            node.right = insert(node.right, ele, result);
        }else{
            return node;
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        node.size = size(node.left) + size(node.right) + 1;

        int balance = findBalance(node);

        if(balance > 1 && ele < node.left.key){
            return rightRotate(node);
        }

        if(balance < -1 && ele > node.right.key){
            return leftRotate(node);
        }

        if(balance > 1 && ele > node.left.key){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if(balance < -1 && ele < node.right.key){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

}


class Result{
    int result;

    public Result(int result){
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}