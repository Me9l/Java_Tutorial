package chapter05.ex04;

import java.util.Arrays;

public class EX01_02 {
	public static void main(String[] args) {
		/*
		 * arr1 : 4행 100열 
		 * arr1[0] : 10의 배수 저장 
		 * arr1[1] : 3의 배수 저장 
		 * arr1[2] : 3의 배수, 6의배수가 아닌 수 저장 
		 * arr1[3] : 7의 배수, 8의배수 저장
		 */

		int[][] arr1 = new int[4][100];
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {									// 10의 배수 저장.
				for (int j = 0, a = 10 ; j < arr1[i].length; j++) {
					arr1[i][j]= a;
					a+=10;
				}
					System.out.println("arr1[0]\n" + Arrays.toString(arr1[i]));
			} else if (i == 1) {							// 3의 배수 저장.
				for (int j = 0, a = 3 ; j < arr1[i].length; j++) {
					arr1[i][j]= a;
					a+=3;
				}
					System.out.println("arr1[1]\n" + Arrays.toString(arr1[i]));
			} else if (i == 2) {							// 3의 배수 && !6의 배수
				for (int j = 0,a = 3; j < arr1[i].length; a+=3) {
					if ( a % 6 == 0 ) continue;
					arr1[i][j] = a;
					j++;
				}
					System.out.println("arr1[2]\n" + Arrays.toString(arr1[i]));
			} else if (i == 3) {							// 7의 배수 || 8의 배수
				for (int j = 0, a = 1; j < arr1[i].length; a++) {
					if ( a % 7 == 0 || a % 8 == 0) {
						arr1[i][j] = a;
						j++;
					}
				}
			}
					System.out.println("arr1[3]\n" + Arrays.toString(arr1[i]));
		}
	}
}
