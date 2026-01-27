package A_C_Structural_Mutation;

import java.util.Arrays;
import java.util.Scanner;

class A_C_C_Sorting {

    // Function to print the array
    static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 1. Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int[] temp = Arrays.copyOf(arr, n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    int swap = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = swap;
                }
            }
        }
        print_array(temp);
    }

    // 2. Selection Sort
    static void selectionSort(int[] arr) {
        int n = arr.length;
        int[] temp = Arrays.copyOf(arr, n);
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (temp[j] < temp[min_idx]) min_idx = j;
            }
            int swap = temp[min_idx];
            temp[min_idx] = temp[i];
            temp[i] = swap;
        }
        print_array(temp);
    }

    // 3. Insertion Sort
    static void insertionSort(int[] arr) {
        int n = arr.length;
        int[] temp = Arrays.copyOf(arr, n);
        for (int i = 1; i < n; ++i) {
            int key = temp[i];
            int j = i - 1;
            while (j >= 0 && temp[j] > key) {
                temp[j + 1] = temp[j];
                j = j - 1;
            }
            temp[j + 1] = key;
        }
        print_array(temp);
    }

    // 4. Merge Sort
    static void mergeSort(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        divide(temp, 0, temp.length - 1);
        print_array(temp);
    }

    private static void divide(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            divide(arr, l, m);
            divide(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int L[] = new int[n1], R[] = new int[n2];
        for (int i = 0; i < n1; ++i) L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // 5. Radix Sort
    static void radixSort(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        int max = temp[0];
        for (int i = 1; i < temp.length; i++) if (temp[i] > max) max = temp[i];
        for (int exp = 1; max / exp > 0; exp *= 10) countSort(temp, exp);
        print_array(temp);
    }

    private static void countSort(int[] arr, int exp) {
        int n = arr.length, output[] = new int[n], count[] = new int[10];
        for (int i = 0; i < n; i++) count[(arr[i] / exp) % 10]++;
        for (int i = 1; i < 10; i++) count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (int i = 0; i < n; i++) arr[i] = output[i];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 5};

        System.out.println("Original Array:");
        print_array(arr);
        System.out.println(" ");
        
        System.out.println("Press A for Bubble Sort");
        System.out.println("Press B for Selection Sort");
        System.out.println("Press C for Insertion Sort");
        System.out.println("Press D for Merge Sort");
        System.out.println("Press E for Radix Sort");
        String choice = in.nextLine();

        switch (choice) {
            case "A": bubbleSort(arr); break;
            case "B": selectionSort(arr); break;
            case "C": insertionSort(arr); break;
            case "D": mergeSort(arr); break;
            case "E": radixSort(arr); break;
            default: System.out.println("Invalid Selection");
        }
    }
}