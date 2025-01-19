package sanjay;
import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        // Check for prime number
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {  // If divisible by any number, not prime
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();

	}

}
