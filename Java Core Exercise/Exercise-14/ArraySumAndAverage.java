package JavaCoreExercise;
import java.util.*;
public class ArraySumAndAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int s = 0;
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            s += a[i];
        }
        double avg = (double)s / n;
        System.out.println("Sum: " +s);
        System.out.println("Average: "+avg);
    }
}
