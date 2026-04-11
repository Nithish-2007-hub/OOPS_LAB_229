class Vehicle {
    String brand;

    void setBrand(String brand) {
        this.brand = brand;
    }
}

class Car extends Vehicle {
    int seats;

    void setCar(int seats) {
        this.seats = seats;
    }

    void showCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Seats: " + seats);
    }
}

class Bike extends Vehicle {
    boolean electric;

    void setBike(boolean electric) {
        this.electric = electric;
    }

    void showBike() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Electric: " + electric);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("Toyota");
        c.setCar(5);
        c.showCar();

        Bike b = new Bike();
        b.setBrand("Ola");
        b.setBike(true);
        b.showBike();
    }
}