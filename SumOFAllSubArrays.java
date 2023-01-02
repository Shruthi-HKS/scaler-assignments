package scalarassignments;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOFAllSubArrays {
	public static void main(String[] args) {
		int a[] = {2, 1, 3};
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(subarraySum(A));
	}
	
	public static Long subarraySum(ArrayList<Integer> A) {
		Long sum = 0L;
		int startIndex =0;
		int endIndex = 0;
		for(int i=0 ; i< A.size();i++) {
			startIndex = i+1;
			endIndex = A.size() -i;
			sum = sum + A.get(i) * (startIndex * endIndex);
		}
		return sum;
    }

}
