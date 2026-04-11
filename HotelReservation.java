import java.util.Scanner;

class HotelReservation {
    String customerName;
    String roomType;
    String floorNumber;
    double price;

    public HotelReservation() {
        this.customerName = "Walk-in Customer";
        this.roomType = "Standard";
        this.floorNumber = "Ground Floor";
        this.price = 2000.0;
    }

    public HotelReservation(String customerName, String roomType, String floorNumber, double price) {
        this.customerName = customerName;
        this.roomType = roomType;
        this.floorNumber = floorNumber;
        this.price = price;
    }

    public HotelReservation(HotelReservation booking, String newCustomerName) {
        this.customerName = newCustomerName;
        this.roomType = booking.roomType;
        this.floorNumber = booking.floorNumber;
        this.price = booking.price;
    }

    public void showBookingDetails() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("                 BOOKING DETAILS");
        System.out.println("--------------------------------------------------");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Room Type     : " + roomType);
        System.out.println("Floor         : " + floorNumber);
        System.out.println("Price         : " + price);
        System.out.println("--------------------------------------------------\n");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Walk-in Guest Booking");
        System.out.println("2: Advanced Booking");

        System.out.print("Enter booking type (1/2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            HotelReservation walkIn = new HotelReservation();
            walkIn.showBookingDetails();
        } 
        
        else if (choice == 2) {
            scanner.nextLine();

            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();

            System.out.print("Enter room type: ");
            String room = scanner.nextLine();

            System.out.print("Enter floor number: ");
            String floor = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            HotelReservation booking = new HotelReservation(name, room, floor, price);
            booking.showBookingDetails();

            scanner.nextLine();
            System.out.print("Do you want to refer a friend? (yes/no): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.print("Enter friend's name: ");
                String friendName = scanner.nextLine();

                HotelReservation friendBooking = new HotelReservation(booking, friendName);
                friendBooking.showBookingDetails();
            }
        } 
        
        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}