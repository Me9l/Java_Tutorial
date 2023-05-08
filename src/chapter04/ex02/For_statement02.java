package chapter04.ex02;

public class For_statement02 {
	public static void main(String[] args) {
		/*
			반복문 : for , while , do while
				- 조건이 true 인 동인 반복, false 가 되면 종료.
				- 무한루프 방지를 위한 조건 설정 필요.
		*/
		
//		----- 무한루프
//		1. 조건이 없는 경우
//		
//		for ( int i = 0 ;  ; i ++ ) {
//			System.out.println(i);
//		}
//		
//		2. 초기값, 조건, 증가값 생략 된 경우
//		for (;;) {
//			System.out.println( "H E L P !" );
//		}
//		
//		3. 잘못된 조건 설정
		for ( int i = 1 ; i > 0 ; i++ ) {
			System.out.println(i);
//			if 조건 내에서 break; 문을 사용해 무한루프를 빠져나올 수 있다.
			if (i == 500) break;
		}

		
	}
}
