package scalarassignments;

import java.util.ArrayList;
import java.util.Arrays;


public class LeaderElementsInArray {
	public static void main(String[] args) {
		int a[] = {93, 57, 83, 41, 100, 10, 79, 27, 94, 22, 4, 96, 48, 18, 89, 37, 21, 5, 46, 81, 15, 30, 47, 23, 34, 65, 55, 9, 36, 20, 54, 17, 7, 56, 78, 84, 87, 97, 16, 69, 28, 11, 44, 49, 8, 25, 98, 75, 53, 62, 19, 24, 80, 68, 50, 91, 1, 86, 77, 14, 72, 66, 42, 63, 73, 45, 31, 61, 85, 64, 35, 32, 92, 71, 74, 3, 99, 52, 90, 43, 6, 40, 38, 2, 12, 59, 29, 82, 76, 60, 67, 13, 70, 58, 39, 33, 95, 88, 51, 26};
		System.out.println(findLeaderElements1(a));
		
	}
	
	private static int[] findLeaderElements(int[] A){
		ArrayList<Integer> c = new ArrayList<Integer>();
		for(int i = 0; i <A.length ; i++) {
			int sum = 0;
			for(int j = i+1; j <A.length ; j++) {
				sum += A[j];
			}
			if(A[i] > sum) {
				c.add(A[i]);
			}
		}
		// int[] result = c.stream().mapToInt(i->i).toArray();
		int[] result = new int[c.size()];
		int index = 0;
		for(int value: c) {
			result[index++] = value;
		}
		return result;
	}
	
	private static int[] findLeaderElements1(int[] A) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		int n = A.length;
		int last = A[n -1];
		c.add(last);
		for(int i = n - 2; i >0; i-- ) {
			if(A[i] > last) {
				last = A[i];
				c.add(A[i]);
			}
		}
		System.out.println(c);
		int[] result = new int[c.size()];
		int index = 0;
		for(int value: c) {
			result[index++] = value;
		}
		return result;
	}

}
