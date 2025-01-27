package sanjay;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Entering the first number
	        System.out.println("Enter the first number: ");
	        int num1 = sc.nextInt();
	     // Entering the second number
	        System.out.println("Enter the second number: ");
	        int num2 = sc.nextInt();

	        // Comparing the numbers
	        if (num1 > num2) {
	        	//condition for first number whether greater 
	            System.out.println(num1 + " is greater than " + num2);
	        } else if (num1 < num2) {
	            System.out.println(num2 + " is greater than " + num1);
	        } else {
	            System.out.println("Both numbers are equal.");
	        }

	}

}
