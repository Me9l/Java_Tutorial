package chapter05.ex04;

import java.util.Arrays;

public class EX02_01 {
	public static void main(String[] args) {
		/*
		 * 2차원 정방형 배열 4행 200열 배열 선언
		 * 0행 : 5의 배수
		 * 1행 : 3의 배수
		 * 2행 : 7, 8 의 배수
		 * 3행 : 4와 7의 공배수
		 */

		// 1. 배열 변수 선언
		int[][] arr1 = new int[4][200];

		// 2. 배열의 각 행에 값 입력
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) { // 5의 배수
				for (int j = 0, f = 0; j < arr1[i].length; j++) {
					arr1[i][j] = f += 5;
//					System.out.print(arr1[i][j] + " ");
				}
//				System.out.println();
			} else if (i == 1) { // 3의 배수
				for (int j = 0, t = 0; j < arr1[i].length; j++) {
					arr1[i][j] = t += 3;
//					System.out.print(arr1[i][j]+" ");
				}
//				System.out.println();
			} else if (i == 2) { // 7, 8 의 배수
				for (int j = 0, val = 1; j < arr1[i].length; val++) {
					if (val % 7 == 0 || val % 8 == 0) {
						arr1[i][j] = val;
						j++;
					}
				}
//				System.out.println(Arrays.toString(arr1[i]));
			} else if (i == 3) { // 4, 7 의 공배수
				for (int j = 0, val = 1; j < arr1[i].length; val++) {
					if (val % 4 == 0 && val % 7 == 0) {
						arr1[i][j] = val;
						j++;
					}
				}
//				System.out.println(Arrays.toString(arr1[i]));
			}
		}

		// 3. 출력 ( for, Enhanced for , Arrays.toString() )
		
		// nested for
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
//				System.out.print(arr1[i][j] + " ");
			}
//			System.out.println();
		}
		
		// Enhanced for
		for (int[] i : arr1) {
			for (int j : i) {
//				System.out.print(j+" ");
			}
//			System.out.println();
		}
		
		// Arrays.toString()
		for (int i = 0 ; i < arr1.length; i++){
				System.out.println(Arrays.toString(arr1[i]));
		}
		
	}
}
