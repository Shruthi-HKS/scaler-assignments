package scalarassignments;


public class ArrayConsecutive {
public static void main(String[] args) {
	int[] A= {3, 2, 1, 4, 5};
	System.out.println(consecutiveElementsOrNot(A));
	
}

public static int consecutiveElementsOrNot(int[] A) {
	int min = A[0];
	int max = A[0];
	for(int i =0; i <A.length; i++) {
		if(A[i] < min) {
			min = A[i];
		} else if(A[i] > max) {
			max = A[i];
		}
	}
	if(A.length < 1) {
		return 0;
	}
	boolean[] visited = new boolean[A.length];
	if((max- min + 1) == A.length){
		for(int i=0 ; i<A.length; i++) {
			if ( visited[A[i] - min] != false )
				return 0;
				visited[A[i] - min] = true;
		}
		return 1;

}
	return 0;
}
}
