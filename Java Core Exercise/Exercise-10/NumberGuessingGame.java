package JavaCoreExercise;
import java.util.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Random number between 1 and 100 ");
		int val = random.nextInt(100 - 1) + 1;
		int guess;
		while(true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > val) {
                System.out.println("Too High! Try Again.");
            }
            else if (guess < val) {
                System.out.println("Too Low! Try Again.");
            }
            else {
                System.out.println("Congratulations! You guessed the number correctly.");
                break;
            }
		}
	}

}
