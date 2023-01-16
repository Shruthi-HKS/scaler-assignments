package scalarassignments;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		String A = "strings";
		System.out.println(checkPalindrome(A, 0, A.length() -1));
	}
	
	private static int checkPalindrome(String A, int start, int end) {
		if(start >=end) {
			return 1;
		}
		
		if(A.charAt(start) != A.charAt(end)) {
			return 0;
		}
		
		return checkPalindrome(A, start+1, end - 1);
	}

}
