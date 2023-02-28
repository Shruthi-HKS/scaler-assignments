package scalarassignments;

public class PickFromBothSides {
	public static void main(String[] args) {
		int[] A = {2, 3, -1, 4, 2, 1 };
		int B = 4;
		maxPointCount(A, B, A.length);
	}
	
	static int maxSum(int[] arr,int K, int start, int end, int max_sum) {
		if(K ==0) {
			return max_sum;
		}
		
		int max_sum_start = max_sum + arr[start];
		int max_sum_end = max_sum + arr[end];
		int ans = Math.max(maxSum(arr, K-1, start+1, end,max_sum_start),
				maxSum(arr, K-1, start, end-1,max_sum_end));
		
		return ans;
		
	}
	
	static void maxmiseSum(int[] arr, int K , int n) {
		int max_sum = 0;
		int start = 0;
		int end = n-1;
		System.out.println(maxSum(arr, K, start, end, max_sum));
	}
	
	static int maxPointCount(int[] arr, int k, int size) {
		int curr_points = 0;
		int max_points = 0;
		
		for(int i=0; i < k; i++) {
			curr_points += arr[i];
			max_points = curr_points;
		}
		int j = size -1;
		
		for(int i= k-1 ; i >=0 ; i--) {
			curr_points = curr_points + arr[j] -arr[i];
			max_points = Math.max(curr_points, max_points);
			j--;
		}
		System.out.println(max_points);
		return max_points;
	}

}
