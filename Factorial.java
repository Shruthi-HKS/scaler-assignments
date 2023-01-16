package scalarassignments;

public class Factorial {
	public static void main(String[] args) {
		int A = 1;
		System.out.println(fact(A));
	}
	
	private static int fact(int A) {
		if(A == 0) return 1;
		return A*fact(A-1);
	}

}
