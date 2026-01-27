package B_C_Structural_Mutation;

import java.util.*;

public class B_C_B_Deletion {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void print_ll() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Helper to add data to test deletion
    void insert_at_end(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    void delete_at_beginning() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
        head = head.next;
    }

    void delete_at_end() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    void delete_by_key(int key) {
        if (head == null) return;

        // If head holds the key
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Key not found.");
        } else {
            current.next = current.next.next;
        }
    }

    void delete_at_index(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Index out of bounds.");
        } else {
            current.next = current.next.next;
        }
    }

    public static void main(String args[]) {
        B_C_B_Deletion myll = new B_C_B_Deletion();
        Scanner in = new Scanner(System.in);

        // Pre-fill list: 10 -> 20 -> 30 -> 40 -> 50 -> NULL
        for(int i=10; i<=50; i+=10) myll.insert_at_end(i);
        
        System.out.println("Initial List:");
        myll.print_ll();

        System.out.println("\nSelect Deletion Type:");
        System.out.println("A: Beginning | B: By Key | C: By Index | D: End");
        
        String choice = in.nextLine().toUpperCase();

        switch (choice) {
            case "A":
                myll.delete_at_beginning();
                break;
            case "B":
                System.out.println("Enter Key to delete:");
                int key = in.nextInt();
                myll.delete_by_key(key);
                break;
            case "C":
                System.out.println("Enter Index to delete:");
                int idx = in.nextInt();
                myll.delete_at_index(idx);
                break;
            case "D":
                myll.delete_at_end();
                break;
            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("\nFinal List:");
        myll.print_ll();
        in.close();
    }
}