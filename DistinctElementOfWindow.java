package scalarassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElementOfWindow {
	public static void main(String[] args) {
		int[] A = {1, 2, 1, 3, 4, 3};
		ArrayList<Integer> input = new ArrayList<>();
		input = (ArrayList<Integer>) Arrays.stream(A)
				 .boxed().collect(Collectors.<Integer>toList());
		System.out.println();
		System.out.println(distinctElementOfWindowSize(input, 3));
		//countDistinct(A,3);
	}

	 public static ArrayList<Integer> distinctElementOfWindowSize(ArrayList<Integer> A, int B) {
		 ArrayList<Integer> result = new ArrayList<Integer>(); 	

	        // Creates an empty hashMap hM
	        HashMap<Integer, Integer> hM
	            = new HashMap<Integer, Integer>();
	 
	        // Traverse the first window and store count
	        // of every element in hash map
	        for (int i = 0; i < B; i++)
	            hM.put(A.get(i), hM.getOrDefault(A.get(i), 0) + 1);
	 
	        // Print count of first window
	        result.add(hM.size());
	 
	        // Traverse through the remaining array
	        for (int i = B; i < A.size(); i++) {
	 
	            // Remove first element of previous window
	            // If there was only one occurrence
	            if (hM.get(A.get(i - B)) == 1) {
	                hM.remove(A.get(i-B));
	            }
	 
	            else // reduce count of the removed element
	                hM.put(A.get(i-B), hM.get(A.get(i-B)) - 1);
	 
	            // Add new element of current window
	            // If this element appears first time,
	            // set its count as 1,
	            hM.put(A.get(i), hM.getOrDefault(A.get(i), 0) + 1);
	 
	            // Print count of current window
	            result.add(hM.size());
	        }
		 return result;
	    }
	 static void countDistinct(int arr[], int K)
	    {
	        // Creates an empty hashMap hM
	        HashMap<Integer, Integer> hM
	            = new HashMap<Integer, Integer>();
	 
	        // Traverse the first window and store count
	        // of every element in hash map
	        for (int i = 0; i < K; i++)
	            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
	 
	        // Print count of first window
	        System.out.println(hM.size());
	 
	        // Traverse through the remaining array
	        for (int i = K; i < arr.length; i++) {
	 
	            // Remove first element of previous window
	            // If there was only one occurrence
	            if (hM.get(arr[i - K]) == 1) {
	                hM.remove(arr[i - K]);
	            }
	 
	            else // reduce count of the removed element
	                hM.put(arr[i - K], hM.get(arr[i - K]) - 1);
	 
	            // Add new element of current window
	            // If this element appears first time,
	            // set its count as 1,
	            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
	 
	            // Print count of current window
	            System.out.println(hM.size());
	        }
	    }
}
