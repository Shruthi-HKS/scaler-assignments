package scalarassignments;

public class SubArrayWithLeastAverage {

	public static void main(String[] args) {
		int[] A = {3, 7, 5, 20, -10, 0, 12};
		int b= 2;
		System.out.println(findIndexWithLeastAverage(A, b));
		
	}
	
	private static int findIndexWithLeastAverage(int[] A, int B) {
		int sum =0;
		int minSum = 0;
		int outputIndex = 0;
		//sum of all B subarrays
		for(int i = 0; i < B; i++) {
			sum = sum+ A[i];
		}
		//initalize minsum to sum
		minSum = sum;
		//iterate from B through A sliding window technique
		
		for(int i = B; i < A.length; i++) {
			// remove the sum of previous element and add the sum of current element
			sum = sum + A[i] - A[i - B];
			if(sum < minSum) {
				minSum = sum;
				outputIndex = (i -B +1);
			}
		}
		return outputIndex;
	}
}
