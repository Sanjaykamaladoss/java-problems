package sanjay;
import java.util.ArrayList;
import java.util.List;



public class FizzBuzz {
	static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();//it is the Arraylist so we can use some benefits compare to array

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {//check  the both the condition if both conditon is true it print FizzBuzz
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {//if this condition is true it will print Fizz
                answer.add("Fizz");
            } else if (i % 5 == 0) {//if this condition is true it will print Buzz
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println((fizzBuzz(n)));


    }

}
