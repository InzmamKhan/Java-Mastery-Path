package JAVA.Fundamentals;

import java.util.ArrayList;

class abc8 {
    public static void main(String[] args) {
        // Single Dimensional ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Single Dimensional ArrayList: " + numbers);
        System.out.println("Element at index 2: " + numbers.get(2));
        numbers.remove(1); // Removes 20
        System.out.println("After removing element at index 1: " + numbers);
        System.out.println("Size of ArrayList: " + numbers.size());
        System.out.println("Contains 30? " + numbers.contains(30));
        System.out.println();

        // Double Dimensional ArrayList (ArrayList of ArrayLists)
        ArrayList<ArrayList<String>> matrix = new ArrayList<>();

        ArrayList<String> row1 = new ArrayList<>();
        row1.add("A");
        row1.add("B");
        row1.add("C");

        ArrayList<String> row2 = new ArrayList<>();
        row2.add("D");
        row2.add("E");
        row2.add("F");

        matrix.add(row1);
        matrix.add(row2);

        System.out.println("Double Dimensional ArrayList:");
        for (int i = 0; i < matrix.size(); i++) {
            System.out.println("Row " + i + ": " + matrix.get(i));
        }

        // Accessing an element
        System.out.println("Element at [1][2]: " + matrix.get(1).get(2)); // F

        // Adding a new row
        ArrayList<String> row3 = new ArrayList<>();
        row3.add("G");
        row3.add("H");
        row3.add("I");
        matrix.add(row3);

        System.out.println("After adding a new row:");
        for (ArrayList<String> row : matrix) {
            System.out.println(row);
        }
    }
}
