public class Deque {// double ended queue
    public static void main(String[] args) {
        main m = new main();
        m.push_back(2);
        m.push_back(6);
        m.push_back(7);
        m.push_back(9);
        m.push_back(8);
        m.display();
        m.pop_front();
        m.pop_back();
        m.display();
        System.out.println(m.peek_front());
        System.out.println(m.peek_back());

    }

}

class main {
    static final int Max = 5;
    static int arr[] = new int[Max];
    static int front = -1, rear = -1;

    static boolean isfull() {
        return ((front == 0 && rear == Max - 1) || front == rear + 1);

    }

    static boolean isempty() {
        if (front == -1)
            return true;
        return false;
    }

    static void push_front(int data) {// O(1)
        if (isfull()) {
            System.out.println("full");
        }
        if (isempty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + Max) % Max;
        }
        arr[front] = data;
        System.out.println("Inserted -> " + data);
    }

    static void push_back(int data) {// O(1)
        if (isfull()) {
            System.out.println("full");
        } else {
            if (front == -1)
                front = 0;
            if (rear == Max - 1)
                rear = 0;
            else {
                rear = rear + 1;
                arr[rear] = data;
                System.out.println("Inserted -> " + data);
            }
        }

    }

    public void pop_front() {// O(1)
        if (isempty()) {
            System.out.println("empty");
        } else {
            // System.out.println(arr[front]);
            if (front == rear)
                front = rear = -1;
            else
                front = (front + 1) % Max;
        }

    }

    public void pop_back() {// O(1)
        if (isempty()) {
            System.out.println("empty");
        } else {
            if (front == rear)
                front = rear = -1;
            else if (rear == 0)
                rear = Max - 1;
            else
                rear = rear - 1;
        }

    }

    static int peek_front() {// O(1)
        if (isempty()) {
            System.out.println("Deque is empty");
            return -1;
        } else {
            return arr[front];
        }
    }

    static int peek_back() {// O(1)
        if (isempty()) {
            System.out.println("Deque is empty");
            return -1;
        } else {
            return arr[rear];
        }
    }

    public void display() {
        if (isempty()) {
            System.out.println("empty");
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % Max;

        }
        System.out.println();
    }

}
