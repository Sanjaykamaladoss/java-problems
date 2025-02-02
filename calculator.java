package sanjay;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Use only  these Operators : +,-,*,/,%");
	        System.out.println("Use the 's' or 'S' to stop the program");
	        //program run till user 's' or 'S'  
	        double answer=0;
	        while(true){
	            System.out.print("Enter the operator :");
	            char op=sc.next().charAt(0);
	            System.out.println();
	            
	            if(op=='+' || op=='-'||op=='*' || op=='/'||op=='%') {

	                System.out.println();
	                System.out.print("Enter the first number :");
	                double num1 = sc.nextDouble();
	                System.out.print("Enter the second number :");
	                double num2 = sc.nextDouble();
	                if (op == '+') {
	                    answer = num1 + num2;

	                }
	                if (op == '-') {
	                    answer = num1 - num2;
	                }
	                if (op == '*') {
	                    answer = num1 * num2;
	                }
	                if (op == '/') {
	                    if (num2 != 0) {
	                        answer = num1 / num2;
	                    }
	                }
	                if (op == '%') {
	                    answer = num1 % num2;

	                }
	            }else if(op=='s'|| op=='S'){
	                    break;

	                }else{
	                    System.out.println("Invalid operator");

	                }

	            System.out.println(answer);
	            }

	        }
	}


