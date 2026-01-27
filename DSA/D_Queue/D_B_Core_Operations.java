package D_Queue;

import java.util.*;

public class D_B_Core_Operations {

    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node front;
    Node rear;

    void print_queue(){
        if(front == null){
            System.out.println("NULL Queue");
        }
        else{
            Node current = front;
            System.out.print("FRONT ->  ");
            while(current != null){
                System.out.print(current.data +"  ");
                current = current.next;
            }
            System.out.println("<- REAR");
        }
    }


    void enqueue(int data){
        Node newNode = new Node(data);

        if(front == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued : "+ rear.data);
    }

    int dequeue(){
        if(front == null){
            return 0;
        }
        else{
            Node current = front;
            int value = current.data;
            front = front.next;
            return value;
        }
    }

    public static void main(String args[]){
        D_B_Core_Operations my_queue = new D_B_Core_Operations();
        System.out.println("Queue Created");
        System.out.println("----------");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The 1st Element for Queue");
        int a = in.nextInt();
        my_queue.enqueue(a);

        System.out.println("Enter The 1st Element for Queue");
        int b = in.nextInt();
        my_queue.enqueue(b);

        System.out.println("Enter The 1st Element for Queue");
        int c = in.nextInt();
        my_queue.enqueue(c);
        
        System.out.println("----------");

        my_queue.print_queue();

        System.out.println("----------");

        System.out.println("Eneter The Amount you want to Dequeue");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            int value = my_queue.dequeue();
            System.out.println("Dequeued Value :" + value);
        }
        System.out.println("Dequeued Queue");
        my_queue.print_queue();
        System.out.println("----------");
    }
}