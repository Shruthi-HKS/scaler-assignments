package scalarassignments;

public class AmazingSubArrays {
	public static void main(String[] args) {
		String A= "MTyDHjYDPhJpunnBEkKsBecemgRUgFDMaZwesCcrUOzbknewbAmhpHnGZRenjBbDlYgcVuHVEGBvFVUklghesvqwVhqbQGGYKmJY";
		
		findAmazingSubArrays(A);
	}
	
	public static int findAmazingSubArrays(String A) {
		int count =0;
		String vowels = "aeiouAEIOU";
		for(int i=0; i<A.length(); i++) {
			for(int j=0; j< vowels.length() ; j++) {
				if(A.charAt(i) == vowels.charAt(j)) {
					count = (count + (A.length() - i)) % 10003;
				}
				
			}
		}
		System.out.println(count);
		return count;
	}
	
	public static int findAmazingSubArrays1(String A) {
        long sum = 0; int n = A.length()-1;
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch=='O' || ch =='U'){
                sum+=n-i+1;
            }
        }
        System.out.println((int)(sum%10003));
        return (int)(sum%10003);
	}
	

}
