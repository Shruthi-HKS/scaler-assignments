package scalarassignments;

public class LongestConsecutive {
	public static void main(String[] args) {
		String A = "100010111011"; int countOfOne =0;
		char[] charArrayOfA = A.toCharArray();
		int n = charArrayOfA.length;
		//count the number of 1s
		for(int i = 0; i < n; i++) {
			if(charArrayOfA[i] == '1') {
				countOfOne++;
			}
		}
		//create left and right array of same size
		int left[] = new int[n]; int right[] = new int[n]; int maxCount =0; int sum =0;
		//place 0th index of left array
		if(charArrayOfA[0] == '1') {
			left[0] = 1;
		}else {
			left[0] = 0;
		}
		//place n-1th index of right array
		//first and the last element of each array is fixed
		if(charArrayOfA[n-1] == '1') {
			right[0] = 1;
		}else {
			right[0] = 0;
		}
		
		//fill other positions in left array from 1 to n-1
		for(int i = 1; i < n-1; i++) {
			if(charArrayOfA[i] == '1')
			left[i] = left[i-1] + 1;
			else
				left[i] = 0;
		}
		//fill other positions in right array from n-2 to 0
		for(int i = n-2; i >=0; i--) {
			if(charArrayOfA[i] == '1')
				right[i] = right[i+1] + 1;
			else
				right[i] = 0;
		}
		
		// find sum of 0s in the array based on by adding L[i-1] + R[i+1]
		for(int i = 1; i < n-1; i++) {
			if(charArrayOfA[i] == '0')
			sum = left[i-1] + right[i+1]; //calculate the sum of 0s
			if(sum < countOfOne) { // compare the sum with count of 1s
				maxCount = Math.max(maxCount, sum+1); // take the max
			}else {
				maxCount = Math.max(maxCount, sum);
			}
		}
		System.out.println(maxCount);
	}

}
