package scalarassignments;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a = {1,1,10};
		System.out.println(solve(a));
		
	}
	
	public static int[] solve(int[] A) {
		
		int i = 0; int j = A.length - 1;
		while( i < j) {
			int temp;
			temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++; j--;
		}
		return A;
    }
	
	public static void swap(int a, int b) {
		a = a ^b;
		b = a ^b;
		a = a ^ b;
	}

}
