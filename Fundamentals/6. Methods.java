package JAVA.Fundamentals;



class abc6 {
    
        // Method without parameters
    static void greet() {
        System.out.println("Hello!");
    }

    // Method with parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with return type
    static String getMessage(String msg) {
        return "Message: " + msg;
    }

    public static void main(String[] args) {
        // Method without parameters
        System.out.println("Method without parameters:");
        greet();
        System.out.println();

        // Method with parameters
        System.out.println("Method with parameters:");
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);
        System.out.println();

        // Method with return type
        System.out.println("Method with return type:");
        String message = getMessage("Hello, World!");
        System.out.println(message);
    }
}


