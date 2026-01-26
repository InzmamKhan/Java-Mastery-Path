package JAVA.Fundamentals;

import java.util.Scanner;
class abc11 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the input back to the user
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }    
}
