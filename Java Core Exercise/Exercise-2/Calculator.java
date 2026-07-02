package JavaCoreExercise;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long one = sc.nextLong();
		long two = sc.nextLong();
		System.out.println("Choose an aperation to perform");
		String operation = sc.next();
		if(operation.equalsIgnoreCase("Addition")) {
			long ans = one + two;
			System.out.println(ans);
		}
		else if(operation.equalsIgnoreCase("Subtraction")) {
			long ans = one - two;
			System.out.println(ans);
		}
		else if(operation.equalsIgnoreCase("Multiplication")) {
			long ans = one * two;
			System.out.println(ans);
		}
		else if(operation.equalsIgnoreCase("Division")) {
		    if(two == 0) {
		        throw new ArithmeticException("/ by zero");
		    }
		    double ans = (double)one / two;
		    System.out.println(ans);
		}
		else {
		    System.out.println("Invalid Operation");
		}
	}

}
