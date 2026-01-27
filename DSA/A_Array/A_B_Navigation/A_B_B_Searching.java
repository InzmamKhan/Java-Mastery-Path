package A_B_Navigation;

import java.util.Scanner;

public class A_B_B_Searching {

    // Linear Search
    static void LinearSearch(int arr[], int n){
        int flag = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                System.out.println("Found (Implemented Linear Search)");
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Not Found (Implemented Linear Search");
        }
    }

    // Binary Search
    static int BinarySearch(int arr[], int n, int low, int high){
        if(low > high){
            return 0;
        }
        int mid = low+(high-low)/2;

        if(n == arr[mid]){
           return 1;
        }
        else if(n>arr[mid]){
            return BinarySearch(arr, n, mid+1, high);
        }
        else{
            return BinarySearch(arr, n, low, mid-1);
        }
    }



    public static void main(String args[]){
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Element to be Searched : ");
        int SearchedElement = in.nextInt();
        LinearSearch(arr, SearchedElement);

        
        int low=0;
        int high=arr.length-1;
        int b_result = BinarySearch(arr, SearchedElement, low, high);
        if(b_result > 0){
            System.out.println("Found (Implemented Binary Search)");
        }
        else{
            System.out.println("Not Found (Implemented Binary Search)");
    }
    }
}