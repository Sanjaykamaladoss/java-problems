package sanjay;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Any Year :");
		int year=sc.nextInt();
		if(isleapyear(year) ) {
			System.out.println(year+" "+"is a leap year ");
		} else {
			System.out.println(year+" "+"is a not leap year ");
			
		}
	}
		
		public static Boolean isleapyear(int year) {
			return(year%4==0 && year%100!=0)||(year%400==0);
			
		

	}

}
