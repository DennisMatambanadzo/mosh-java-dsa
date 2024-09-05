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
//
//        if (current.value > value) {
//            current.leftChild = new Node();
//            current.leftChild.value = value;
//            System.out.println(current);
//            current = current.leftChild;
//            System.out.println("I'm on the left " + current.value);
//            return;
//        }
//        if (current.value < value) {
//            current.rightChild = new Node();
//            current.rightChild.value = value;
//            System.out.println(current);
//            current = current.rightChild;
//            System.out.println("I'm on the right " + current.value);
//            return;
//        }


//        System.out.println(current.rightChild);
    }

    public boolean find() {
        return false;
    }

//    insert(value)
//    find(value):boolean

//    var current = root;
//    current = current.leftChild
}
