package chapter03.ex04;

public class RelationOperator {

	public static void main(String[] args) {
		/*
		관계연산자
		비교연산자 ( > , < , <= , >= )
		등가비교연산자 ( == , != )
		*/
		
//		1. 크기 비교 연산자
		System.out.println("5 > 2 : " + ( 5 > 2 ));
		System.out.println("5 < 2 : " + ( 5 < 2 ));
		System.out.println("5 >= 2 : " + ( 5 >= 2 ));
		System.out.println("5 <= 2 : " + ( 5 <= 2 ));
		System.out.println("--------------");
//		2. 등가 비교 연산자  ( stack 메모리의 값을 비교 , 기본자료형에 사용 )
		
		System.out.println("5 == 2 : " + ( 5 == 2 ));
		System.out.println("5 != 2 : " + ( 5 != 2 ));
		System.out.println("--------------");
		
		int a = 5 ;
		int b = 4 ;
		int c = 3 ;
		
		System.out.println("a == b : " + ( a == b ));
		System.out.println("a != b : " + ( a != b ));
		System.out.println("--------------");
		System.out.println("a == c : " + ( a == c ));
		System.out.println("a != c : " + ( a != c ));

//		3. 참조 자료형일 때 등가 연산자의 비교
		// 변수값은 stack에 저장 되고 heap에 저장된 값의 주소를 가지고 있다.
		// 참조 자료형일 때 heap 에 저장된 값을 비교하려면 equels() 를 사용.
		
		String str1 = new String ("Hi") ;
		String str2 = new String ("Hi") ;
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	
	
	}

}
