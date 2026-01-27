package D_Queue;

import java.util.*;

public class D_A_Implementation {

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

    public static void main(String args[]){
        D_A_Implementation my_queue = new D_A_Implementation();
        System.out.println("Queue Created");
    }
}