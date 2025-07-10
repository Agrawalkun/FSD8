package DSA;
public class LL1 {
    static int size = 0;
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data) { // parameterized constructor
            this.data = data;
            this.next = null;
            size++;
        }
    }

    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // phle links jodo fir todo
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
    }

    public void add(int data, int position) { // head = position 0
        Node newNode = new Node(data);
        if (position == 0) {
            addFirst(data);
            return;
        }
        if (position == size) {
            addLast(data);
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " " + "->" + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
            head = head.next;
        }
        Node temp = head;
        while (temp.next.next != null) {
        temp = temp.next;
        }
        temp.next = null;
    }
    public void remove( int position){
        if (position == 0) {
            removeFirst();
            return;
        }
        if (position == size-1) {
            removeLast();
            return;
        }
        if(position == size){
            System.out.println(" position is not found");
            return;
        }
        // if(head == null){
        //     System.out.println("list is empty");
        //     return;
        // }
        // if(head.next == null){
        //     head = head.next;
        // }
        int i = 0;
        Node temp = head;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        Node x = temp.next;
        temp.next = temp.next.next;
        x.next = null;
    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst(1); // first element will shift to last position on adding more elements
        list.addLast(2);
        list.addLast(3);
        // list.addLast(0);
        list.add(4, 1);
        list.print(); // 1 -> 4 -> 2 -> 3 -> null
        // list.removeFirst();
        // list.print(); // 4 -> 2 -> 3 -> null
        // list.removeLast();
        // list.print(); //4 -> 2 -> null
        list.remove(4);
        // list.print();
        list.remove(2);
        list.print();
    }
}