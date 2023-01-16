package scalarassignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int A = 9;
		System.out.println(fibonacci(A));
	}
	
	private static int fibonacci(int A) {
		if( A <= 1) {
			return A;
		} else {
			return fibonacci(A-1) + fibonacci(A-2);
		}
		
	}

}
