package JAVA.OOP;

// Data Abstraction is the process of hiding the implementation details and showing only the essential features of the object.
// It is achieved using abstract classes and interfaces.
// To do this we use 'Abstract keyword'.

abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    // The body of sound() is provided here
    void sound() {
        System.out.println("Bark");
    }
}