class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Mammal extends Animal {
    void type() {
        System.out.println("Mammal");
    }
}

interface Pet {
    void friendly();
}

class Dog extends Mammal implements Pet {
    public void friendly() {
        System.out.println("Dog is friendly");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Cat extends Mammal {
    void display() {
        System.out.println("Cat Name: " + name);
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Buddy");
        d.type();
        d.friendly();
        d.display();

        Cat c = new Cat();
        c.setName("Kitty");
        c.type();
        c.display();
    }
}