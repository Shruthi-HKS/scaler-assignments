package scalarassignments;

import java.util.Scanner;

public class RecursiveReverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		System.out.println(reverse(S));
	}
	
	private static String reverse(String S) {
		if(S.length() == 1) {
			return S;
		}
		return S.charAt(S.length() -1) + reverse(S.substring(0, S.length() -1));
	}
	

}
