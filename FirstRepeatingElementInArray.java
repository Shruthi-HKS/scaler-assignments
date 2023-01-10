package scalarassignments;

import java.util.HashMap;
import java.util.Map.Entry;


public class FirstRepeatingElementInArray {
	public static void main(String[] args) {
		int[] A = {10, 3, 3, 4, 3, 5, 6};
		System.out.println(findRepeatingElement(A));
		
	}
	
	private static int findRepeatingElement(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0 ;i < A.length; i++) {
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i])+1);
			} else {
				map.put(A[i], 1);
			}
		}
		for(int i=0; i < A.length; i++) {
			for(Entry<Integer, Integer> e: map.entrySet()) {
				if((A[i]== e.getKey()) &&  e.getValue() > 1) {
					return e.getKey();
				}
			}
		}
		
		return -1;
	}

}
