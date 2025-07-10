package DSA;
// preorder traversal
// import java.util.Scanner;
// creating a node class
class Node{
int data;
Node left;
Node right;
public Node( int key){
    data = key;
    left = right = null;
}

}
public class trees {
    Node root;
    trees(){
        root = null;
    }
    // function to print preorder traversal
    void preorder( Node node) {
        if(node == null) return;
        // deal with the node
        System.out.println(node.data+" ");
        // recursion on left sub tree
        preorder(node.left);
          // recursion on right sub tree
        preorder(node.right);

    }
    public static void main(String[] args) {   
        trees tree = new trees();  
        // constructing a binary tree
        tree.root = new Node(1);                                                                                        
        // Node root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        // System.out.println(root);
        // function call
        System.out.println("preorder traversal of binary tree is:");
        tree.preorder(tree.root);

    }
}
