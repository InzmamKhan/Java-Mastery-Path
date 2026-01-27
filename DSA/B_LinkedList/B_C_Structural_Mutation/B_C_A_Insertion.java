package B_C_Structural_Mutation;

import java.util.*;

public class B_C_A_Insertion {

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
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("NULL");
        }
    }

    void insert_at_beginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insert_before_key(int data, int key) {
        if (head == null) return;
        if (head.data == key) {
            insert_at_beginning(data);
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Key not found.");
        } else {
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void insert_at_index(int data, int index) {
        if (index == 0) {
            insert_at_beginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Index out of bounds");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Index out of bounds");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void insert_after_key(int data, int key) {
        Node current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Key not found in the list.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    void insert_at_end(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void main(String args[]) {
        B_C_A_Insertion myll = new B_C_A_Insertion();
        Scanner in = new Scanner(System.in);
        
        myll.insert_at_end(10);
        myll.insert_at_end(20);
        System.out.println("Current List:");
        myll.print_ll();

        System.out.println("Enter The Data to be Inserted:");
        int data = in.nextInt();
        in.nextLine();

        System.out.println("Press A to Insert at Beginning");
        System.out.println("Press B to Insert Before Key");
        System.out.println("Press C to Insert at Index");
        System.out.println("Press D to Insert After Key");
        System.out.println("Press E to Insert at End");
        
        String choice = in.nextLine().toUpperCase();

        switch (choice) {
            case "A":
                myll.insert_at_beginning(data);
                break;
            case "B":
                System.out.println("Enter the Key:");
                int key1 = in.nextInt();
                myll.insert_before_key(data, key1);
                break;
            case "C":
                System.out.println("Enter the Index:");
                int idx = in.nextInt();
                myll.insert_at_index(data, idx);
                break;
            case "D":
                System.out.println("Enter the Key:");
                int key2 = in.nextInt();
                myll.insert_after_key(data, key2);
                break;
            case "E":
                myll.insert_at_end(data);
                break;
            default:
                System.out.println("Invalid choice entered: " + choice);
                return;
        }
        
        System.out.println("\nFinal List:");
        myll.print_ll();
        in.close();
    }
}