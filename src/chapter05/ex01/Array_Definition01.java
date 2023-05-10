package chapter05.ex01;

public class Array_Definition01 {
	public static void main(String[] args) {
		/*
		 * ----- 자료형 ----- - 자바는 변수명 앞에 반드시 자료형 선언
		 * - 기본자료형 : boolean, 정수 ( byte, short, int, long ), 실수 ( float, double ), 문자 ( char )
		 * - 변수명과 값이 Stack 에 저장.
		 * - 선언시 초기값 할당 불필요.
		 * - 사용시 초기값 할당 필요.
		 * - 첫 문자는 소문자.
		 * - 참조 자료형 : Array, enum, class,
		 * interface - 변수명은 stack에 저장, Heap 영역의 참조 주소값을 저장.
		 * - "==" stack 의 값 ( Heap영역의 참조 주소 ) 을 비교.
		 * - equals() 를 사용하여 값 비교 가능.
		 * - Heap 영역은 반드시 초기값 할당 필요.
		 * - 변수 선언 후 값을 할당 하지 않아도 자동으로 할당.
		 * - [boolean : false], [정수 : 0], [실수 : 0.0] 자동 할당.
		 * 
		 */

//		- Array -
//		- 하나의 배열 변수에 여러개의 값 할당.
//		- 배열의 길이를 반드시 지정해야 한다.
//		- 배열의 길이를 지정하면 변경 불가.
//		- 초기값 할당하지 않아도 자동으로 값 할당.
//		- index 번호는 0 부터. 배열의 길이는 배열.length() 로 조회.

		// 변수선언 : 하나의 값 저장.
		int a = 10, b;
		b = 20;
		System.out.println(a+","+b);
		// 배열선언
		int[] arr1 = new int[3]; // new : 변수 값을 Heap 영역에 저장.
									// int[3] : 배열의 길이 지정.
		System.out.println("arr1[0] 기본값 : " + arr1[0]);
		System.out.println("arr1[1] 기본값 : " + arr1[1]);
		System.out.println("arr1[2] 기본값 : " + arr1[2]); // 일단 0 넣어놓음.
		System.out.println("배열의 길이 : " + arr1.length); // [0,1,2] = 3

		// 배열에 값 할당
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		System.out.println("arr1[0] 할당 값 : " + arr1[0]);
		System.out.println("arr1[1] 할당 값 : " + arr1[1]);
		System.out.println("arr1[2] 할당 값 : " + arr1[2]);

		double[] arr2; // 배열 선언.
		arr2 = new double[5]; // 배열 크기 할당.

		System.out.println("arr2[0] 기본값 : " + arr2[0]); // 0.0
		
		arr2[0] = 10;
		arr2[1] = 10.0;
		arr2[2] = 20.0;
		arr2[3] = 30.0;
		arr2[4] = 40.0;
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2 의 [" + i + "] 번째값 : " + arr2[i] );	
		}
	
		int[] arr3 = new int[100];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = i+1 ;
		}
		
		for ( int i = 0 ; i <= arr3.length; i++) {
			System.out.println(i);
		}
	}
}
