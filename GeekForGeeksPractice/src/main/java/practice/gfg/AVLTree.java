package practice.gfg;

public class AVLTree {

    Node root;

    public int height(Node node){

        if(node == null){
            return 0;
        }

        return node.height;
    }

    public int balanceNode(Node node){

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
        x.height = Math.max(height(node.left), height(node.right)) + 1;

        return x;
    }

    public Node leftRotate(Node node){

        Node y = node.right;
        Node T2 = y.left;

        y.left = node;
        node.right = T2;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public Node insert(Node node, int key){

        if(node == null){
            node = new Node(key);
        } else if(key < node.key){
            node.left = insert(node.left, key);
        } else if(key > node.key){
            node.right = insert(node.right, key);
        }else{
            return node;
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        int balance = balanceNode(node);

        if(balance > 1 && key < node.left.key){
            node = rightRotate(node);
            return node;
        }

        if(balance < -1 && key > node.right.key){
            node = leftRotate(node);
            return node;
        }

        if(balance > 1 && key > node.left.key){
            node.left = leftRotate(node.left);
            node = rightRotate(node);
            return node;
        }

        if(balance < -1 && key < node.right.key){
            node.right = rightRotate(node.right);
            node = leftRotate(node);
            return node;
        }

        return node;
    }

    public void printPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        /* The constructed AVL Tree would be
             30
            /  \
          20   40
         /  \     \
        10  25    50
        */
        System.out.println("Preorder traversal" +
                " of constructed tree is : ");
        tree.printPreOrder(tree.root);
    }

}

class Node{
    int key, height, size;
    Node left, right;

    public Node(int key){
        this.key = key;
        this.height = 1;
        this.size = 1;
    }
}