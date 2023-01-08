package scalarassignments;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAntiDiagonal {
	public static void main(String[] args) {
		int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		printDiagonal1(A);
	}
	
	private static void returnAntiDiagonals(int[][] A){
		int N = A.length; int M = A[0].length;
		int c[][] = new int[N][M];
		for(int j=0; j< M; j++) {
			printDiagonal(0, j, N, M, A);
		}
		for(int j=1; j< N-1 ; j++) {
			printDiagonal(j, M-1, N, M, A);
		}
	}
	
	private static void printDiagonal(int startIndex, int endIndex,int N, int M, int[][] A) {
		while(startIndex < N && endIndex >=0) {
			System.out.print(A[startIndex][endIndex]
					+ " ");
			startIndex++; endIndex--;
		}
	}
	//simple approach
	
	private static void printDiagonal1(int[][] a) {
		int n = a.length;
		int sizeOfSum = 2 * n -1;
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for(int i=0; i< sizeOfSum ; i++) {
			result.add(new ArrayList<Integer>());
		}
		//push each element in the result arraylist
		for(int i=0; i < n; i++) {
			for(int j =0; j<n; j++) {
				result.get(i+j).add(a[i][j]);
			}
		}
		
		//print the diagonals
		for(int i = 0; i < result.size() ;i++) {
			System.out.println();
			for(int j=0; j< result.get(i).size(); j++) {
				System.out.print(result.get(i).get(j) + " ");
			}
		}
			
	}

}
