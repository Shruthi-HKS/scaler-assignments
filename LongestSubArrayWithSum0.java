package scalarassignments;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubArrayWithSum0 {
	public static void main(String[] args) {
		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		 
        // Function call
        
	}
	
	private static ArrayList<Integer> returnLongestSubsequenceWithSum0(ArrayList<Integer> A) {
		ArrayList<Integer> rst = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(A == null) return rst;
        int len = 0;
        int sum = 0;
        int l = -1, r = -1;
        map.put(0, -1);
        for(int i = 0; i < A.size(); i++){
            sum += A.get(i);
            if(!map.containsKey(sum))
                map.put(sum, i);
            else{
                if(i - map.get(sum) > len){
                    l = map.get(sum) + 1;
                    r = i;
                    len = i - map.get(sum);
                }
            }
        }
        if(l >=0 && r >= 0){
            for(int i = l; i <= r; i++){
                rst.add(A.get(i));
            }
        }
        return rst;
		
	}

}
