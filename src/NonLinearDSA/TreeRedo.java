package NonLinearDSA;

public class TreeRedo {

    private class Node {
        int value;
        Node leftChild;
        Node rightChild;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    private Node root;

    public void insert(int value) {

        var node = new Node(value);
        if (root == null) {
            root = node;
            System.out.println(root.value);
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

    public boolean find(int value){

        var current = root;
        while (root!=null) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    return false;
                }else if (current.leftChild.value==value){
                    return true;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    return false;
                }else if (current.rightChild.value==value){
                    return true;
                }
                current = current.rightChild;
            }

        }
        return false;
    }
}
