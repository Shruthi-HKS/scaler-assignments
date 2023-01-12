package scalarassignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class CommonElements {
	public static void main(String[] args) {
		int[] A = {2, 1, 4, 10};
		int[] B = {3, 6, 2, 10, 10};
		System.out.println(printCommonElements(A, B));
	}
	
	private static ArrayList<Integer> printCommonElements(int[] A, int [] B) {
		HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
        for(int x: A){
            a.put(x, a.getOrDefault(x, 0)+1);
        }
        for(int x: B){
            b.put(x, b.getOrDefault(x, 0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int k: a.keySet()){
            if(b.containsKey(k)){
                for(int i = 0; i < Math.min(a.get(k), b.get(k)); ++i){
                    ans.add(k);
                }
            }
        }
        return ans;
    }

}
