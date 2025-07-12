class Node {
    int data;
    Node leftchild;
    Node rightchild;

    public Node(int val) {
        data = val;
        leftchild = rightchild = null;
    }
}

public class TreeTraversals {
    Node root = null;

    static void inorder_traversal(Node node) {
        if (node != null) {
            inorder_traversal(node.leftchild);
            System.out.print(node.data + " ");
            inorder_traversal(node.rightchild);
        }
    }

    static void pre_order_traversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            pre_order_traversal(node.leftchild);
            pre_order_traversal(node.rightchild);
        }
    }

    static void post_order_traversal(Node node) {
        if (node != null) {
            post_order_traversal(node.leftchild);
            post_order_traversal(node.rightchild);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        // Your code goes here
        TreeTraversals tree = new TreeTraversals();
        tree.root = new Node(27);
        tree.root.leftchild = new Node(12);
        tree.root.rightchild = new Node(3);
        tree.root.leftchild.leftchild = new Node(44);
        tree.root.leftchild.rightchild = new Node(17);
        tree.root.rightchild.leftchild = new Node(56);
        System.out.println("Inorder traversal: ");
        tree.inorder_traversal(tree.root);
        System.out.println("\nPreorder traversal: ");
        tree.pre_order_traversal(tree.root);
        System.out.println("\nPost order traversal: ");
        tree.post_order_traversal(tree.root);

    }
}
