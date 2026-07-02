package JavaCoreExercise;
import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String r = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(r));
    }
}
