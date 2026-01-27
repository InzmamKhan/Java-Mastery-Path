package E_Trees;

import java.util.Scanner;
import java.util.Random;

public class E_C_Traversals {

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    void preorder(Node node){
        if(node == null){
            return;
        }
        else{
            
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    void inorder(Node node){
        if(node == null){
            return;
        }
        else{
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    void postorder(Node node){
        if(node == null){
            return;
        }
        else{
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
    

    Node insert(Node root, int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return root;
        }
        else{
            Node current = root;
            while(true){
                Node parent = current;

                if(data < current.data){
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


    public static void main(String args[]){
        E_C_Traversals my_tree = new E_C_Traversals();
        System.out.println("Binary Tree Created");
        System.out.println("----------");

        Scanner in = new Scanner(System.in);

        Node myroot = null;
        Random rand = new Random();
        for(int i=0; i<10; i++){
            int randomInt = rand.nextInt(100);
            myroot = my_tree.insert(myroot, randomInt);
        }

        System.out.println("Pre-Order Traversal");
        my_tree.preorder(myroot);
        System.out.println("");
        System.out.println("----------");

        System.out.println("In-Order Traversal");
        my_tree.inorder(myroot);
        System.out.println("");
        System.out.println("----------");

        System.out.println("Post-Order Traversal");
        my_tree.postorder(myroot);
        System.out.println("");
        System.out.println("----------");

    }
}