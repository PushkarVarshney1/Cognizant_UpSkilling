package JavaCoreExercise;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Enter a year
		int n = sc.nextInt();
		if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
			System.out.println("Given Year is Leap");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}

}
