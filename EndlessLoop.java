package sanjay;

public class EndlessLoop {

	public static void main(String[] args) {
		System.out.println("Using For Loop");
		for(int i=0;i<0;i++) {
			System.out.println("hello world");
		}
		System.out.print("********************");
		
		System.out.println("Using While Loop");
		 int j=0;
		 while(true) {
		System.out.println("world");
		j++;
		 }

	}

}
