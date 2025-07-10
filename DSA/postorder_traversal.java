package DSA;

class Node1{
    int data;
    Node left,right;
    public Node1(int key){
        data = key;
        left = right = null;

    }
}
public class postorder_traversal {
    Node root;
    postorder_traversal(){
        root = null;
    }
    void postorder(Node node){
        if(node ==null)return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data+" ");

    }

    public static void main(String[] args) {
        postorder_traversal tree = new postorder_traversal (); 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println("postorder tree traversal is:");
        tree.postorder(root);
    }
    
}
