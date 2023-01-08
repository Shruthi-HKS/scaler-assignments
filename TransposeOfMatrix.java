package scalarassignments;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int A[][] = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} , {7, 8, 9}};
		int rows = A.length; int cols = A[0].length;
		int B[][] = new int[rows][cols], i, j;
		 
        // Function call
      transpose(A, B);

      System.out.print("Result matrix is \n");
      for (i = 1; i < rows; i++) {
          for (j = 1; j < cols; j++)
              System.out.print(B[i][j] + " ");
          System.out.print("\n");
      }
	}
	
    static void transpose(int A[][], int B[][])
    {
        int i, j;
        int rows = A.length; int cols = A[0].length;
        for (i = 1; i < rows; i++)
            for (j = 1; j < cols; j++)
                B[i][j] = A[j][i];
    }

}
