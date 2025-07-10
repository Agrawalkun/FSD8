package DSA;
class Node{
    int data;
    Node right, left;
    public Node(int key){
        data = key;
        right = left = null;
    }
}
public class inorder_traversal {
    Node root;
    inorder_traversal(){
        root = null;

    }
    void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.println(node.data+" ");
        inorder(node.right);
    }
    public static void main(String[] args) {
       inorder_traversal tree = new inorder_traversal (); 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println("inorder tree traversal is:");
        tree.inorder(root);
    }
}
