// import java.util.Queue;
// import java.util.LinkedList;

public class MyQueue {
    static final int MAX = 10;
    static int arr[] = new int[MAX];
    static int front = 0;
    static int rear = -1;
    static int count = 0;

    public static boolean isfull() {
        return count == MAX;

    }

    public static boolean isempty() {
        return count == 0;
    }

    public static void insert(int data) {
        if (!isfull()) {
            if (rear == MAX - 1) {
                rear = -1;
            }
            arr[++rear] = data;
            count++;
        }
    }

    public static int delete() {
        int data = arr[front++];
        if (front == MAX) {
            front = 0;
        }
        count--;
        return data;

    }

    public static int peek() {
        if (!isempty()) {
            return arr[front];
        } else {
            System.out.println("Queue is empty.");
            return -1;
        }
    }

    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // System.out.println(queue.remove()); // Output: 1
        // System.out.println(queue.peek()); // Output: 2
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(delete());
        System.out.println(delete());
        System.out.println(delete());
        System.out.println();
        insert(6);
        System.out.println(peek());
        System.out.print("\nUpdated Queue: ");
        while (!isempty()) {
            int n = delete();
            System.out.print(n + " ");
        }
        System.err.print("*");

        // System.out.println(delete());
        // System.out.println(delete());
        System.out.println(isfull());
        System.out.println(isempty());

    }

}
