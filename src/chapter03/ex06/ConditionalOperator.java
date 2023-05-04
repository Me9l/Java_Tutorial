package chapter03.ex06;

public class ConditionalOperator {
	public static void main(String[] args) {
		/*
		삼항연산자
		if ~ else 의 축약형
		(조건) ? 참(실행) : 거짓(실행)
		*/
		
		int v1 = ( 3 > 5 ) ? 6 : 9 ;
		System.out.println(v1);  // 9
		int v2 = ( 3 < 5 ) ? 6 : 9 ;
		System.out.println(v2);  // 6

	}

}
