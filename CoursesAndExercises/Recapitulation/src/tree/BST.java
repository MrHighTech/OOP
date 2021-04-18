package tree;

public class BST {
    private IntNode root = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public void add(int i) {
        if (root == null) {
            root = new IntNode(i);
            size++;
        } else {
            IntNode node = root;
            while (true) {
                if (node.value == i) break;
                if (i > node.value) {
                    if (node.right == null) {
                        node.right = new IntNode(i);
                        size++;
                        break;
                    } else {
                        node = node.right;
                    }
                } else {
                    if (node.left == null) {
                        node.left = new IntNode(i);
                        size++;
                        break;
                    } else {
                        node = node.left;
                    }
                }
            }
        }
    }

    public void print() {
        System.out.println("Tree: ");
        inorder(root);
        System.out.println();
    }

    public void inorder(IntNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.printf(" %d", node.value);
            inorder(node.right);
        }
    }
}
