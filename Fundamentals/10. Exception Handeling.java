package JAVA.Fundamentals;

class abc10 {
    public static void main(String[] args) {
        // Example of Exception Handling in Java

        // 1. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for ArrayIndexOutOfBoundsException.");
        }

        // 2. ArithmeticException
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for ArithmeticException.");
        }

        // 3. NullPointerException
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for NullPointerException.");
        }

        // 4. NumberFormatException
        try {
            int num = Integer.parseInt("abc");
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for NumberFormatException.");
        }

        // 5. StringIndexOutOfBoundsException
        try {
            String str = "Java";
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for StringIndexOutOfBoundsException.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
