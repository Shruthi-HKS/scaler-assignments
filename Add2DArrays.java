package scalarassignments;

public class Add2DArrays {
	public static void main(String[] args) {
		int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int B[][] = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
		//System.out.println(add2DArrays(A, B));
		System.out.println(subtract2DArrays(A, B));
		
	}
	
	public static int[][] add2DArrays(int[][] A, int [][] B){
		int row = A.length, col = A[0].length;
        // Iterating over rows
        for(int i = 0; i < row; i++)
            // Iterating over the columns
            for(int j = 0; j < col; j++)
                A[i][j] += B[i][j];
        return A;
	}
	
	public static int[][] subtract2DArrays(int[][] A, int [][] B){
		int row = A.length, col = A[0].length;
        // Iterating over rows
		int[][] c = new int[row][col];
        for(int i = 0; i < row; i++) {
        	// Iterating over the columns
            for(int j = 0; j < col; j++) {
            	 c[i][j] = A[i][j]-B[i][j];
            }
       }
               
            
        return c;
	}

}
