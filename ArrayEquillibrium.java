package scalarassignments;

public class ArrayEquillibrium {
	
	public static void main(String[] args) {
		int A[] = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(findEquillibrium(A));
		
	}
	
	private static int findEquillibrium(int[] A) {
		int[] ps = new int[A.length];
		ps[0] = A[0];
		for(int i=1; i<A.length; i++) {
			ps[i] = ps[i-1] + A[i];
		}
		int sumLeft = 0;
		int sumRight =0;
		for(int i=1; i< A.length; i++) {
			sumLeft = ps[i-1];
			sumRight = ps[A.length -1] - ps[i];
			if(sumLeft == sumRight) {
				return i;
			}
		}
		return -1;
	}

}
