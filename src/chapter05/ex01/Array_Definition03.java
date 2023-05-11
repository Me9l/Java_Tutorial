package chapter05.ex01;

public class Array_Definition03 {
	public static void main(String[] args) {
		/*
		 * 1차원 배열
		 */
		
		// 1.
		int[] arr1 ;		// 배열 선언
		arr1 = new int[3];	// 배열 생성
		
		int[] arr2 = new int[3]; // 선언 및 생성
		
		int arr4[];			// 배열 선언
		arr4 = new int[3];	// 배열 생성
		
		int arr3[] = new int[3]; // 선언 및 생성

		///////////////////////
		
		// 2.
		int[] arr5 = new int[] {0,1,2};	// 배열 선언 및 생성, 값 할당.
		
		int[] arr6 ;					// 배열 선언
		arr6 = new int[] {10,20,30};	// 생성, 값 할당.
		
		// 3.
		int[] arr7 = {100,200,300};
		int[] arr8 ;
//		arr8 = {100,200,300} ;	//	error
		arr8 = new int[] {100,200,300};

	}
}
