package sanjay;
//in the util package use Random package
import java.util.Random;
public class OneTimePassword {
	 public static void main(String[] args) {
		 //generting 4 digits otp 
	       String number="0123456789";
		 //it is the function that generate random numbers 
		 Random r=new Random();
		 //array stores 4 charater length otp
		 char otp[]=new char[4];
		 
		 for(int i=0;i<4;i++){
			 //to get the random charater
		 otp[i]=number.charAt(r.nextInt(number.length()));
		 }
		 
		 System.out.print(otp)
	    }

}
