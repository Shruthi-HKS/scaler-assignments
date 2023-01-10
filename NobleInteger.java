package scalarassignments;

import java.util.Arrays;
import java.util.Collections;

public class NobleInteger {
	public static void main(String[] args) {
		int[] A = {1, 1, 3, 3};
		System.out.println(findNobleInteger(A));
		
	}
	
	private static int findNobleInteger(int[] A) {
		int c[] = new int[A.length];
		Arrays.sort(A);
		for (int i = 0, j = A.length - 1, tmp; i < j; i++, j--) {
            tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
		c[0] = 0;
		if(A[0] == 0) return 1;
		for(int i=1; i < A.length; i++) {
			if(A[i] == A[i-1]) {
				c[i] = c[ i-1];
			}
			else {
				c[i] = i;
			}
			if(c[i] == A[i]) {
				return 1;
			}
		}
		return -1;
	}

}
