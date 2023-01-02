package scalarassignments;

import java.util.ArrayList;

public class FizzBuzzProblem {
	public static void main(String[] args) {
		System.out.println(returnFizzBuzz(15));
		
	}
	
	private static String[] returnFizzBuzz(int A) {
		ArrayList<String> result = new ArrayList<String>();
		String[] res = new String[] {};
		for(int i= 1; i<= A; i++) {
			if((i%3 ==0) && (i%5 == 0)) result.add("FizzBuzz");
		else if(i %3 == 0) result.add("Fizz");
			else if(i %5 == 0) result.add("Buzz");
			else result.add(Integer.toString(i));
		}
		res = result.toArray(new String[0]);
		return res;
	}

}
