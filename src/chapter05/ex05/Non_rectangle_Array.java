package chapter05.ex05;

import java.util.Arrays;

public class Non_rectangle_Array {
	public static void main(String[] args) {
		/*
		 * 2차원 배열
		 * - 정방형 : 각 행에 대한 열의 갯수가 같은 배열
		 * - 비정방형 : 각 행에 대한 열의 갯수가 다른 배열
		 *  1. 비 정방형 배열 선언
		 *  	- 배열 변수를 생성시 행의 인덱스만 지정 후, 나중에 각 행에 대한 열의 인덱스 지정.
		 */
		
		int[][] arr1 = new int[3][];
		arr1[0] = new int[3];	// 0번 행 열의 수 : 3
		arr1[1] = new int[4];	// 1번 행 열의 수 : 4
		arr1[2] = new int[5];	// 2번 행 열의 수 : 5
		

		//직접 값 할당
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		
		arr1[1][0] = 10;
		arr1[1][1] = 20;
		arr1[1][2] = 30;
		arr1[1][3] = 40;
		
		arr1[2][0] = 10;
		arr1[2][1] = 20;
		arr1[2][2] = 30;
		arr1[2][3] = 40;
		arr1[2][4] = 50;
		
		//arrays.toString() ;
		System.out.println("arr1[0] : " + Arrays.toString(arr1[0]));
		System.out.println("arr1[1] : " + Arrays.toString(arr1[1]));
		System.out.println("arr1[2] : " + Arrays.toString(arr1[2]));
		
		
		int[][] arr2 = new int[3][];	// 비 정방형 배열 선언.
		arr2[0] = new int[100];			// 10의 배수 입력
		arr2[1] = new int[200];			// 20의 배수 입력
		arr2[2] = new int[150];			// 30의 배수 입력

		System.out.println("arr2.length : " + arr2.length);	// arr2 행의 length (열의 갯수) 출력 // 3
		System.out.println("arr2[0].length : " + arr2[0].length); // 0번  행의 length (열의 갯수) 출력 // 100 
		System.out.println("arr2[1].length : " + arr2[1].length); // 1번  행의 length (열의 갯수) 출력 // 200
		System.out.println("arr2[2].length : " + arr2[2].length); // 2번  행의 length (열의 갯수) 출력 // 150
		
		// arr2 각 행에 값 저장
		for (int i = 0; i < arr2.length; i++) {
			
			if ( i == 0 ) {			// 10의 배수
				for (int j = 0, a = 10 ; j < arr2[i].length; j++, a+=10 ) {
					arr2[i][j] = a ;
				}
				
			}else if ( i == 1 ) {	// 20의 배수
				for (int j = 0, a = 20 ; j < arr2[i].length; j++, a+=20 ) {
					arr2[i][j] = a ;
				}
				
			}else if ( i == 2 ) {	// 30의 배수
				for (int j = 0, a = 30 ; j < arr2[i].length; j++, a+=30 ) {
					arr2[i][j] = a ;
				}
			}
		}
		
		// nested for 출력
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// Enhanced for 출력
		
		for (int[] j : arr2) {
			for (int k : j) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		// Arrays.toString()
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		/////////////////////////////////////////////////////////////////////
		
		// arr2 간략화
		int[][] arr3 = new int[3][];
		arr3[0] = new int[5];
		arr3[1] = new int[10];
		arr3[2] = new int[15];
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				if ( i == 0 ) {
					arr3[i][j] = (j+1) * 10;
				}else if ( i == 1 ) {
					arr3[i][j] = (j+1) * 20;
				}else if ( i == 2 ) {
					arr3[i][j] = (j+1) * 30;
				}
			}
		}
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
