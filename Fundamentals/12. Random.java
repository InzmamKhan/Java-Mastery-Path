package JAVA.Fundamentals;

import java.util.Random;

 class abc12{
    public static void main(String[] args) {

        // Create an instance of Random
        Random random = new Random();

        // Generate a random integer between 0 and 100
        int randomNumber = random.nextInt(101); // 101 is exclusive

        // Print the random number
        System.out.println("Random number between 0 and 100: " + randomNumber);
    }
 }