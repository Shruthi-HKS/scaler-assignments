package scalarassignments;

public class DivisibleBy8 {

	public static void main(String[] args) {
		System.out.println(isDivisibleBy8CorrectSolution("40897237111816995922805307737859413552091006514927603847883130124746756767426237849396480087733429432861339411285568084588535007444731"));
		System.out.println(isDivisibleBy8CorrectSolution("76952"));
	}
	
	private static int isDivisibleBy8(String A) {
		Integer intOfA = Integer.valueOf(A);
		if(intOfA % 8 == 0) {
			return 1;
		}
		return 0;
	}
	
	private static int isDivisibleBy8CorrectSolution(String A) {
		int n = A.length();
		int mod = 0;
		if(n== 0) {
			return 0; // empty string
		}
		
		if(n==1) {
			mod = (A.charAt(0) - '0') % 8 ;
			if(mod == 0) return 1;
		}
		
		if( n== 2) {
			mod = (((A.charAt(n-2) - '0') * 10) +(A.charAt(n-1) - '0')) % 8 ;
			if(mod == 0) return 1;
		}
		//if we take last 3 digits in consideration
		if(n >= 3) {
			int last = A.charAt(n-1) - '0';
			int secondLast = A.charAt(n-2) - '0';
			int thirdLast = A.charAt(n-3) - '0';
			mod = thirdLast * 100 + secondLast * 10 + last;
			if(mod % 8 == 0) return 1;
		}
		
		return 0;	
	}
}
