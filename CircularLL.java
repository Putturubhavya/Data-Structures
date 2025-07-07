class main {
    private Node head = null;
    private Node tail = null;

    public void insertfirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;

    }

    public void insertEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;

        }
        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void insertAtPos(int val, int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;

    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.val == val) {
            head = head.next;
            tail.next = head;
        }
        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;

        } while (node != head);
    }

    public void deleteFirst() {
        head = head.next;
        tail.next = head;

    }

    public void deleteEnd() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;

    }

    public void deleteAtPos(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    public int size() {
        Node node = head;
        int count = 0;
        if (node != null) {
            do {
                count++;
                node = node.next;
            } while (node != head);
        }
        return count;
    }

    public void display() {
        Node node = head;
        if (node != null) {
            do {
                System.out.print(node.val + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.println("Head");

    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean find(int val) {
        Node node = head;
        if (node != null) {
            do {
                if (node.val == val) {
                    return true;
                }
                node = node.next;
            } while (node != head);
        }
        return false;
    }

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

public class CircularLL {
    public static void main(String[] args) {
        main list = new main();
        list.insertfirst(22);
        list.insertfirst(32);
        list.insertfirst(42);
        list.insertEnd(52);
        list.insertAtPos(62, 2);

        list.display();
        list.delete(42);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteEnd();
        list.display();
        list.deleteAtPos(1);
        list.display();
        System.out.println(list.find(62));
        System.out.println(list.isEmpty());
        System.out.println(list.size());

    }

}
