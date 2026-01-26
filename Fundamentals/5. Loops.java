package JAVA.Fundamentals;

class abc5{
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
        System.out.println();

        // While Loop
        System.out.println("While Loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration: " + j);
            j++;
        }
        System.out.println();

        // Do-While Loop
        System.out.println("Do-While Loop:");
        int k = 0;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k < 5);
    }
}