package JAVA.OOP;

// Inheritance is the mechanism in Java by which one class can inherit Properties of another class.
// It is a way to form new classes using classes that have already been defined.
// It uses 'extends' keyword to inherit properties of another class.
// Few types of Inheritances are:
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// 4. Multiple Inheritance

class Father {
    static String haircolor = "Black";
}
interface Mother {
    String eyeColor = "Brown";
}

class son extends Father implements Mother {
    static String name = "John";

    public static void main(String[] args) {
        System.out.println("Name: " + name);
        System.out.println("Hair Color: " + haircolor);
        System.out.println("Eye Color: " + eyeColor);
    }
}