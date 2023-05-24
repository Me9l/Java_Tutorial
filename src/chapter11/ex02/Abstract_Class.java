package chapter11.ex02;

// 1. concrete class 생성 후 사용.
abstract class A {
	abstract void oil();
}

class B extends A {
	@Override
	void oil() {
		System.out.println("class B 에서 구현한 oil()");
	}
	void drive() {
		System.out.println("B - drive()");
	}
}

// 2. 익명 클래스로 사용.
abstract class C {
	abstract void oil();
}

abstract class D {
	abstract void d();
	abstract void e();
}

public class Abstract_Class {
	public static void main(String[] args) {
		/*
		 * 추상 클래스 ( abstract class )
		 * 	- 추상 메소드를 포함한 클래스.
		 *  - 객체화 불가능. 자식 클래스를 객체화해서 타입으로 지정 가능.
		 *  	- 1. 자식클래스 에서 상속,구현(concrete class) 후 자식클래스를 객체화.
		 *  	- 2. 콘크리트 클래스 없이 익명 클래스를 만들어서 사용.
		 *  		- 일회성으로 주로 사용. (ex : 안드로이드 개발시 이벤트 처리.)
		 */
		
		// 1. 구현 클래스를 객체화 하여 사용.
		A a = new B();
		a.oil();
		
		// 2. 익명 클래스 생성 하여 사용.
		C c = new C() {
				@Override
				void oil() {
					System.out.println("객체화하면서 oil()을 정의. (익명 클래스)");
				}
			};
		c.oil();

		D d1 = new D() {

			@Override
			void d() {
				System.out.println("D 를 객체화 하면서 d() 오버라이드");
			}
			@Override
			void e() {
				System.out.println("D 를 객체화 하면서 e() 오버라이드");				
			}
		};
		
	}
}
