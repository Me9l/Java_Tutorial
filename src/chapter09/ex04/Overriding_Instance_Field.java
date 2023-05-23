package chapter09.ex04;

class A {
	// instance field
	public int a = 111;
	
	// instance method
	void print() {
		System.out.println(" A - print()");
	}
}

class B extends A {
	int a = 222;

	// Override instance method
	void print() {
		System.out.println(" B - print()");
//		System.out.println(super.a);
	}
	
	
}

public class Overriding_Instance_Field {
	public static void main(String[] args) {
		/*
		 * Inheritance Notice
		 * - 상속은 부모 클래스의 필드(instance,static),메소드(instance,static),이너클래스 를 상속받는다.
		 * 		- 생성자는 상속되지 않는다.
		 * 		- 오버라이딩은 인스턴스 메소드만 오버라이드 된다.
		 * 		- 인스턴스필드, 정적필드, 정적 메소드는 오버라이딩 되지 않는다.
		 * 
		 * - 필드와 메소드 메모리 저장 위치
		 * 		- instance field : Heap 영역에 저장, 부모 field, 자식 field 별개의 공간에 저장. ( Override 되지 않음 )
		 * 		- static field : class 영역에 저장, 부모 field, 자식 field 별개의 공간에 저장. ( Override 되지 않음 )
		 * 		- instance method : instance method 영역에 저장, Override 할 수 있다.
		 * 		- static method : class 영역에 저장, 부모, 자식 별개의 공간에 저장. ( Override 되지 않음 )
		 */
		
		A a1 = new B();
		System.out.println(a1.a);	// 111
		a1.print();					// Override 된 B의 print();
		
		B b1 = (B) a1;
		System.out.println(b1.a);	// 222
		
		A a2 = new A();
		System.out.println(a2.a);	// 111
		a2.print();					// A 의 print();
		
	}
}
