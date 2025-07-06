
class main {
    private Node head;
    private Node tail;
    private int size;

    public main() {
        this.size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public void insertlast(int val) {
        if (tail == null) {
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
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
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;

    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();

        }
        Node secondlast = get(size - 2);
        int val = tail.val;
        tail = secondlast;
        tail.next = null;
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
        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return val;

    }

    public int find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node.val;
            }
            node = node.next;
        }
        return -1;
    }

    public int getsize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getHead() {
        return head.val;
    }

    public int getTail() {
        return tail.val;
    }

    public Node sort() {
        Node current = head;
        Node index = null;
        int temp;
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.val > index.val) {
                    temp = current.val;
                    current.val = index.val;
                    index.val = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
        return current;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;

        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    public Node reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        main list = new main();
        list.insertlast(3);
        list.insertlast(6);
        list.insertlast(7);
        list.insertlast(5);
        list.insertlast(2);
        list.insertlast(4);

        // list.insertAtPos(100, 3);
        list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.deleteAtPos(2));

        // list.display();
        // System.out.println(list.find(99));
        // System.out.println(list.getsize());
        // System.out.println(list.isEmpty());
        // System.out.println(list.getHead());
        // System.out.println(list.get(2));
        // System.out.println(list.getTail());
        list.sort();
        list.display();
        list.reverse();
        list.display();

    }
}
