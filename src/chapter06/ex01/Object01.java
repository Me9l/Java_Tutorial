package chapter06.ex01;

import java.util.Scanner;

// 클래스 외부 : 1. 패키지, 2. 임포트 (같은 패키지 내에 존재하지 않는 클래스), 3. 외부클래스
public class Object01 {
	// 클래스 내부
	// 1. 생성자 : 클래스이름과 동일한 메소드(return type이 없다.)
	// 2. 필드
	// 3. 메소드(함수)
	
	// 기본 생성자 (생략 가능)
	public Object01() {}	// 필드의 값 초기화, 객체 생성시 생성자를 호출.

	//필드 : 클래스 객체화를 통해 접근 가능
	int num = 100 ;
	int num1 = 10 ;
	int num2 = 20 ;
	
	// 메소드() : 호출시 작동
	public void plus(int num1,int num2) { // 접근제어자 리턴타입 메소드명(매개변수) {실행코드;}
		System.out.println(num1+num2);
	}

	
	public static void main(String[] args) {
		// Main method 내부
		int num = 10 ;	// 지역변수 ( 메소드 내부에서 선언된 변수 )
		Scanner sc = new Scanner(System.in);
		
		// 1. 객체 생성 : 클래스를 기반으로 메모리에 올라가는 인스턴스.
		// 클래스(설계도)를 통해 만들어지는 객체(결과물)
		
		Object01 obj1 = new Object01();
		//클래스명(타입) 객체(타입변수) = Heap영역에객체생성 생성자호출();
		
		
		// 2. 객체의 필드 값 출력
			System.out.println(obj1.num);	// 객체의 num 필드에 저장된 값
			System.out.println(obj1.num1);	// 객체의 num1 필드에 저장된 값
			System.out.println(obj1.num2);	// 객체의 num2 필드에 저장된 값
//			System.out.println(num1);	// Cannot make a static reference to the non-static field
		// 3. 객체의 메소드 호출
		obj1.plus(1, 2);
		
		
		// 클래스는 객체화를 통해 사용 할 수 있다. 하나의 클래스로 여러개의 객체 생성 가능.
		
		Object01 obj2 = new Object01();
		//객체의 필드 값 수정 및 출력
		
		//메소드 호출
		obj2.plus(obj2.num1, obj2.num2);

		obj2.num1 = 100 ;	// obj2 객체의 num1 필드의 값을 100으로 지정 ( 초기 10 )
		obj2.num2 = 200 ;	// obj2 객체의 num1 필드의 값을 200으로 지정 ( 초기 20 )
		
		//메소드 호출
		obj2.plus(obj2.num1, obj2.num2);
		
	}
}
