package E_Trees.E_D_Algorithmic_Problems;

import java.util.Random;

public class E_D_B_Invert_BTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }
    void printTree(Node node) {
        if (node == null) return;
        printTree(node.left);
        System.out.print(node.data + " ");
        printTree(node.right);
    }

    public static void main(String[] args) {
        E_D_B_Invert_BTree helper = new E_D_B_Invert_BTree();
        Node root = null;
        Random rand = new Random();

        System.out.println("Building tree with random values...");
        for (int i = 0; i < 7; i++) {
            root = helper.insert(root, rand.nextInt(100));
        }

        System.out.print("Original In-order: ");
        helper.printTree(root);
        System.out.println();

        helper.invertTree(root);

        System.out.print("Inverted In-order: ");
        helper.printTree(root);
        System.out.println();
    }
}