package scalarassignments;

public class ModStringProblem {
	
	public static void main(String[] args) {
		System.out.println(returnModOfString("842554936302263", 41));
		System.out.println(returnModOfString2("842554936302263", 41));
	}
	
	private static int returnModOfString(String A, int B) {
		int mod = 0;
		for(int i=0; i < A.length(); i++) {
			mod = (mod * 10 + A.charAt(i) - '0') % B;
		}
		return mod;
	}
	
	private static int returnModOfString2(String A, int B) {
		int mod = 0;
		for(int i=0; i < A.length(); i++) {
			mod = mod * 10;
			int x = Character.getNumericValue(A.charAt(i));
			mod = mod + x;
			mod %= B;
		}
		return mod;
	}

}
