// Interface
interface Vehicle {

    void start();   // abstract method
}

// Class implementing interface
class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts with key");
    }
}

// Main class
public class Abstraction2 {
    public static void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}