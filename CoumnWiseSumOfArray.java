package scalarassignments;

public class CoumnWiseSumOfArray {
	public static void main(String[] args) {
		int A[][] = new int[][]{{1,2,3,4}, {5,6,7,8},{9,2,3,4}};
		int result[] = findSumOfCoumns(A);
		for(int res: result) {
			System.out.print(res+ " ");
		}
	}
	
	private static int[] findSumOfCoumns(int[][] A) {
		
		int rows = A.length;
		int cols = A[0].length;
		int index =0;
		int result[] = new int[A[index].length];
		for(int j=0; j < cols; j++) {
			int sum =0 ;
			for(int i=0; i <rows; i++) {
				sum += A[i][j];
			}
			result[index] = sum; 
			index++;
		}
		return result;
	}

}
