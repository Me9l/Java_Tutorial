package chapter11.ex01;

abstract class A {
	// instance field
	int a ;
	int b ;
	
	// method
	void p() {
		System.out.println("A - p()");
	};
	
	// abstract method
	abstract void ab();
}

class B extends A { // 콘크리트 클래스 : 추상 클래스의 추상 메소드를 구현하는 클래스
	@Override
	void ab() {
		System.out.println("concrete class (B)에서 오버라이드 한 ab()");
	}
}

class C extends A {
	@Override
	void ab() {;
		System.out.println("concrete class (C)에서 오버라이드 한 ab()");
	}
}
class D extends A {
	@Override
	void ab() {
		System.out.println("concrete class (D)에서 오버라이드 한 ab()");
	}
}
class E extends D {
	void ab() {
		System.out.println("EEE");
	}
}

public class Abstract_Method01 {
	public static void main(String[] args) {
		/*
		 * 추상 메소드 ( Abstract Method )
		 * 	- 구현부(스코프 {}) 가 존재하지 않는 메소드 : abstract void methodName() ;
		 * 	- 클래스 안에 abstract method 가 하나라도 존재하면 클래스도 abstract class.
		 *  - 자식 클래스 에서 추상클래스에 선언된 추상 메소드를 오버라이드 해서 구현해야 한다.
		 *  - 추상 클래스는 객체를 생성 할 수 없다. 자식 클래스를 객체화 해서 타입지정은 가능 하다.
		 *  - 프로젝트 설계시 메소드명을 프로그래머가 임의로 설정하지 못하도록 할 수 있다. (PM 설계)
		 *  - 유지보수의 편의성이 있다. ( 낮은 결합도 )
		 */
		
		// 1. 추상 클래스 : 추상메소드를 포함하는 클래스
//		A a = new A();	// 추상클래스는 객체화 하지 못한다.
		
		// 2. 타입 지정은 가능하다. (자식을 객체화해서 부모타입으로 지정)
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		
		// 3. 부모의 추상 메소드를 실행하면 overriding 된 자식 클래스의 메소드가 실행.
		a1.ab();
		a2.ab();
		a3.ab();
		System.out.println("--------------");
		
		A[] arr = new A[] {a1,a2,a3};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].ab();
		}
		System.out.println("--------------");
		
		for (A i : arr) {
			i.ab();
		}
		
	}
}