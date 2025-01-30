package sanjay;

public class PerfectNumber {

	public static void main(String[] args) {
		int num1 = 28;
        int num2 = 7;

        System.out.println(num1 +" Is a perfect number :"+factor(num1));
        System.out.println(num2 +" Is a perfect number :"+factor(num2));
    }

     static boolean factor(int num) {

        if (num<=1) // it checks that number is greater than 1
            return false;

        int sum = 0;
//loop is used to check half the number of num
        for (int i=1;i<=num/2;i++) {
            if (num%i==0) {
                sum = sum+i;
            }
        }

        return sum==num;

	}

}
