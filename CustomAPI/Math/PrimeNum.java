import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Please enter the range to be detected (int): ");
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();

        System.out.println("Here are all prime numbers in this range: ");
        int count = 0;
        for (int i = startNum; i < endNum; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total " + count + " prime numbers.");

        long endTime = System.currentTimeMillis();

        System.out.println("It takes " + (endTime - startTime) + "ms to complete.");
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
