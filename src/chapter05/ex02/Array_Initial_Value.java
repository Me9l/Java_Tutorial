package chapter05.ex02;

import java.util.Arrays;

public class Array_Initial_Value {
	public static void main(String[] args) {
		/*
		 * 배열의 초기 값 지정 - 참조자료형 : boolean = false, 정수 = 0, 실수 = 0.0, 문자(char) = "" (공백), String = null
		 */

		// 1. Stack 메모리 값 ( 기본 자료형 값 ) < 초기화 안됨.

		int v1; // 변수 선언
//		System.out.println(v1); // 초기화 하지 않아서 오류 발생.

		int[] v2; // 배열 선언
//		System.out.println(v2);	// heap 영역이 생성되지 않아 오류 발생. ( new int[n] )
		v2 = new int[3]; // heap 영역 할당.
		System.out.println("new int[3] (heap) : " + v2); // 객체의 heap 주소 출력. (16진수)

		System.out.println("v2[0] : " + v2[0]);
		System.out.println("v2[0] : " + v2[1]);
		System.out.println("v2[0] : " + v2[2]);

		//////////////////////////////////

		int[] v3 = null; // 참조 자료형 일때만 객체 주소에 null 할당 가능.
		System.out.println(v3);
		v3 = new int[3];
		System.out.println(v3);

		// 2. Heap 메모리 값 ( 참조 자료형 값 ) < 초기화 됨.
		boolean[] a = new boolean[3];
		System.out.println(a + " : "+a[0]);
		System.out.println(a + " : "+a[1]);
		System.out.println(a + " : "+a[2]);
		
		int[] b = new int[3];
		System.out.println(b+ " : " + b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		double[] c = new double[3];
		System.out.println(c + " : " + c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		char[] d = new char[3];
		System.out.println(d + " : " + d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		String[] e = new String[3];
		System.out.println(e);
		System.out.println(e[1]);
		System.out.println(e[2]);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
	}
}
