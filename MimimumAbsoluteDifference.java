package scalarassignments;

import java.util.Arrays;

public class MimimumAbsoluteDifference {
	public static void main(String[] args) {
		int A[] = {1, 2, 3, 4, 5};
		System.out.println(findMinimumDifference1(A));
	}
	
	public static int findMinimumDifference(int[] A) {
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i=0; i < A.length; i++) {
			max1 = Math.max(max1, A[i] +i);
			min1 = Math.min(min1, A[i] +i);
			max2 = Math.max(max2, A[i] - i);
			min2 = Math.min(min2, A[i] - i);
		}
		int minAbsDifference = Math.max(max1-min1, max2-min2);
		return minAbsDifference;
	}
	
public static int findMinimumDifference1(int[] A) {
		
	Arrays.sort(A);
    
    // initialize sum
    int minDifferenceFirst = 0;
    int minDiffereceLast = 0;
    int minDifference = 0;
    // min absolute difference for
    // the 1st array element
    minDifferenceFirst = Math.abs(A[0] - A[1]);
     
    // min absolute difference for
    // the last array element
    minDiffereceLast = Math.abs(A[A.length-1] - A[A.length-2]);
    minDifference = Math.min(minDifferenceFirst, minDiffereceLast);
    // find min absolute difference for
    // rest of the array elements and
    // add them to sum
    for (int i = 1; i < A.length - 1; i++) {
    	minDifference	 = Math.min(minDifference, Math.min(Math.abs(A[i] - A[i-1]),
                 Math.abs(A[i] - A[i+1])));
    }
    	
         
    // required sum
    return minDifference;
	}

}
