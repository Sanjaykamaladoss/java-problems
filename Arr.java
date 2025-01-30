package sanjay;
import java.util.Scanner;
public class Arr {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter The Array");
		int n=obj.nextInt();
		int m=obj.nextInt();
		int[][] array=new int[n][m];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				array[i][j]=obj.nextInt();
			}	
			
		}
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(array[i][j]==array[1][0]) {
					System.out.print("\n");
				}

				System.out.print("["+array[i][j]+"]");
			}	
			
		}
	}
}
