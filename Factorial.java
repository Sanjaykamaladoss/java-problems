package sanjay;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
int n = sc.nextInt();
int Factorial=1;
        for (int i = 1; i <=n; i++) {
            Factorial*=i;
            System.out.println("The facotrial of"+" "+n+" "+"is :"+Factorial);

        }

	}

}
