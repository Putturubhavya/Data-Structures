public class SublistSearch {// O(m*n) using linkedlist
    public static class Node {
        int data;
        Node next;
    }

    public static Node newNode(int key) {
        Node val = new Node();
        val.data = key;
        val.next = null;
        return val;
    }

    public static boolean sublist_search(Node list_ptr, Node sub_ptr) {
        Node p1 = list_ptr, p2 = sub_ptr;
        if (list_ptr == null && sub_ptr == null)
            return true;
        if (sub_ptr == null || (sub_ptr != null && list_ptr == null))
            return false;
        while (p1 != null) {
            p1 = list_ptr;
            while (p2 != null) {
                if (p1 == null)
                    return false;
                else if (p1.data == p2.data) {
                    p1 = p1.next;
                    p2 = p2.next;
                } else {
                    break;
                }
            }
            if (p2 == null) {
                return true;
            }
            p2 = sub_ptr;
            list_ptr = list_ptr.next;
        }
        return false;

    }

    public static void main(String[] args) {
        Node list = newNode(2);
        list.next = newNode(5);
        list.next.next = newNode(3);
        list.next.next.next = newNode(3);
        list.next.next.next.next = newNode(6);
        list.next.next.next.next.next = newNode(7);
        list.next.next.next.next.next.next = newNode(0);
        Node sub_list = newNode(3);
        sub_list.next = newNode(6);
        sub_list.next.next = newNode(7);
        boolean res = sublist_search(list, sub_list);
        if (res) {
            System.out.print("Is the sublist present in the list? " + res);
        }
    }
}
