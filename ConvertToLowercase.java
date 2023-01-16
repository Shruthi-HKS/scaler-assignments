package scalarassignments;

import java.util.ArrayList;

public class ConvertToLowercase {
	public static void main(String[] args) {
		char[] ch = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'}; 
		System.out.println(isAlphabetic(ch));
		
	}
	public static char[] to_lower(char[] A) {
		for(int i = 0; i <A.length; i++) {
			if(Character.isLowerCase(A[i])) {
				A[i] ^= (1 << 5);
			}
		}
		return A;
	}
	
	public static int isAlphabetic(char[] A) {
		for(int i = 0; i <A.length; i++) {
			char c = A[i];
			if (!(c >= 'A' && c <= 'Z') &&
                    !(c >= 'a' && c <= 'z') &&
                    !(c >= '0' && c <= '9')) {
				return 0;
			}
		}
		return 1;
	}
}
