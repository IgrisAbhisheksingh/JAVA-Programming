public class PostOrder {

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary Tree class
    static class BinaryTree {
        int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // ✅ Postorder Traversal (Left → Right → Root)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);   // LEFT
        postorder(root.right);  // RIGHT
        System.out.print(root.data + " "); // ROOT
    }

    public static void main(String[] args) {

        int[] nodes = {
                1,
                2,
                4, -1, -1,
                5, -1, -1,
                3,
                -1,
                6, -1, -1
        };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Root Node: " + root.data);

        System.out.print("Postorder Traversal: ");
        postorder(root);
    }
}