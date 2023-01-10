package scalarassignments;

import java.util.HashSet;
import java.util.Set;


public class SubArrayWith0Sum {
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5};
		System.out.println(checkIfSubarrayContainsZer(A));
		
	}
	
	private static int checkIfSubarrayContainsZer(int[] A) {
		int[] ps = new int[A.length];
		ps[0] = A[0];
		Set<Integer> distinctElements = new HashSet<Integer>();
		for(int i =1; i < A.length; i++) {
			if(A[i] == 0) return 1;
			ps[i] = ps[i-1] +A[i];
		}
		for(int i=0; i <ps.length; i++) {
			if(ps[i] == 0) return 1;
			distinctElements.add(ps[i]);
		}
		
		if(distinctElements.size() < A.length) {
			return 1;
		}
			
		
		return 0;
			
	}

}
