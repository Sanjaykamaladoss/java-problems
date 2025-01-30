package sanjay;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String :");
        String s = sc.nextLine();
        String reversed="";
        for (int i = s.length()-1; i >=0 ; i--) {
            reversed =reversed + s.charAt(i);


        }
        System.out.println("The reverse String :"+reversed);
if(s.equals(reversed)){
    System.out.println("It is Palindrome");
}else{
    System.out.println("It is not Palindrome");
}

		

	}

}
