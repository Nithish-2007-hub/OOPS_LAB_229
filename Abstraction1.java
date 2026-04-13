// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass
class Dog extends Animal {

    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Abstraction1 {
    public static void main(String[] args) {

        Dog d = new Dog();   // object creation

        d.sound();           // calling method
        d.sleep();           // calling inherited method
    }
}