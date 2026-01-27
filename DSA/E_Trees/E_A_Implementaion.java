package E_Trees;

public class E_A_Implementaion {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;

    public static void main(String args[]){
        E_A_Implementaion my_tree = new E_A_Implementaion();
        System.out.println("Binary Tree Created");
    }
}