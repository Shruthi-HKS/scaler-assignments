package scalarassignments;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateProblem {
	public static void main(String[] args) {
		int  A[] = {1, 10, 20, 1, 25, 1, 10, 30, 25, 1};
		System.out.println(solve(A));
	}
	
	public static int solve(final int[] A) {
        int count =0;
        int redundant = 0;
        HashMap<Integer,Integer> mapCount = new HashMap<Integer,Integer>();
        for(int i=0; i< A.length ; i++){
            if(mapCount.containsKey(A[i])){
                mapCount.put(A[i], mapCount.get(A[i]) + 1);
            }else{
                mapCount.put(A[i], 1);
            }
        }

        for(Entry<Integer, Integer> e : mapCount.entrySet()){
            if(e.getValue() > 1){
                redundant = redundant + (e.getValue() -1); 
            }
        }
        return redundant;
    }

}
