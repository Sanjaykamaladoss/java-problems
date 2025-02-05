package sanjay;

import java.util.Scanner;

public class SimpleInterst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principle amt(P) :");
		float P=sc.nextInt();
		System.out.println("\n");
		System.out.print("Enter the rate of Interst (R) :");
		float R=sc.nextInt();
		System.out.println("\n");
		System.out.print("Enter the term of years(T) " );
		float T=sc.nextInt();
		System.out.println("\n");
		
		float SI=(P*R*T)/100;
		
		System.out.print("The Simple Interst is :" + SI);
		
	}

}
