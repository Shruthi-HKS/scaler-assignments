package scalarassignments;

public class SearchNumberInMatrix {
	public static void main(String[] args) {
		int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		int B = 2;
		search(A,2);
		
	}
	
	private static void search(int[][] A, int B) {
		int n = A.length; int m = A[0].length;int index = 0;int minIndex = 0;
		int i = 0; int j = m-1;
		while(i < n &&  j >=0) {
			if(A[i][j] == B) {
				index = i * 1009 +j;
				System.out.println(i + ","+ j);
				return ;
			} else if (A[i][j] > B) {
				j--;
			}else if(A[i][j] < B) {
				i++;
			}
		}
		return;
	}
	
	public int solve(int[][] A, int B) {
        int n = A.length, m = A[0].length;
        int i = 0 , j = m - 1, ans = -1;
        while(i < n && j >= 0){
            if(A[i][j] > B){
                j--;
            }
            else if(A[i][j] < B){
                i++;
            }
            else{
                for(int k = j ; k >= 0 ; k--){
                    if(A[i][k] == B){
                        ans = ((i + 1) * 1009 + (k + 1));
                    }
                }
                break;
            }
        }
        return ans;
    }

}
