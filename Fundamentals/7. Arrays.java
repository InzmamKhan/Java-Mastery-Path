package JAVA.Fundamentals;

class abc7{
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements in the array
        System.out.println("Accessing elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println();

        // Modifying elements in the array
        System.out.println("Modifying elements in the array:");
        numbers[2] = 10; // Change the third element
        System.out.println("Element at index 2 after modification: " + numbers[2]);
        System.out.println();

        // Array length
        System.out.println("Length of the array: " + numbers.length);
    }
}