package scalarassignments;

public class ReverseStringWordByWord {
	public static void main(String[] args) {
		String s = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv";
		System.out.println(reverseEveryWord(s));
		
	}

	private static void reverse(char[] c, int p1, int p2) {
		while(p1< p2) {
			char temp = c[p1];
			c[p1]= c[p2];
			c[p2] = temp;
			p1++; p2--;
		}
	}
	
	private static String reverseEveryWord(String s) {
		s= s.trim();
		char[] c = s.toCharArray();
		int word_end=0; int word_begin =-1;
		while(word_end<c.length) {
			if((word_begin == -1) && c[word_end] != ' ') {
				word_begin =word_end;
			}
			if(word_end != -1 && (word_end+1 == c.length) || (c[word_end+1] == ' ' )) {
				reverse(c,word_begin,word_end);
				word_begin = -1;
			}
			word_end++;
		}
		reverse(c,0,c.length-1);
		return new String(c);
	}
	
}
