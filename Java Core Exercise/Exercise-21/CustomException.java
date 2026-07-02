package JavaCoreExercise;
import java.util.*;
public class CustomException {
	
    static void check(int a) throws InvalidAgeException {
        if(a < 18) {
            throw new InvalidAgeException("Invalid Age");
        }
        System.out.println("Valid Age");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        try {
            check(a);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}