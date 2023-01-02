package scalarassignments;

public class TimeToEquality {
	public static void main(String[] args) {
		int[] a = {2, 5, 1, 3, 2};
		System.out.println(solve(a));
	}
	
	public static int solve(int[] A) {
		int max = A[0];
		int count = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] > max) {
				max = A[i];
			}
		}
		for(int i = 0; i < A.length; i++) {
			count = count + (max - A[i]);
		}
		return count;
    }

}
