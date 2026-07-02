package JavaCoreExercise;

public class Order_Precedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 10 + 20 * 3 - 8 / 2 % 3;
		System.out.println(result);
		System.out.println(
		            "Explanation: Java follows operator precedence. "
		            + "\nFirst '*', '/', and '%' are evaluated from left to right. "
		            + "\n20 * 3 = 60, 8 / 2 = 4, and 4 % 3 = 1. "
		            + "\nThe expression becomes 10 + 60 - 1. "
		            + "\nThen '+' and '-' are evaluated from left to right, giving the final result 69."
		 );
	}

}
