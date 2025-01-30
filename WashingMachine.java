package sanjay;

import java.util.Scanner;

public class WashingMachine {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Weight of the Cloths ");
	        int weight = sc.nextInt();
	         if (weight == 0) {
	            System.out.println("Time Estimated: 0");

	        } else if (weight <= 2000 ) {
	            System.out.println("Time Estimated: 25 MINUTES" );

	        } else if (weight>=2001 && weight <=4000) {
	            System.out.println("Time Estimated: 35 MINUTES" );

	        } else if (weight>=4001 && weight<7000) {
	            System.out.println("Time Estimated: 45 MINUTES" );

	        }
	         else if(weight>7000){
	             System.out.println("Time Estimated: OVERLOADED " );
	         }
	        else{
	            System.out.println("INVALID INPUT");
	        }

	}

}
