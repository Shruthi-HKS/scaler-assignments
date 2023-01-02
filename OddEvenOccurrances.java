package scalarassignments;

public class OddEvenOccurrances {

	public static void main(String args[]) {
		int a[] = {};
		System.out.println(countEvenOddOccurances(a));
		
	}
	
	public static int countEvenOddOccurances(int[] a) {
		int evenCount =0;
		int oddCount = 0;
		int diff =0;
		for(int i =0; i< a.length; i++) {
			if((a[i] & 1) == 1) {
				oddCount++;
			}else {
				evenCount++;
			}
		}
		diff = oddCount - evenCount;
		if(diff <0) {
			diff = diff * -1;
		}
		return diff;
	}
}
