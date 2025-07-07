class main {
    private Node head;
    private int size;

    public main() {
        this.size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;

    }

    public void insertlast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;

        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insertAtPos(int val, int index) {
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        Node last = head;
        int val = last.val;
        while (last.next != null) {
            last = last.next;
        }
        last.prev.next = null;
        size--;
        return val;
    }

    public int deleteAtPos(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
        return val;
    }

    public int getsize() {
        return size;
    }

    public void display() {
        Node node = head;
        Node last = null;
        for (int i = 0; i < size; i++) {// while(node!=null){
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        while (last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("Start");
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

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

public class DoubleLL {
    public static void main(String[] args) {
        main list = new main();
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertfirst(30);
        list.insertfirst(40);
        list.insertlast(99);
        list.insertAtPos(50, 5);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAtPos(2);
        list.display();
        System.out.println(list.getsize());

    }

}
