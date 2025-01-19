
package sanjay;
import java.util.Scanner;

public class reverse {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Get input from the user
	        System.out.print("Enter a number to reverse: ");
	        int number = scanner.nextInt();
	        int reverse = 0;

	        // Reverse the number
	        while (number != 0) {
	            int digit = number % 10;  // Extract the last digit
	            reverse = reverse * 10 + digit;  // Build the reversed number
	            number /= 10;  // Remove the last digit
	        }

	        // Display the reversed number
	        System.out.println("Reversed number: " + reverse);

	        scanner.close();
	  }

}

