package DSA;
public class Queue_Array {
    static class queue { // inner class is faster and eassy to accessesible . create here and destroy
        // here.
        int n;
        int[] arr;
        int front, rear; // it keeps the trak of starting and ending index;

        queue(int size) { // parametarized constructor
            this.n = size;
            this.arr = new int[size];
            this.front = -1; // array is empty , it point the starting index;
            this.rear = -1; // array is empty , it points the last index;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == (n - 1);
        }

        public void add(int data) { // in technical term this add operation called enqueue operation
            if (isFull()) {
                System.out.println("soory Array is full");
                return;
            }
            // rear++;
            // arr[rear] = data; or
            arr[++rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("sorry Array is empty");
            }
            int x = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            arr[rear] = 0;
            rear--;
            return x;
        }
    }

    public static void main(String[] args) {
        queue newqueue = new queue(5);
        newqueue.add(1);
        newqueue.add(2);
        newqueue.add(3);
        newqueue.add(4);
        newqueue.add(5);
        System.out.println(newqueue.isEmpty());
        System.out.println(newqueue.remove());
        while (!newqueue.isEmpty()) {
            System.out.println(newqueue.remove());

        }
    }

}
