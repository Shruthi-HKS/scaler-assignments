package scalarassignments;
public class AModBProblem {
	
	public static void main(String[] args) {
		System.out.println(returnMod(5, 10));
	}
	
	public static int returnMod(int A, int B) {
		int m =0;
		if(A > B) {
			m = A-B;
		} else if( B >A) {
			m = B-A;
		}
		return m;
	}

}
