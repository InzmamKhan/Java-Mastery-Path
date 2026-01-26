package JAVA.OOP;

// Polymorphism is the mechanism in Java to Morph Data into Multiple Forms.
// It has 2 types:
// 1. Method Overloading
// 2. Method Overriding


// 1. Method Overloading
// It basically Means having multiple methods with the same name but different parameters.
class Overloading {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String b) {
        System.out.println("String: " + b);
    }

    void display(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }
}


// 2. Method Overriding
// It ibasically means redefining a method in the child class that is already defined in the parent class.
// It uses '@Override' annotation to indicate that a method is being overridden.
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}