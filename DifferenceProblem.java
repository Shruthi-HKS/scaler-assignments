package scalarassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class DifferenceProblem {
	public static void main(String[] args) {
		int[] A = { 77, 28, 19, 21, 67, 15, 53, 25, 82, 52, 8, 94, 50, 30, 37, 39, 9, 43, 35, 48, 82, 53, 16, 20, 13, 95, 18, 67, 77, 12, 93, 0};
		
		ArrayList<Integer> input = new ArrayList<>();
		 // input.add(1); input.add(5); input.add(4); input.add(1); input.add(2);
		 input = (ArrayList<Integer>) Arrays.stream(A)
		 .boxed().collect(Collectors.<Integer>toList());
		 
		int B = 53;
		System.out.println(differencePossible(input, B));
				
	}
	
	private static int differencePossible(ArrayList<Integer> A, int B) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int a,b=0; 	
		
		for(int i=0; i< A.size(); i++) {
			if(map.containsKey(A.get(i))) {
				map.put(A.get(i), map.getOrDefault(A.get(i), 0)+1);
			} else {
				map.put(A.get(i),1);
			}
			if(B==0 && map.get(A.get(i)) > 1) {
				return 1;
			}
		}
		if(B==0) return 0;
		for(int i=0; i< A.size(); i++) {
			a = A.get(i);
			b = B + A.get(i);
			
			if(map.containsKey(b)) {
				return 1;
			}
		}
		return 0;
		
	}

}
