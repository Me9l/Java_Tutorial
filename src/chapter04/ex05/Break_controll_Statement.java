package chapter04.ex05;

public class Break_controll_Statement {
	public static void main(String[] args) {
		/*
		----- break -----
		제어문 ( if, switch ) , 반복문 ( for, while, do while ) 실행을 빠져나오는 키워드
		*/
//		- 단일 Loop 에서 break 로 탈출
//		for ( int i = 0 ; i < 10 ; i++ ) {
//			System.out.println("break 이전 ");
//			if ( i == 5 ) break;	//for문을 빠져나감.
//		//	System.out.println("break 이후 ");
//		}
		
//		- 다중 Loop 일 경우 해당 스코프{} 에서만 탈출
//		for (int i = 2; i < 5; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println( i + " / " + j );
//				if ( j == 5 ) break;
//			}
//			
//		}
		
//		- 다중 Loop 문에서 탈출 : LABEL 사용
		pos : for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println( i + " / " + j );
				if ( j == 2 )
					break pos ;
			}
			
		}
		
//		- 변수값을 이용하여 탈출
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.println( i + " / " + j );
				if ( j == 3 ) {
					i = 10 ;	// 밖의 조건을 false로 만듦
					break ;		// 탈출
				}
			}
			
		}
	}
}
