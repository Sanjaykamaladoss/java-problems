package sanjay;
import java.util.Scanner;

public class AgecClassification {

	public static void main(String[] args) {
		System.out.println("Enter The Age:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		// using if statement age less than 12 which print child
		if(a<=12) {
			System.out.println("Child");
			// using else if statement age less than 20 which print Teenager
		}else if(a<=19){
			System.out.println("Teenager");
			// using else if statement age less than 65 which print Teenager
		}else if(a<=64) {
			System.out.println("Adult");
			// using else  statement age above or equal to 65 which print Senior
		}else{
			System.out.println("Senior");
		
			
		}
		

	}

}
