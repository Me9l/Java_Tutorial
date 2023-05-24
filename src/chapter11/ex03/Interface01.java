package chapter11.ex03;

// 1. 정식 표현법
interface A {
	// field
	public static final int a = 3;
	// method
	public abstract void b();
//	static void c() {};
//	default void d() {};
}

// 인터페이스에 정의되지 않은 메소드 구현
class Aa implements A {
	@Override
	public void b() {
		System.out.println("Interface A 의 구현되지 않은 메소드를 Aa 에서 Override 해서 구현.");
	}
}


// 2. 약식 표현
interface B {
	int a = 5;		// public static final 생략 가능.
	void b();		// 구현부가 없기때문에 클래스에서는 abstract를 쓰지만 인터페이스에서는 생략 할 수있다.
}

class Bb implements B {
	@Override
	public void b() {
		int a = A.a;
		System.out.println(a);
	}
	
}

public class Interface01 {

	public static void main(String[] args) {
		/*
		 * Interface : 내부와 외부를 연결시켜주는 역할. * API ( Application Programming Interface ) : API 를 통해 다양한 서비스를 사용할 수 있다.
		 * - field , method 에 public 접근 제어 허용.
		 * - 모든 field 는 public static final 이 생략 되어있다.
		 * - 모든 method 는 public abstract 가 생략되어 있다.
		 * - ( Interface의 모든 접근제어자는 public )
		 * 		ㄴ 예외 : default, static 메소드는 제외.
		 * - 인터페이스는 객체화 할 수 없다. ( 타입 지정 가능 )
		 * - extends 는 하나만 상속 가능. ( 다중 상속 불가능 )
		 * - implements 는 여러개의 인터페이스 사용 가능. ( 다중 상속 가능 )
		 * - 인터페이스를 활용하면 결합도가 낮아져서 유지보수의 편의성이 증가한다.
		 * - 인터페이스에서 선언된 메소드를 클래스에서 구현.
		 */
		
		// 1. 인터페이스는 객체화 할 수 없다.
//		A a = new A();
		
		// 2. 인터페이스를 구현한 클래스를 객체화 해서 타입 지정.
		A aa = new Aa();
		aa.b();
		
	}

}
