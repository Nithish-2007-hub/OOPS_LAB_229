class Person {
    String name;
    int age;

    void getDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Doctor extends Person {
    String specialization;

    void setDoctor(String specialization) {
        this.specialization = specialization;
    }

    void showDoctor() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
    }
}

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.getDetails("Arun", 40);
        d.setDoctor("Cardiology");
        d.showDoctor();
    }
}