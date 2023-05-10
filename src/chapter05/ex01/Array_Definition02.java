package chapter05.ex01;

public class Array_Definition02 {
	public static void main(String[] args) {
		/*
		 * --- 배열선언 ---
		 */

//		1. 선언과 동시에 할당 // 배열의 크기 지정 X
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		// 출력1. (for)
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// 출력2. (Enhanced for)
		for (int arr1num : arr1) {
			System.out.print(arr1num + " ");
		}
		System.out.println();

//		2. 선언과 동시에 할당 2
		int[] arr2 = { 10, 20, 30, 40, 50 };

		// 출력1. (for)
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		// 출력2. (Enhanced for)
		for (int arr2num : arr2) {
			System.out.print(arr2num + " ");
		}
		System.out.println();

	
	}
}
