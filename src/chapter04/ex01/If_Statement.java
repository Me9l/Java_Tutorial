package chapter04.ex01;

public class If_Statement {
	public static void main(String[] args) {
		/*
		--------- 제어문 if ---------
		
		1. Type 1 : 조건이 1개
		- if (조건) { true 일 때 실행 }
		- if (조건) 실행문 ;
		
		
		2. Type 2 : 조건이 2개
		- if (조건) { 
			true 일 때 실행
		  } else {
			false 일 때 실행
		  }
		
		3. Type 3 : 조건이 여러개
		-  if (조건1) {
			 조건1 true 일 때 실행
		   } else if (조건2) {
			 조건2 true 일 때 실행
		   } else if (조건3) {
			 조건3 true 일 때 실행
		   } else {
		     위 조건이 모두 false 일 때 실행
		   }
		
		*/
		
//		조건1개
		int v1 = 2;
		if ( v1 > 1 ) System.out.println("실행 1 : " + (v1>1));
		
		if ( v1 > 1 ) {
			System.out.println("실행 2 : " + (v1>1));
		}
		
//		조건2개
		if ( v1 > 3 ) {
			System.out.println("실행 3" + (v1<3));
		}else {
			System.out.println("실행 4 : " + (v1>3));
		}
		
//		3항연산자
		System.out.println( (v1 < 4) ? "참" : "거짓" );

//		조건>2
		int v2 = 80;
		if ( v2 >= 90 ) {
			System.out.println("A");
		}else if ( v2 >= 80 ){
			System.out.println("B");
		}else if ( v2 >= 70 ) {
			System.out.println("C");
		}else System.out.println("F");
		

//		잘못된 조건 구문
//		if ( v2 <= 60 ) {
//			System.out.println("F");
//		}else if ( v2 >= 70 ){
//			System.out.println("C");
//		}else if ( v2 >= 80 ) {
//			System.out.println("B");
//		}else System.out.println("A");

		/*
		---------- switch ----------
		
		
		
		 */
	}	
		
}
