import java.util.Scanner;

class B_A_Implementation{

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head;







    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void print_ll(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }







    public static void main(String[] args) {
        B_A_Implementation myLL = new B_A_Implementation();
        System.out.println("Linked List Created Successfully");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Head Data for Linked List :");
        int a = in.nextInt();
        myLL.insert(a);
        System.out.println("Succesfully Created and Attached The Node : "+ a);


        System.out.println("Enter The Next Node Data for Linked List :");
        int b = in.nextInt();
        myLL.insert(b);
        System.out.println("Succesfully Created and Attached The Node : "+ b);


        System.out.println("Enter The Next Node Data for Linked List :");
        int c = in.nextInt();
        myLL.insert(c);
        System.out.println("Succesfully Created and Attached The Node : "+ c);

        
        System.out.println("Final Linked List : ");
        myLL.print_ll();

    }
}   