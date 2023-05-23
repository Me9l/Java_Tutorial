package chapter09.ex05;

class A {
	int a ;
	
	// 다른 생성자가 존재하지 않을 경우 기본 생성자는 생략 가능.
	// 자식 클래스를 생성 할 때 부모 클래스에 기본 생성자 외 다른 생성자가 존재하면 기본 생성자를 명시해야함.
	A(){}
	A (int a) {
		this.a = a;
	}
}

class B extends A{
	// 자식 클래스는 객체화 할 때 부모 클래스의 생성자를 호출. ( A(){} )
	B(){super();}
}

public class Super_Keyword01 {

	public static void main(String[] args) {
		/*
		 * this keyword	: field, method 이름 앞에 this를 사용해서 자신 객체의 필드나 메소드를 호출.
		 * this() 	: 생성자 내부에서 사용. 생성자 첫 라인에 위치, 자신 객체의 다른 생성자 호출 할 때 사용.

		 * super keyword : field, method 이름 앞에 super를 사용해서 부모 객체의 필드나 메소드를 호출.
		 * super()	 : 생성자 내부에서 사용. 생성자 첫 라인에 위치, 부모 객체의 생성자를 호출 할 때 사용.
		 */
		
		
	}

}
