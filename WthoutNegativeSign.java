package sanjay;

import java.util.Scanner;

public class WthoutNegativeSign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        System.out.print("Enter an integer: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        //Math.abs is a math variable if negative sign comes it will print postive integer
        int difference = Math.abs(a - b);
        System.out.println("The difference is: " + difference);

	}

}
