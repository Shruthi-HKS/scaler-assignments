package scalarassignments;

import java.util.Scanner;

public class RotateArrayNTimes {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int n =5;
		int b = 3;
		reverse(a, 0, n-1);
		reverse(a,0, b-1);
		reverse(a,b, n-1);
		for(int i=0; i< a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	private static int[] rotateArray(int[] a, int n, int b) {
		int last = 0;
		for(int i=0 ; i<b ;i++) {
			last = a[n-1];
			for(int j= n-1; j >0; j--) {
				a[j]= a[j-1];
			}
			a[0] = last;
		}
		
		return a;
	}
	
	private static int[] rotateArray1(int[] a, int b) {
		int n = a.length;
		b = b%n;
		int[] c = new int[n];
		for(int i = 0; i <n -1; i++) {
			int newIndex = (i+b) % n;
			c[newIndex] = a[i];
		}
		return c;
	}
	
	public static void reverse(int[] A, int start, int end) {
        int i, j;
        for (i = start, j = end; i < j; i++, j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

}
