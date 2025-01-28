package sanjay;

public class SubString {
	public static void main(String[] args) {
		//String declared as s1 
		 String s1 = "Ask";
		        //outer loop is used to iterate each charater from s1
		 for (int i = 0; i < s1.length(); i++) {
			 //inner for loop is used to iterate present charater to last charater 	
	            for (int j = i; j < s1.length(); j++) { 
	            	/* it prints 
	            	 * A
	            	 * As
	            	 * Ask
	            	 * s
	            	 * sk
	            	 * k
	            	 * as a output*/
	                System.out.println(s1.substring(i, j+1));
	            }
	        }
	}

}
