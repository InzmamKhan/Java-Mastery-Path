package A_C_Structural_Mutation;

import java.util.Scanner;

class A_C_A_Insertion{

    static void print_array(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // 1. Insert at Beginning
    static void insert_at_beginning(int[] arr, int data) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = data;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        print_array(newArr);
    }

    // 2. Insert at End
    static void insert_at_end(int[] arr, int data) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = data;
        print_array(newArr);
    }

    // 3. Insert at specific Index
    static void insert_at_index(int[] arr, int index, int data) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid Index!");
            return;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = data;
            } else {
                newArr[i] = arr[j++];
            }
        }
        print_array(newArr);
    }

    // 4. Insert Before Key
    static void insert_before_key(int[] arr,int key,  int data) {
        int target = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                target = i;
                break;
            }
        }
        if (target != -1) insert_at_index(arr, data, target);
        else System.out.println("Key not found!");
    }

    // 5. Insert After Key
    static void insert_after_key(int[] arr, int key, int data) {
        int target = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                target = i;
                break;
            }
        }
        if (target != -1) insert_at_index(arr, data, target + 1);
        else System.out.println("Key not found!");
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Press A to Insert at Beginning");
        System.out.println("Press B to Insert Before Key");
        System.out.println("Press C to Insert at At Index");
        System.out.println("Press D to Insert After Key");
        System.out.println("Press E to Insert at End");
        String choice = in.nextLine();

        System.out.println("Enter Data");
        int Data = in.nextInt();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Original Array");
        print_array(arr);
        System.out.println("");
        
        switch (choice) {
            case "A" :
                insert_at_beginning(arr, Data);
                break;
            case "B" :
                System.out.println("Enter Key");
                int key1 = in.nextInt();
                insert_before_key(arr, key1, Data);
                break;
            case "C" :
                System.out.println("Enter Index");
                int idx = in.nextInt();
                insert_before_key(arr, idx, Data);
                break;
            case "D" :
                System.out.println("Enter Key");
                int key2 = in.nextInt();
                insert_after_key(arr, key2, Data);
                break;
            case "E" :
                insert_at_end(arr, Data);
                break;            
            default:
                throw new AssertionError();
        
        }
    }
}