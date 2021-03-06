package main;
import BinarySearchTree.myBinarySearchTree;
public class myMain {
    public static void main(String[] args) {
        myBinarySearchTree bst = new myBinarySearchTree();
        bst.insert(40);
        bst.insert(100);
        bst.insert(27);
        bst.insert(103);
        bst.insert(55);
        bst.insert(65);
        bst.insert(57);
        bst.insert(92);
        bst.insert(77);
        bst.insert(47);
        bst.traversePreOrder(bst.getRoot());
        System.out.println();
        bst.traversePostOrder(bst.getRoot());
        System.out.println();
        bst.traverseInOrder(bst.getRoot());
        System.out.println();
        System.out.println(bst.search(70));
        System.out.println(bst.search(92));
    }
}
