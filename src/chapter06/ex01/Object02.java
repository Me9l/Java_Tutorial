package chapter06.ex01;

	// 클래스 외부
	// 1. package name
	// 2. import (외부 패키지 클래스)
	// 3. 외부클래스

class A {	// 외부 클래스
	
	// 1. 생성자 : 리턴타입이 없고 클래스이름과 동일한 메소드. 객체 생성시 생성자 호출
	// 생성자는 필드의 값을 초기화 할 때 사용.
	// A(){} : input parameter 가 없는 생성자 = 기본생성자 , 생략가능
	public A(){}//	기본생성자 (생략가능), 생성자가 존재하지 않으면 객체를 생성할 수 없다.
	
	// 2. 필드 : 객체화 해서 사용 ( heap 메모리에 할당 )
	int m = 3 ;
	int n = 7 ;
	double d = 10.5 ;
	
	// 3. 메소드 : 호출시 동작. 필드의 값을 가짐.
	public void print() {
		System.out.printf("m = %d, n = %d, d = %.2f\n",m,n,d);
	}
}

public class Object02 {		//	public class는 1개만 존재.
	// 클래스 영역
	// 1. 생성자
	// 2. 필드
	// 3. 메소드
	// 4. 이너클래스 ( 클래스 내부 클래스 )
	
	
	public static void main(String[] args) {
		// main method (함수)
		int b = 10 ; // 지역변수, method 내에 선언된 변수. (if, switch, for, while, do while)
					// 해당 스코프 내에서만 사용 가능.
					// Stack에 할당.
		
		// 객체 생성 : 클래스의 필드와 메소드를 객체화 해서 RAM에 로드.
		A a = new A();	// new 기본생성자호출();
		
		// 객체의 필드값 출력
		System.out.println("a.m = "+a.m);
		System.out.println("a.n = "+a.n);
		System.out.println("a.d = "+a.d);
		
		// a 객체의 method 호출
		a.print();
		
		// 객체의 필드값 수정 후 출력
		a.m = 300 ;
		a.n = 700 ;
		a.d = 3.14 ;
		a.print();
		
		
		// 하나의 클래스로 여러개의 객체를 생성 할 수 있다.
		A aa = new A();
		aa.print();
		aa.m = 6 ;
		aa.n = 10 ;
		aa.d = 1.11 ;
		aa.print();
	}
}
