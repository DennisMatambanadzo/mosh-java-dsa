package LinearDSA;


import NonLinearDSA.TreeRedo;


public class Main {
    public static void main(String[] args) {
        TreeRedo tree = new TreeRedo();

        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        TreeRedo tree2 = new TreeRedo();

        tree2.insert(7);
        tree2.insert(4);
//        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);

        tree.traverseLevelOrder();


    }
}