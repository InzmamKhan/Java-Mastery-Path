package JAVA.Fundamentals;

class abc3 {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic Operators:
        // + (Addition), - (Subtraction), * (Multiplication), / (Division), % (Modulus), ++ (Increment), -- (Decrement)
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        a++;
        System.out.println("a++ = " + a); // Increment
        b--;
        System.out.println("b-- = " + b); // Decrement
        System.out.println();

        // Relational Operators:
        // >, <, >=, <=, ==, !=
        System.out.println("Relational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println();

        // Logical Operators:
        // && (AND), || (OR), ! (NOT)
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();

        // Assignment Operators:
        // =, +=, -=, *=, /=, %=
        int c = 5;
        System.out.println("Assignment Operators:");
        c += 2;
        System.out.println("c += 2: " + c);
        c -= 1;
        System.out.println("c -= 1: " + c);
        c *= 3;
        System.out.println("c *= 3: " + c);
        c /= 2;
        System.out.println("c /= 2: " + c);
        c %= 2;
        System.out.println("c %= 2: " + c);
        System.out.println();

        // Bitwise Operators:
        // &, |, ^, ~, <<, >>
        int d = 6, e = 4;
        System.out.println("Bitwise Operators:");
        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));
        System.out.println("~d: " + (~d));
        System.out.println("d << 1: " + (d << 1));
        System.out.println("d >> 1: " + (d >> 1));
        System.out.println();

        // Ternary Operator:
        // condition ? value_if_true : value_if_false
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("max = (a > b) ? a : b -> " + max);
    }
}