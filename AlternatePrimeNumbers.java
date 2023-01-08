package interviewpractice;

public class AlternatePrimeNumbers {
	public static void main(String[] args) {
		int num = 20;
		printPrimeNumbers(num);
	}
	
	private static boolean isPrime(int num) {

		for(int i=2 ; i <= num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static void printPrimeNumbers(int num) {
		int counter = 2;
		for(int i = 2; i < num ;i++) {
			if(isPrime(i)) {
				if(counter % 2 ==0) {
					System.out.println(i);
				}
				counter++;
			}
		}
	}

}
