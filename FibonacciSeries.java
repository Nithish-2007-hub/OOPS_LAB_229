import java.util.Scanner;

class FibonacciSeries {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int firstTerm = -1;
        int secondTerm = 1;
        int nextTerm;

        System.out.print("Enter the number of Fibonacci terms: ");
        int count = scanner.nextInt();

        System.out.println("First " + count + " Fibonacci Terms:");

        do {
            nextTerm = firstTerm + secondTerm;
            System.out.println(nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            count--;
        } while (count > 0);

        scanner.close();
    }
}