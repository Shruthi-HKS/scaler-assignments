package scalarassignments;

public class LongestPalindromeString {
	public static void main(String[] args) {
		String input = "aaaabaaa";
		System.out.println(longestPalindrome(input));
	}
	
	private static String expand(String s, int low, int high) {
		
		 while (low >= 0 && high < s.length() && (s.charAt(low) == s.charAt(high))) {
		        low--; high++;       
		    }
		    return s.substring(low + 1, high);
	}
	
	private static String longestPalindrome(String A) {
		if(A.length() == 0) {
			return A;
		}
		
		String maxStr = "";
		String currentStr = null;
		int maxLength = 0;
		int currentLength = 0;
		for(int i = 0; i < A.length(); i++) {
			currentStr = expand(A, i, i);
			currentLength = currentStr.length();
		
		
		if(currentLength > maxLength) {
			maxLength = currentLength;
			maxStr = currentStr; 
		}
		
		currentStr = expand(A, i, i+1);
		currentLength = currentStr.length();
		if(currentLength > maxLength) {
			maxLength = currentLength;
			maxStr = currentStr; 
		}
		
		}
		return maxStr;
	}

}
