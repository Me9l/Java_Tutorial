package chapter11.ex06;

interface A {
	void a();
	void b();
	// default method
	default void c() {
		System.out.println("Interface A, c()");
	}
	// static method
	static void d() {
		System.out.println("static method");
	}
}

class Aa implements A {

	@Override
	public void a() {
		System.out.println("interface A, a() > class Aa override ");
	}

	@Override
	public void b() {
		System.out.println("interface A, b() > class Aa override ");
	}
	
}

class Aaa implements A {

	@Override
	public void a() {
		System.out.println("interface A, a() > class Aaa override ");
	}

	@Override
	public void b() {
		System.out.println("interface A, b() > class Aaa override ");
	}

	@Override
	public void c() {
		A.super.c();
	}
	
}


public class Default_Method {
	public static void main(String[] args) {
		/*
		 * 인터페이스의 특징
		 *  - 모든 필드, 메소드는 public 접근 제어자
		 *  - 필드에 public static final 생략됨.
		 *  - 메소드에 public abstract 생략됨.
		 *  - 인터페이스 내부 메소드는 선언만 되고 구현은 하지 않는다. ( 자바 1.7까지 )
		 *  	- default / static < 구현 가능 ( 자바 1.8 부터 )
		 *  		- default : 인터페이스에 구현부가 있는 메소드
		 *  			- 인터페이스에서 구현된 모든 클래스에게 상속되어서 적용.
		 *  			- 오버라이딩 가능.
		 *  		- static : 인터페이스 내에서 메소드 이름 앞에 붙여서
		 */
		A a1 = new Aa();
		A a2 = new Aaa();
		a1.a();
		a1.b();
		a1.c();
		a2.a();
		a2.b();
		a2.c();
		
		// Interface의 static method 호출
		A.d();
	}
}
