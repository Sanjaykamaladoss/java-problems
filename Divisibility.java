package sanjay;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
  
        int n = sc.nextInt();
        if(n%27==0) {
            System.out.println("It is divisible by 27");
        }else{
            System.out.println("It is not divisible by 27");
        }

	}

}
