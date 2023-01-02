package scalarassignments;

public class SpecialIndex {
	public static void main(String[] args) {
		int[] A = {1, 1, 1};
		System.out.println(findSpecilIndex(A));
		
	}
	
	public static int findSpecilIndex(int[] A) {
		int n = A.length;
		int[] odd = new int[n];
		int[] even = new int[n];
		int count = 0;
		even[0] = A[0];
		//prefix sum of odd and even arrays
		for(int i=1; i< n; i++) {
			even[i] = even[i-1];
			odd[i] = odd[i-1];
			if(i%2 == 0) {
				even[i] += A[i];
			} else {
				odd[i] += A[i];
			}
		}
		int p = odd[n-1];
		int q = even[n-1] -A[0];
		if(p==q) {
			count++;
		}
		for(int i=1; i<n; i++) {
			if(i%2 == 0) {
				p = even[n-1] - even[i-1] - A[i] + odd[i-1];
				q = odd[n-1] -odd[i-1] + even[i-1];
			}else {
				q = odd[n-1]-odd[i-1] - A[i] + even[i-1];
				p = even[n-1]-even[i-1] + odd[i-1];
			}
			if(p==q) {
				count++;
			}
		}
		return count;
	}

}
