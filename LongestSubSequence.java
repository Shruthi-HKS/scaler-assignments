package scalarassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LongestSubSequence {
	public static void main(String[] args) {
		int[] A = {2, 1};
		List<Integer> input = new ArrayList<>();
		input = (ArrayList<Integer>) Arrays.stream(A)
				 .boxed().collect(Collectors.<Integer>toList());
		System.out.println(findLongestSubSequence(input));
	}
	
	private static int findLongestSubSequence(List<Integer> A) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int ans  =0;
		//add all elements to hashset
		for(int i=0; i <A.size();i++) {
			hs.add(A.get(i));
		}
		//check each possible sequence start and update the optimal length
		for(int i=0; i <A.size();i++) {
			//if current element is starting of a sequence (check if its consecutive element is there in hashset
			if(!hs.contains(A.get(i) -1)) {
				int j = A.get(i);
				
				while(hs.contains(j)) {
					//if element is already in hashset removing it from hashset will improve the runtime by reducing the execution of this loop for repeatedly for the same item
					
					hs.remove(Integer.valueOf(j));
					j++;
				}
				if(ans < j - A.get(i)) {
					ans = j - A.get(i);
				}
			}
			
			
		}
		return ans;
	}

}
