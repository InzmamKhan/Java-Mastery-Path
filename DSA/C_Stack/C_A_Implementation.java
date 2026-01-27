class C_A_Implementation { // Linked Node Implementation

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node Top;


    public static void main(String args[]){
        C_A_Implementation my_stack = new C_A_Implementation();
        System.out.println("Stack Created Succesfully");
    }
}