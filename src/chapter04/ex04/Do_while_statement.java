package chapter04.ex04;

import java.util.Scanner;

public class Do_while_statement {
	public static void main(String[] args) {
		/*
		----- do while -----
		초기값
		do {
			something
		} while ( condition ) ;
		
		- 조건 false , 첫 1회는 실행됨.
		*/
//		int i = 0 ;
//		do {
//			System.out.println(i);
//			i++;
//		} while ( i == 0 ) ;
//		
//		System.out.println("-= while =-");
//		
//		int a = 0 ;
//		
//		while (a < 0) {
//			System.out.println(a + ": while");
//		}
//		do {
//			System.out.println(a + ": do while");
//		}while ( a < 0 );
//		
		
		/*
		- do while 루프를 이용한 예시.
		*/
		int input ;
		Scanner sc = new Scanner( System.in );
		do {
			System.out.println("=========================================");
			System.out.println("1. 평균출력 | 2. 합계출력 | 3. 이름출력 | 4. 종료");
			System.out.println("=========================================");
			input = sc.nextInt();
			
			if ( input == 1 ) System.out.println("평균 출력\n");
			else if ( input == 2 ) System.out.println("합계 출력\n");
			else if ( input == 3 ) System.out.println("이름 출력\n");
			else if ( input == 4 ) { System.out.println("프로그램 종료."); break; }
		} while ( input != 4 );
		sc.close();
	}
}
