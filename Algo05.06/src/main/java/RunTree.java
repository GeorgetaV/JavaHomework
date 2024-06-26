public class RunTree {
    public static void main(String[] args) {

        BinarySrchTree binaryTree = new BinarySrcTree();

        System.out.println(binaryTree.find(4));

        binaryTree.insert(5);
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(10);

        System.out.println(binaryTree.find(4));
        System.out.println(binaryTree.find(6));
        System.out.println();

        binaryTree.print();

        binaryTree.deleteNode(binaryTree.getRoot(), 6);
        binaryTree.print();

        binaryTree.deleteNode(binaryTree.getRoot(), 2);
        binaryTree.print();
    }

    private static class BinarySrcTree extends BinarySrchTree {
    }
}
