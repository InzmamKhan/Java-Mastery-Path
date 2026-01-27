package E_Trees;

import java.util.Scanner;

public class E_B_Core_Operations {

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

    Node delete(Node root, int data){
        if(root == null){
            return null;
        }
        if(data < root.data){
            root = delete(root.left, data);
        }
        else if(data > root.data){
            root = delete(root.right, data);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                int smallestval = findsmallest_val(root.right);
                root.data = smallestval;
                root.right = delete(root.right, smallestval);
            }
        }
        return root;
    }

    int findsmallest_val(Node current){
        while(current.left != null){
            current = current.left;
        }
        return current.data;
    }

    public static void main(String args[]){
        E_B_Core_Operations my_tree = new E_B_Core_Operations();
        System.out.println("Binary Tree Created");
        System.out.println("----------");

        Scanner in = new Scanner(System.in);

        Node myroot = null;
        for(int i=0; i<10; i++){
            System.out.println("Enter The Element for Binary Tree");
            int val = in.nextInt();
            myroot = my_tree.insert(myroot, val);
        }
        System.out.println("Updated Tree after Insertion :");
        my_tree.print_tree(myroot);
        System.out.println("----------");

        System.out.println("Enter the Element you want to Delete :");
        int d = in.nextInt();
        myroot = my_tree.delete(myroot, d);
        System.out.println("Updated Tree after Deletion :");
        my_tree.print_tree(myroot);
        System.out.println("----------");

    }
}