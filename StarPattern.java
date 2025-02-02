package sanjay;

public class StarPattern {

	public static void main(String[] args) {
		int rows=7;
		
		for(int i=1;i<=rows;i++) {
			//when i=1 the condition in columns will multiplied by i and subtract by 1 and increasing j
			for(int j=1;j<=(2*i-1);j++) {
				 
				System.out.print(" * ");
			}
			System.out.println();
		}
		// In this step the above process will reversed and print star
		for(int i=rows-1;i>=1;i--) {
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
