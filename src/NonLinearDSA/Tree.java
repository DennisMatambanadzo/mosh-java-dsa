package NonLinearDSA;

public class Tree {
    private class Node {
        Integer value;
        Node leftChild, rightChild;

        public Node(Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }


    private Node root;

    public void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;

        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }


    }

    public boolean find(int value) {
        var current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else
                return true;

        }
        return false;
    }

    public void traversalPreOrder() {
        traversalPreOrder(root);
    }

    private void traversalPreOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.value);
        traversalPreOrder(root.leftChild);
        traversalPreOrder(root.rightChild);
    }

    public void traversalInOrder() {
        traversalInOrder(root);
    }

    private void traversalInOrder(Node root) {
        if (root == null)
            return;
        traversalInOrder(root.leftChild);
        System.out.println(root.value);
        traversalInOrder(root.rightChild);
    }

    public void traversalPostOrder() {
        traversalPostOrder(root);
    }

    private void traversalPostOrder(Node root) {
        if (root == null)
            return;
        traversalPostOrder(root.leftChild);
        traversalPostOrder(root.rightChild);
        System.out.println(root.value);
    }


    public int height() {
        if (root == null)
            return -1;
        return height(root);
    }

    private int height(Node root) {
        if (isLeaf(root))
            return 0;
        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }

    public int min() {
        if (root == null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    private int min(Node root) {
        if (isLeaf(root))
            return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }
}
