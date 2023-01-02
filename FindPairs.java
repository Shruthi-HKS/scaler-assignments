package scalarassignments;

public class FindPairs {
	public static void main(String[] args) {
		int A[] = {1,2,2};
		int B = 4;
		System.out.println(findPairs(A, B));
		
	}
	
	private static int findPairs(int[] A, int B) {
		for(int i =0; i < A.length;i++) {
			for(int j= i+1; j < A.length ;j++) {
				if((A[i] + A[j] == B) && (i!=j)) {
					return 1;
				}
			}
		}
		return 0;
	}

}
