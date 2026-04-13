class PaymentSystem {

    // Method 1: Cash Payment
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }

    // Method 2: Card Payment
    void pay(double amount, String cardNumber) {
        System.out.println("Paid ₹" + amount + " using Card");
        System.out.println("Card Number: " + cardNumber);
    }

    // Method 3: UPI Payment
    void pay(String upiId, double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
        System.out.println("UPI ID: " + upiId);
    }

    // Method 4: EMI Payment
    void pay(double amount, int months) {
        System.out.println("Paid ₹" + amount + " using EMI");
        System.out.println("Duration: " + months + " months");
    }
}


public class Overloading2 {

    public static void main(String[] args) {

        // Creating object
        PaymentSystem payment = new PaymentSystem();

        // Calling overloaded methods
        payment.pay(500);                         // Cash
        payment.pay(1500, "4321-5678-1111");      // Card
        payment.pay("nithish@upi", 800);          // UPI
        payment.pay(10000, 10);                   // EMI
    }
}