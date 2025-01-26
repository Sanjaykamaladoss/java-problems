package sanjay;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter The Number how many terms of Fibonacci series should be printed: ");
	        int series = sc.nextInt();
	        //if Statement checks that the number is grater than "zero"
	        if (series <= 0) {
	            System.out.println("input should be greater than zero");
	        } else {
	            System.out.println("Fibonacci Series of first" +" "+ series + " "+"number :");
// First number starting with 0 and second number is 1 is declared 
	            // it works like adding current number with previous number example 0 1 is there 0+1=1, 1+1=2.......n 
	            int n = 0, n1 = 1;
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(n + " ");
	                int n3 = n + n1;
	                n = n1;
	                n1 = n3;
	            }

	        }
		
	}

}
