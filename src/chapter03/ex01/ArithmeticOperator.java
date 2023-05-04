package chapter03.ex01;

public class ArithmeticOperator {

	public static void main(String[] args) {
//		산술연산자 : + , - , * , / , %
//		증감 연산자 : ++ , --
		
//		1. 산술 연산자
		int a = 5 ;
		int b = 10 ;
		
		System.out.println( 2 + 3 );
		System.out.println( a + b );

		System.out.println( 2 + (double)3 ); // 2가 자동으로 double 타입으로 업케스팅
		
		System.out.println(8%5); // 나머지연산자
		System.out.println(8/5); // int type : 몫 구하기
		System.out.println(8/5.0); //double type : 1.6
		
		System.out.println((int)(8/5.0)); // 몫 출력 : 1
		
//		2. 증감 연산자
		int v1 = 1 ;
		System.out.println(v1);
		v1++; // 후위 증가
		--v1; // 전위 감소
		
		int v2 = 3;
		int v3 = ++v2;
		System.out.println(v3);
		
		int v4 = 3;
		int v5 = v4++;
		System.out.println(v5);
		
		System.out.println("-------------------");

		int v6 = 3;
		int v7 = 4;
		int v8 = 2 + v6-- + ++v7 ;
		
		System.out.println(v8); // v6 : 3 , v7 : 5 대입

		int v10 = 30 ;
		int v11 = 40 ;
		int v12 = 50 ;
		
		int v13 = 7 + --v10 + ++v11 + v12-- ;
		System.out.println(v13); // 7+29+49 ;
	}

}
