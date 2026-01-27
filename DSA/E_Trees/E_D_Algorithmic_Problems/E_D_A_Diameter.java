package E_Trees.E_D_Algorithmic_Problems;

import java.util.Random;
import java.util.Scanner;

public class E_D_A_Diameter {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    Node insert(Node root, int val){
        Node newNode = new Node(val);
        if(root == null){
            root = newNode;
            return root;
        }
        else{
            Node current = root;
            while (true) { 
                Node parent = current;
                if(val < current.data){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        break;
                    }
                }
                else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        break;
                    }
                }
            }
            return root;
        }
    }
    void print_tree(Node node){ // Based on Inorder Traversal
        if(node == null){
            return;
        }
        else{
            print_tree(node.left);
            System.out.print(node.data + " ");
            print_tree(node.right);
        }
    }

    int height(Node node, int[] maxDiameter) {
        if (node == null) return 0;

        int leftHeight = height(node.left, maxDiameter);
        int rightHeight = height(node.right, maxDiameter);

        maxDiameter[0] = Math.max(maxDiameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    int find_diameter(Node root) {
        int[] maxDiameter = new int[1];
        height(root, maxDiameter);
        return maxDiameter[0];
    }


    public static void main(String args[]){
        E_D_A_Diameter my_tree = new E_D_A_Diameter();
        System.out.println("Binary Tree Created");
        System.out.println("----------");

        Scanner in = new Scanner(System.in);

        Node myroot = null;
        Random rand = new Random();
        int size = rand.nextInt(20);
        for(int i=0; i<=size; i++){
            int randomInt = rand.nextInt(100);
            myroot = my_tree.insert(myroot, randomInt);
        }

        System.out.println("In-Order Traversal");
        my_tree.print_tree(myroot);
        System.out.println("");
        System.out.println("----------");

        int dia = my_tree.find_diameter(myroot);
        System.out.println("Diameter of The Trees : "+ dia);
    }
}