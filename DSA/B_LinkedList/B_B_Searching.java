

import java.util.*;

class B_B_Searching{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
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
        if(head == null){
            System.out.print("NULL");
        }
        else{
            Node current = head;
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("NULL");
        }
    }

    void search(int n){
        int flag=0;
        if(head == null){
            System.out.println("Element Not Found");
        }
        else{
            Node current = head;
            while(current != null){
                if(current.data == n){
                    flag++;
                    break;
                }
                else{
                    current = current.next;
                }
            }
            if(flag>0){
                System.out.println("Found");
            }
            else{
                System.out.println("Not Found");
            }
        }
    }




    public static void main(String args[]){
       
        B_B_Searching myll = new B_B_Searching();
        myll.insert(1);
        myll.insert(2);
        myll.insert(3);
        myll.insert(4);
        myll.insert(5);
        myll.print_ll();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number to be Searched");
        int n = in.nextInt();

        myll.search(n);
    }
}