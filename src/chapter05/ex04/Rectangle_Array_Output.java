package chapter05.ex04;

import java.util.Arrays;

public class Rectangle_Array_Output {
	public static void main(String[] args) {
		/*
		 * 2차원 - 정방형 배열 출력 - nested for loop - Enhanced for loop - Arrays.toString(배열변수)
		 */

		// 배열 : 행 3, 열 100 ( index : 0 ~ 99 )
		// 0 행 - 1 ~ 100 까지 정수
		// 1 행 - 2 의 배수
		// 2 행 - 3 의 배수

		int[][] arr1 = new int[3][100];
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] = j + 1;
				}
//				for (int j = 0, a = 1; j < arr1[i].length; j++,a++) {
//					arr1[i][j] = a;
//				}
//				System.out.println(Arrays.toString(arr1[i]));
			} else if (i == 1) {
				int val = 2;
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] = val;
					val += 2;
				}
//				System.out.println(Arrays.toString(arr1[i]));
			} else if (i == 2) {
				int val = 0;
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] = val+=3;
				}
//				System.out.println(Arrays.toString(arr1[i]));
			}
		}
		
		// 1. Arrays.Tostring()
//		System.out.println("Arrays.toString(arr1) (배열의 주소) : " + Arrays.toString(arr1));
//		System.out.println("Arrays.toString(arr1[0] (0번행의 값): " + Arrays.toString(arr1[0]));
//		System.out.println("Arrays.toString(arr1[1] (1번행의 값): " + Arrays.toString(arr1[1]));
//		System.out.println("Arrays.toString(arr1[2] (2번행의 값): " + Arrays.toString(arr1[2]));
//		
		// 2. nested for loop
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if( j < (arr1[i].length)-1 ) {
				System.out.print(arr1[i][j] + ", ");
				}else 
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		
		// 3. Enhanced for loop
		
		for (int[] k : arr1) {
			for (int a : k) {
				System.out.print( a + " ");
			}
			System.out.println();
		}
	}
}
