package JavaCoreExercise;

public class TypeCasting {

	public static void main(String[] args) {
		// double to int(Explicit TypeCast)
		
		double num = 91.94268023;
		System.out.println("Number : "+num);
		System.out.println("Explicit : " +(int)num);
		
		// int to double(Implicit TypeCast)
		
		int val = 57;
		System.out.println("Number : "+val);
		System.out.println("Implicit : "+(double)val);
	}

}
