package A_C_Structural_Mutation;

import java.util.Scanner;

class A_C_B_Deletion {

    static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 1. Delete from Beginning
    static void delete_from_beginning(int[] arr) {
        if (arr.length == 0) return;
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        print_array(newArr);
    }

    // 2. Delete from End
    static void delete_from_end(int[] arr) {
        if (arr.length == 0) return;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        print_array(newArr);
    }

    // 3. Delete at specific Index
    static void delete_at_index(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index!");
            return;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) continue;
            newArr[k++] = arr[i];
        }
        print_array(newArr);
    }

    // 4. Delete specific Key (Value)
    static void delete_key(int[] arr, int key) {
        int target = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                target = i;
                break;
            }
        }
        if (target != -1) delete_at_index(arr, target);
        else System.out.println("Key not found!");
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        System.out.println("Original Array:");
        print_array(arr);
        
        System.out.println("Press A to Delete from Beginning");
        System.out.println("Press B to Delete a Specific Key");
        System.out.println("Press C to Delete at Index");
        System.out.println("Press D to Delete from End");
        
        String choice = in.nextLine().toUpperCase();

        switch (choice) {
            case "A":
                delete_from_beginning(arr);
                break;
            case "B":
                System.out.println("Enter Key to Delete:");
                int key = in.nextInt();
                delete_key(arr, key);
                break;
            case "C":
                System.out.println("Enter Index to Delete:");
                int idx = in.nextInt();
                delete_at_index(arr, idx);
                break;
            case "D":
                delete_from_end(arr);
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}