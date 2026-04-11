import java.util.Scanner;

public class PatientRecord {
    String patientName;
    int patientId;
    int age;
    String wardType;
    String healthNotes;

    static int idCounter = 1001;

    public PatientRecord() {
        this.patientName = "Unknown";
        this.patientId = idCounter++;
        this.age = 0;
        this.wardType = "Emergency";
        this.healthNotes = "Not specified";
    }

    public PatientRecord(String patientName, int age, String wardType, String healthNotes) {
        this.patientName = patientName;
        this.patientId = idCounter++;
        this.age = age;
        this.wardType = wardType;
        this.healthNotes = healthNotes;
    }

    public PatientRecord(PatientRecord record, String newWardType) {
        this.patientName = record.patientName;
        this.patientId = idCounter++;
        this.age = record.age;
        this.wardType = newWardType;
        this.healthNotes = record.healthNotes;
    }

    public void showPatientDetails() {
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("                    PATIENT DETAILS");
        System.out.println("------------------------------------------------------------");
        System.out.println("Name         : " + patientName);
        System.out.println("ID           : " + patientId);
        System.out.println("Age          : " + age);
        System.out.println("Ward         : " + wardType);
        System.out.println("Health Notes : " + healthNotes);
        System.out.println("------------------------------------------------------------");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("HOSPITAL REGISTRATION SYSTEM");
        System.out.println("1. Emergency Registration");
        System.out.println("2. OPD / Camp Registration");

        System.out.print("Enter the registration type: ");
        int choice = input.nextInt();

        if (choice == 1) {
            PatientRecord record = new PatientRecord();
            record.showPatientDetails();
        } 
        
        else if (choice == 2) {
            input.nextLine();

            System.out.print("Enter the name: ");
            String name = input.nextLine();

            System.out.print("Enter the age: ");
            int age = input.nextInt();

            input.nextLine();
            System.out.print("Enter the ward: ");
            String ward = input.nextLine();

            System.out.print("Enter the health notes: ");
            String notes = input.nextLine();

            PatientRecord record = new PatientRecord(name, age, ward, notes);
            record.showPatientDetails();

            if (ward.equalsIgnoreCase("camp")) {
                System.out.print("Do you want to create another record from this? (yes/no): ");
                String answer = input.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.print("Enter new ward: ");
                    String newWard = input.nextLine();

                    PatientRecord newRecord = new PatientRecord(record, newWard);
                    newRecord.showPatientDetails();
                }
            }
        } 
        
        else {
            System.out.println("Invalid choice!");
        }

        input.close();
    }
}