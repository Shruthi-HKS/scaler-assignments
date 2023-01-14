package scalarassignments;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithGivenSum {
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(5);
		input.add(10);
		input.add(20);
		input.add(100);
		input.add(105);
		int B = 110;
		System.out.println(findSubArrayWithGivenSum(input, B));
		System.out.println(findSubArrayWithGivenSum1(input, B));
	}
	
	private static ArrayList<Integer> findSubArrayWithGivenSum(ArrayList<Integer> A, int B){
		int currentSum = A.get(0);
		int start = 0;
		int i = 0;
		ArrayList<Integer> result = new ArrayList<>();
		for(i = 1; i <= A.size(); i++) {
			//if currentsum exceeds B remove the starting element from current sum 
			while(currentSum > B && start < i-1) {
				currentSum = currentSum - A.get(start);
				start++;
			}
			//if current sum is equal to sum pick the indexes of start and i-1 to get continuous array
			if(currentSum == B) {
				int p = i-1;
				System.out.println(
	                    "Sum found between indexes " + start
	                    + " and " + p);
				//loop from start to p and add to result array
				for(int j=start; j <= p; j++) {
					result.add(A.get(j));
				}
				return result;
				
			}
			// add the current element to sum
			if(i < A.size()) {
				currentSum = currentSum + A.get(i);
			}
			
		}
		result.add(-1);
		return result;
	}
	
	private static ArrayList<Integer> findSubArrayWithGivenSum1(ArrayList<Integer> A, int B){
		int currentSum = 0; int start = 0; int end = -1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0; i < A.size(); i++) {
			//cumulative sum of array elements
			currentSum = currentSum + A.get(i);
			//if currensum - givensum is 0 then break the loop as subarray is starting from index 0
			if(currentSum -B ==0) {
				start = 0;
				end = i;
				break;
			}
			//if map contains currentsum- sum value then subarray has the sum value so stop and assign start and end index values
			if(map.containsKey(currentSum - B)) {
				start = map.get(currentSum - B)+1;
				end =i;
				break;
			}
			//else put the current sum value and the index in the map
			map.put(currentSum, i);
			
		}
		
		for(int i = start; i <= end; i++) {
			result.add(A.get(i));
		}
		if(result.isEmpty()) {
			result.add(-1);
		}
	
		return result;
		
	}

}
