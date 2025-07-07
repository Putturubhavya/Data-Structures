class main {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    main() {
        this.size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            node.prev = node;
        } else {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        }
        size++;
    }

    public void insertEnd(int val) {
        if (head == null) {
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        node.prev = tail;
        node.next = head;
        tail.next = node;
        head.prev = node;
        tail = node;
        size++;
    }

    public void insertAtPos(int val, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertEnd(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        head.prev = tail;
        tail.next = head;
        size--;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        size--;
    }

    public void deleteAtPos(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deletelast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }

    public int getsize() {
        return size;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node node = head;
        do {
            System.out.print(node.val + "->");
            node = node.next;
        } while (node != head);
        System.out.println("Head");
    }

    public class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;

        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

public class CircularDLL {
    public static void main(String[] args) {
        main list = new main();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(5);
        list.display();
        list.insertEnd(6);
        list.display();
        list.insertAtPos(7, 3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deletelast();
        list.display();
        list.deleteAtPos(3);
        list.display();
        System.out.println(list.getsize());
    }

}
