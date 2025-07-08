class main {
    int Size;
    int front;
    int rear;
    int arr[];

    main(int size) {
        Size = size;
        front = -1;
        rear = -1;
        arr = new int[Size];
    }

    boolean isfull() {
        if (front == 0 && rear == Size - 1) {
            return true;

        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    boolean isempty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int data) {
        if (isfull()) {
            System.out.println("Queue is full");
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % Size;
        arr[rear] = data;
        // System.out.print(data + " ");

    }

    public int dequeue() {
        int data;
        if (isempty()) {
            return -1;
        } else {
            data = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;

            } else {
                front++;
            }
            System.out.println(data + " ");
            return data;
        }
    }

    public void display() {
        if (isempty()) {
            return;
        } else {
            // System.out.println("Front " + front);
            System.out.println("Rear " + rear);
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            // System.out.println("Rear " + rear);
        }
    }

}

public class CircularQueue {
    public static void main(String[] args) {
        main n = new main(5); // create queue of size 5

        n.enqueue(2); // insert elements
        n.enqueue(3);
        n.enqueue(4);
        n.enqueue(5);
        n.enqueue(6);
        // rear = 4 now, full
        n.display(); // Output: 2 3 4 5 6

        n.dequeue(); // removes 2 → front = 1
        n.dequeue(); // removes 3 → front = 2
        n.display(); // Output: 4 5 6

        n.enqueue(7); // rear = (4+1)%5 = 0 → wraps around
        n.display(); // Output: 4 5 6 7
    }

}
