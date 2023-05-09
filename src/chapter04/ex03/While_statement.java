package chapter04.ex03;

public class While_statement {
	public static void main(String[] args) {
		/*
		----- while -----
		- 반복문 , 조건이 true 인 동안 실행.
		- 조건이 false 가 되면 종료.
		while (condition) {
			//실행할 작업
			//증감식
		}
		*/
		int a = 0 ;						// 초기값
		while ( a < 10 ) {				// 조건
			System.out.println(a) ;		// 실행
			a++ ;						// 증감
		}
		
		/*
		무한루프 주의
		*/
		int i = 1 ;
		boolean bool = true ;
		while ( bool ) {
			System.out.println("무한루프" + i ) ;
			i++ ;
			if ( i == 100 ) break ;
		}
		
	}
}
