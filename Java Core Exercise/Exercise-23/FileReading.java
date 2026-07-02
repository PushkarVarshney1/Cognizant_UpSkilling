package JavaCoreExercise;
import java.io.*;
public class FileReading {
	public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        String s;
        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
    }
}
