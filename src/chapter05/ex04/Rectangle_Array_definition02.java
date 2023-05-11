package chapter05.ex04;

import java.util.Arrays;

public class Rectangle_Array_definition02 {
	public static void main(String[] args) {
		/*
		 *  - 2차원 정방형 배열 선언 방법 3가지
		 */
		// - 배열 선언 방법 1.
		// 1. 선언 후 배열 할당.
		int[][] arr1 ;
		arr1 = new int[3][2];
		
		// 2. 선언하면서 할당.
		int[][] arr2 = new int[3][4];
		
		// 3.
		int arr3[][] = new int[1][2];
		int[] arr4[] = new int[2][3];
		arr4[0][0] = 1;
		arr4[1][1] = 2;
		System.out.println(Arrays.toString(arr4[0]));
		System.out.println(Arrays.toString(arr4[1]));
		
		/////////////////////////////////////////////
		
		// - 배열 선언 방법 2.
		// 1. 선언 후 할당
		int[][] arr5 ;
		arr5 = new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,20,30}};
		
		// 2. 선언하면서 할당.
		int[][] arr6 = new int[][] {{1,2,3,4},{10,20,30,40}};
		
		// - 배열 선언 방법 3.
		int[][] arr7 = {{10,20,30},{11,12,13,14},{21,22,23,24}};
	}

}
