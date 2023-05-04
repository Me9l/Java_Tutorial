package chapter03.ex05;

public class AssignmentOperator {
	public static void main(String[] args) {
		/*
		대입 연산자 ( += , -= , *= /= )
		축약된 표현
		*/
		
		// 대입 연산자의 축약 표현식
		int v1 = 3 ;
		v1 += 3 ; // v1 = v1 + 3 ;
		System.out.println(v1);
		
		int v2 = 10 ;
		v2 -= 15 ;
		System.out.println(v2);
		
		int v3 = 5 ;
		v3 *= 3 ;
		System.out.println(v3);
		
		int v4 = 10 ;
		v4 /= 3 ;
		System.out.println(v4);
	}

}
