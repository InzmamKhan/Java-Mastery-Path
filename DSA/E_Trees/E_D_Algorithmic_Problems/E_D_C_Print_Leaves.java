package E_Trees.E_D_Algorithmic_Problems;

import java.util.Random;

public class E_D_C_Print_Leaves {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    void printLeaves(Node node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return;
        }

        if (node.left != null) {
            printLeaves(node.left);
        }
        if (node.right != null) {
            printLeaves(node.right);
        }
    }

    Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    void printFullTree(Node node) {
        if (node == null) return;
        printFullTree(node.left);
        System.out.print(node.data + " ");
        printFullTree(node.right);
    }

    public static void main(String[] args) {
        E_D_C_Print_Leaves treeObj = new E_D_C_Print_Leaves();
        Node root = null;
        Random rand = new Random();

        System.out.println("Generating random Tree...");
        for (int i = 0; i < 10; i++) {
            root = treeObj.insert(root, rand.nextInt(100));
        }

        System.out.print("Full Tree (In-order): ");
        treeObj.printFullTree(root);
        System.out.println();

        System.out.print("Leaf Nodes only: ");
        treeObj.printLeaves(root);
        System.out.println();
    }
}