package scalarassignments;

import java.util.Arrays;

public class CheckArithmeticProgression {
	public static void main(String[] args) {
		int[] A = {-113, -70, -14, -8, -29, 5, -94, -44, 23, 9, 13, -132, -14};
		System.out.println(checkAP(A));
	}
	
	private static int checkAP(int[] A) {
		if(A.length == 1) return 1;
		
		Arrays.sort(A);
		
		int difference = A[1] - A[0];
		
		for(int i =2; i < A.length; i++) {
			if((A[i] - A[i-1]) != difference) {
				return 0;
			}
		}
		
		return 1;
	}

}
