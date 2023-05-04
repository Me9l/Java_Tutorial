package chapter02.ex04;

public class PrimaryDataType {
	public static void main(String[] args) {
	/*
	자료형
		- 기본 자료형 : RAM Stack(스택) 에 변수명, 변수값 저장
		ㄴ Boolean , 정수 ( byte, short, int, long ) , 실수 ( float, double ), 문자 ( char )
		   정수형 자료형의 기본형 : int ( long 선언 후 변수에 값을 할당할 때 l, L 로 표기 )
		   실수형 자료형의 기본형 : double ( float 선언 후 변수에 값을 할당할 때 f, F 로 표기 )
		
		- 참조 자료형 : RAM Stack(스택) 에 HEAP(힙)의 참조 주소를 갖고, 힙(HEAP) 공간에 값 저장
		ㄴ 객체 ( String ) , 배열 ( Array )
		
		// Literal : 변수에 할당된 값.
		
	*/
//		1 . 논리 자료형 ( boolean = true, false 값만 저장 가능 )
		boolean b1 = true ; // ( 선언과 동시에 값 할당 )
		boolean b2 ;
		b2 = false ;	// ( 선언 후 값 할당 )
		System.out.println(b1);
		System.out.println(b2);
		b2 = true ;
		System.out.println(b2);
		
		final boolean B3 = false ; // 상수선언 ( 값 수정 불가능, 전체 대문자 작명이 관례 )
//		B3 = true ;
		System.out.println("상수 b3 의 값 : " + B3);

//		2 . 정수 자료형 ( byte : 1byte, short : 2byte, int : 4byte , long : 8byte )
//			byte : 1byte = 8bit ( - 2^7 ~ + 2^7-1 = -128 ~ +127 ) 범위의 값 저장 가능 .
		byte v1 = -128 ;
		byte v2 = 127 ;
//		byte v3 = -129 ; // error
//		byte v3 = 128 ; // error
		
//			short : 2byte = 16bit ( - 2^15 ~ + 2^15-1 = -32768 ~ +32767 ) 범위의 값 저장 가능 .
		short v4 = -32768 ;
		short v5 = 32767 ;
//		short v6 = -32769 ; // error
//		short v6 = 32768 ; // error
		
//			int : 4byte = 32bit ( - 2^31 ~ + 2^31-1 = -2,147,483,648 ~ +2,147,483,647 ) 범위의 값 저장 가능 .
		int v7 = -2147483648 ;
		int v8 = 2147483647 ;
//		int v9 = -2147483649 ; // error
//		int v9 = 2147483648 ; // error
		
//			long : 8byte = 64bit ( - 2^63 ~ 2^63-1 = -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 ) 범위의 값 저장 가능 .
//				long 형태 리터럴 값을 넣을 때 l(L) 을 넣어 정의.		
		long v10 = -9223372036854775808L ;
		long v11 = 9223372036854775807L ;
		long v12 = 32770 ;
//		long v12 = -9223372036854775809L ; // error
//		long v12 = 9223372036854775808L ; // error
		System.out.println(v12);
		
//			float :	4byte = 32bit ( - 2^31 ~ + 2^31-1 = -2,147,483,648 ~ +2,147,483,647 ) 범위의 값 저장 가능 .
//		fload : 소수점 7자리 까지 정밀표현 가능
//		double : 소수점 15자리 까지 정밀표현 가능
		
		float val0 = 3.1234567891F ;
		System.out.println(val0);
		double val1 = 1.12345678910111213 ;;
		System.out.println(val1);
		
//		3. 문자 자료형
//			문자 ( char ) : 1글자
//			문자열 ( String ) : 1글자 이상 ( 참조 자료형, 객체 )
//		리터럴에 값 할당 : 따옴표 사용 ( 'a' )
//		특수 문자 : # , ! , % 등등
//		아스키 코드로 값 할당 가능. ( 숫자, 문자, 영문, 특문 )
//		유니코드로 값 할당 가능. ( '\u0041' 등 )
		
		char c1 = 'A';
		char c2 = '가';
		char c3 = '#';
		char c4 = ':';
		char c5 = '1';
		char c6 = 65 ;
//		char c5 = "A"; //error
//		char c5 = 'Aa'; //error
		System.out.println(c1);		 // 리터럴 값 출력
		System.out.println((int)c1); // 영문 : 아스키 코드값을 출력
		System.out.println(c2);
		System.out.println((int)c2); // 한글 : 유니코드 값 출력
		System.out.println(c6); // 아스키코드 숫자로 할당한 변수의 값에 해당하는 문자 출력
		
		char c7 = '\u0041'; //A
		char c8 = '\u0033'; //3
		System.out.println(c7);
		System.out.println(c8);
		
		char na = '\ub0a8' ;
		char ma = '\uad00' ;
		char ea = '\uc6b0' ;
		
		System.out.printf("My name is %s%s%s.",na,ma,ea);
	}
}
