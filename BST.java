class Node {
    int data;
    Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;

    }
}

public class BST {
    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data == data) {
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;

    }

    static boolean search(Node node, int val) {
        while (node != null) {
            if (val < node.data) {
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                return true;
            }
        }
        return false;

    }

    static void printInorder(Node root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    static

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);
        printInorder(root);
        int ele = 100;
        System.out.println("\nElement to be searched: " + ele);
        System.out.println("Element found: " + BST.search(root, ele));

    }

}
