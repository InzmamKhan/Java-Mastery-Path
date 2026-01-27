import java.util.*;

public class C_B_Core_Operations {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node top;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed : " + data);
    }
    int pop(){
        int value = top.data;
        top = top.next;
        return value;
    }
    int peek(){
        return top.data;
    }
    void print_stack(){
        Node current = top;
        System.out.println("--");
        while(current != null){
            System.out.println("|" + current.data + "|");
            System.out.println("--");
            current = current.next;
        }
    }


    public static void main(String args[]){
        C_B_Core_Operations my_stack = new C_B_Core_Operations();
        System.out.println("Stack Created");
        System.out.println("--------------");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter The 1st Element for Stack");
        int a = in.nextInt();
        my_stack.push(a);

        System.out.println("Enter The 2nd Element for Stack");
        int b = in.nextInt();
        my_stack.push(b);

        System.out.println("Enter The 3rd Element for Stack");
        int c = in.nextInt();
        my_stack.push(c);

        System.out.println("--------------");

        my_stack.print_stack();

        System.out.println("--------------");

        int top_most = my_stack.peek();
        System.out.println("Top Element of The Stack is : "+top_most);

        System.out.println("--------------");

        System.out.println("Enter the Number of Elements you want to Pop");
        int n = in.nextInt();
        int temp;
        for(int i=1; i<=n; i++){
            temp = my_stack.pop();
            System.out.println("Popped Element :" + temp);
        }
        System.out.println("New Updated Stack : ");
        my_stack.print_stack();

    }
}